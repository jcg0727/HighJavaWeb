package damanna.vo;

public class EventCodeVO {
	private int eventNo;
	private String eventCode;
	private String memberId;
	private String dcNy;

	public EventCodeVO(int eventNo, String eventCode, String memberId, String dcNy) {
		super();
		this.eventNo = eventNo;
		this.eventCode = eventCode;
		this.memberId = memberId;
		this.dcNy = dcNy;
	}

	public int getEventNo() {
		return eventNo;
	}

	public void setEventNo(int eventNo) {
		this.eventNo = eventNo;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getDcNy() {
		return dcNy;
	}

	public void setDcNy(String dcNy) {
		this.dcNy = dcNy;
	}

}
