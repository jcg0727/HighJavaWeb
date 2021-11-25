package damanna.vo;

public class EventBoardVO {
	private int eventNo;
	private String eventTitle;
	private String eventDate;
	private String eventImg;
	private String eventSt;
	private String eventEnd;
	private int eventCount;
	private int eventCodecnt;
	private String eventDrop;
	private String adminId;

	public EventBoardVO(int eventNo, String eventTitle, String eventDate, String eventImg, String eventSt,
			String eventEnd, int eventCount, int eventCodecnt, String eventDrop, String adminId) {
		super();
		this.eventNo = eventNo;
		this.eventTitle = eventTitle;
		this.eventDate = eventDate;
		this.eventImg = eventImg;
		this.eventSt = eventSt;
		this.eventEnd = eventEnd;
		this.eventCount = eventCount;
		this.eventCodecnt = eventCodecnt;
		this.eventDrop = eventDrop;
		this.adminId = adminId;
	}

	public int getEventNo() {
		return eventNo;
	}

	public void setEventNo(int eventNo) {
		this.eventNo = eventNo;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventImg() {
		return eventImg;
	}

	public void setEventImg(String eventImg) {
		this.eventImg = eventImg;
	}

	public String getEventSt() {
		return eventSt;
	}

	public void setEventSt(String eventSt) {
		this.eventSt = eventSt;
	}

	public String getEventEnd() {
		return eventEnd;
	}

	public void setEventEnd(String eventEnd) {
		this.eventEnd = eventEnd;
	}

	public int getEventCount() {
		return eventCount;
	}

	public void setEventCount(int eventCount) {
		this.eventCount = eventCount;
	}

	public int getEventCodecnt() {
		return eventCodecnt;
	}

	public void setEventCodecnt(int eventCodecnt) {
		this.eventCodecnt = eventCodecnt;
	}

	public String getEventDrop() {
		return eventDrop;
	}

	public void setEventDrop(String eventDrop) {
		this.eventDrop = eventDrop;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

}
