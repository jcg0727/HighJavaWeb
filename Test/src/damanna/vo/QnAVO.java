package damanna.vo;

public class QnAVO {
	private int qnaNo;
	private String memberId;
	private String questionDate;
	private String qnaTitle;
	private String qnaContent;
	private String qnaAnswer;
	private String qnaNy;
	private String answerDate;
	private String adminId;

	public QnAVO(int qnaNo, String memberId, String questionDate, String qnaTitle, String qnaContent, String qnaAnswer,
			String qnaNy, String answerDate, String adminId) {
		super();
		this.qnaNo = qnaNo;
		this.memberId = memberId;
		this.questionDate = questionDate;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.qnaAnswer = qnaAnswer;
		this.qnaNy = qnaNy;
		this.answerDate = answerDate;
		this.adminId = adminId;
	}

	public int getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getQuestionDate() {
		return questionDate;
	}

	public void setQuestionDate(String questionDate) {
		this.questionDate = questionDate;
	}

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public String getQnaContent() {
		return qnaContent;
	}

	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}

	public String getQnaAnswer() {
		return qnaAnswer;
	}

	public void setQnaAnswer(String qnaAnswer) {
		this.qnaAnswer = qnaAnswer;
	}

	public String getQnaNy() {
		return qnaNy;
	}

	public void setQnaNy(String qnaNy) {
		this.qnaNy = qnaNy;
	}

	public String getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

}
