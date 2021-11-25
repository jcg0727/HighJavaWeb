package damanna.vo;

import javax.websocket.Session;

public class ChatVO {
	private String chat_id;
	private int chat_no;
	private String member_id;
	private String member_partner;
	private String chat_content;
	private String chat_time;
	private String chat_state;
	private String chat_delny;
	private String chat_filetype;
	private String chat_fileroute;
	private Session session;
	
	
	public ChatVO(String chat_id, int chat_no, String member_id, String member_partner, String chat_content,
			String chat_time, String chat_state, String chat_delny, String chat_filetype, String chat_fileroute,
			Session session) {
		super();
		this.chat_id = chat_id;
		this.chat_no = chat_no;
		this.member_id = member_id;
		this.member_partner = member_partner;
		this.chat_content = chat_content;
		this.chat_time = chat_time;
		this.chat_state = chat_state;
		this.chat_delny = chat_delny;
		this.chat_filetype = chat_filetype;
		this.chat_fileroute = chat_fileroute;
		this.session = session;
	}
	public String getChat_id() {
		return chat_id;
	}
	public void setChat_id(String chat_id) {
		this.chat_id = chat_id;
	}
	public int getChat_no() {
		return chat_no;
	}
	public void setChat_no(int chat_no) {
		this.chat_no = chat_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_partner() {
		return member_partner;
	}
	public void setMember_partner(String member_partner) {
		this.member_partner = member_partner;
	}
	public String getChat_content() {
		return chat_content;
	}
	public void setChat_content(String chat_content) {
		this.chat_content = chat_content;
	}
	public String getChat_time() {
		return chat_time;
	}
	public void setChat_time(String chat_time) {
		this.chat_time = chat_time;
	}
	public String getChat_state() {
		return chat_state;
	}
	public void setChat_state(String chat_state) {
		this.chat_state = chat_state;
	}
	public String getChat_delny() {
		return chat_delny;
	}
	public void setChat_delny(String chat_delny) {
		this.chat_delny = chat_delny;
	}
	public String getChat_filetype() {
		return chat_filetype;
	}
	public void setChat_filetype(String chat_filetype) {
		this.chat_filetype = chat_filetype;
	}
	public String getChat_fileroute() {
		return chat_fileroute;
	}
	public void setChat_fileroute(String chat_fileroute) {
		this.chat_fileroute = chat_fileroute;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	
	
	

}
