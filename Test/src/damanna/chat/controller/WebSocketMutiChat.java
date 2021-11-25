package damanna.chat.controller;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//import javax.json.Json;
//import javax.json.JsonObject;
//import javax.json.JsonWriter;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;

import damanna.vo.ChatVO;

@ServerEndpoint("/websocktMultichat.do")
public class WebSocketMutiChat {
	
	//유저 집합 리스트
	static List<ChatVO> sessionUsers = Collections.synchronizedList(new ArrayList<ChatVO>());
	
	
	/**
	 * 웹 소켓이 접속되면 유저리스트에 세션을 넣는다.
	 * @param userSession 웹 소켓 세션
	 */
	@OnOpen
	public void handleOpen(Session userSession){
		ChatVO chatVo = new ChatVO("1", 0, null, null, null, null, null, null, null, null, userSession);
		sessionUsers.add(chatVo);
		System.out.println(userSession.getId() + "접속\n");
	}
	
	
	/**
	 * 웹 소켓으로부터 메시지가 오면 호출한다.
	 * @param message 메시지
	 * @param userSession
	 * @throws IOException
	 */
	@OnMessage
	public void handleMessage(String message, Session userSession) throws IOException{
		
		String username = (String)userSession.getUserProperties().get("username");
		
		//세션 프로퍼티에 username이 없으면 username을 선언하고 해당 세션으로 메시지를 보낸다.(json 형식이다.)
		//최초 메시지는 username설정
		if(username == null){
			for(ChatVO chatVo : sessionUsers){
				if(userSession.equals(chatVo.getSession())){
					chatVo.setMember_id(message);
					userSession.getUserProperties().put("username", message);
					userSession.getBasicRemote().sendText(buildJsonData("System", message + "님 연결 성공!!"));
					
					Iterator<ChatVO> iterator = sessionUsers.iterator();
					while(iterator.hasNext()){
						ChatVO chVo = iterator.next();
						if(!chVo.getSession().equals(chatVo.getSession())){
							chVo.getSession().getBasicRemote().sendText(buildJsonData("System",message + "님과 매칭!!"));
						}
					}					
					return;
				}
			}
		}
		
		sendToAll(username, message);
	}
	
	public void sendToAll(String username, String message) throws IOException{
		//username이 있으면 전체에게 메시지를 보낸다.
		Iterator<ChatVO> iterator = sessionUsers.iterator();
		while(iterator.hasNext()){
			iterator.next().getSession().getBasicRemote().sendText(buildJsonData(username,message));
		}
	}
	
	/**
	 * 웹소켓을 닫으면 해당 유저를 유저리스트에서 뺀다.
	 * @param userSession
	 
	 * @throws IOException */
	@OnClose
	public void handleClose(Session userSession) throws IOException{
		System.out.println(userSession.getId() + "접속 종료...");
		String delName = null;
		Iterator<ChatVO> chatIter = sessionUsers.iterator();
		while(chatIter.hasNext()){
			ChatVO chatVo = chatIter.next();
			if(userSession.equals(chatVo.getSession())){
				delName = chatVo.getMember_id();
				//sessionUsers.remove(chatVo);
				chatIter.remove();
			}
		}
			
		sendToAll("System", delName + "님이 퇴장했습니다.");

	}
	
	/**
     * 웹 소켓이 에러가 나면 호출되는 이벤트
     * @param t
     */
    @OnError
    public void handleError(Throwable t){
        t.printStackTrace();
    }
    
	
	/**
	 * json타입의 메시지 만들기
	 * @param username
	 * @param message
	 * @return
	 */
	public String buildJsonData(String username,String message){
		Gson gson = new Gson();
		Map<String, String> jsonMap = new HashMap<String, String>();
		jsonMap.put("message", username+" : "+message);
		String strJson = gson.toJson(jsonMap);
		//System.out.println("strJson = " + strJson);

		return strJson;
	}
}