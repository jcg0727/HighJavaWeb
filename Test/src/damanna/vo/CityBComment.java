package damanna.vo;

public class CityBComment {
	private String commentDrop;
	private String commentId;
	private int cityBoardid;
	private String memberId;
	private String commentDate;
	private String commentContent;
	private String commentReport;
	private String extendId;

	public CityBComment(String commentDrop, String commentId, int cityBoardid, String memberId, String commentDate,
			String commentContent, String commentReport, String extendId) {
		super();
		this.commentDrop = commentDrop;
		this.commentId = commentId;
		this.cityBoardid = cityBoardid;
		this.memberId = memberId;
		this.commentDate = commentDate;
		this.commentContent = commentContent;
		this.commentReport = commentReport;
		this.extendId = extendId;
	}

	public String getCommentDrop() {
		return commentDrop;
	}

	public void setCommentDrop(String commentDrop) {
		this.commentDrop = commentDrop;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public int getCityBoardid() {
		return cityBoardid;
	}

	public void setCityBoardid(int cityBoardid) {
		this.cityBoardid = cityBoardid;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentReport() {
		return commentReport;
	}

	public void setCommentReport(String commentReport) {
		this.commentReport = commentReport;
	}

	public String getExtendId() {
		return extendId;
	}

	public void setExtendId(String extendId) {
		this.extendId = extendId;
	}

}
