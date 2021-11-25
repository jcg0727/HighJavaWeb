package damanna.vo;

public class CommentReportVO {
	private int coreportNo;
	private String memberId;
	private String coreportDate;
	private String coreportName;
	private String coreportContent;
	private String commentId;

	public CommentReportVO(int coreportNo, String memberId, String coreportDate, String coreportName,
			String coreportContent, String commentId) {
		super();
		this.coreportNo = coreportNo;
		this.memberId = memberId;
		this.coreportDate = coreportDate;
		this.coreportName = coreportName;
		this.coreportContent = coreportContent;
		this.commentId = commentId;
	}

	public int getCoreportNo() {
		return coreportNo;
	}

	public void setCoreportNo(int coreportNo) {
		this.coreportNo = coreportNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getCoreportDate() {
		return coreportDate;
	}

	public void setCoreportDate(String coreportDate) {
		this.coreportDate = coreportDate;
	}

	public String getCoreportName() {
		return coreportName;
	}

	public void setCoreportName(String coreportName) {
		this.coreportName = coreportName;
	}

	public String getCoreportContent() {
		return coreportContent;
	}

	public void setCoreportContent(String coreportContent) {
		this.coreportContent = coreportContent;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

}
