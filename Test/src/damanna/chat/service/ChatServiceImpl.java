package damanna.chat.service;

import damanna.chat.dao.ChatDaoImpl;
import damanna.chat.dao.IChatDao;
import damanna.vo.ChatVO;

public class ChatServiceImpl implements IChatService {
	private IChatDao chatDao;
	private static ChatServiceImpl service;
	private ChatServiceImpl() {
		chatDao = ChatDaoImpl.getInstance();
	}
	public static ChatServiceImpl getInstance() {
		if(service==null) service = new ChatServiceImpl();
		return service;
	}
	
	
	
	@Override
	public int insertChat(ChatVO chatVo) {
		return chatDao.insertChat(chatVo);
	}

}
