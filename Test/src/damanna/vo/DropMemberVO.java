package damanna.vo;

public class DropMemberVO {
	private String memberId;
	private String dropReason;
	private String dropDate;
	private String deleteDate;

	public DropMemberVO(String memberId, String dropReason, String dropDate, String deleteDate) {
		super();
		this.memberId = memberId;
		this.dropReason = dropReason;
		this.dropDate = dropDate;
		this.deleteDate = deleteDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getDropReason() {
		return dropReason;
	}

	public void setDropReason(String dropReason) {
		this.dropReason = dropReason;
	}

	public String getDropDate() {
		return dropDate;
	}

	public void setDropDate(String dropDate) {
		this.dropDate = dropDate;
	}

	public String getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}

}
