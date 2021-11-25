package damanna.vo;

public class BoardReportVO {
	private int boreportNo;
	private String memberId;
	private String boreportDate;
	private String boreportTitle;
	private String boreportContent;
	private int cityNo;
	private String reviewNo;

	public BoardReportVO(int boreportNo, String memberId, String boreportDate, String boreportTitle,
			String boreportContent, int cityNo, String reviewNo) {
		super();
		this.boreportNo = boreportNo;
		this.memberId = memberId;
		this.boreportDate = boreportDate;
		this.boreportTitle = boreportTitle;
		this.boreportContent = boreportContent;
		this.cityNo = cityNo;
		this.reviewNo = reviewNo;
	}

	public int getBoreportNo() {
		return boreportNo;
	}

	public void setBoreportNo(int boreportNo) {
		this.boreportNo = boreportNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getBoreportDate() {
		return boreportDate;
	}

	public void setBoreportDate(String boreportDate) {
		this.boreportDate = boreportDate;
	}

	public String getBoreportTitle() {
		return boreportTitle;
	}

	public void setBoreportTitle(String boreportTitle) {
		this.boreportTitle = boreportTitle;
	}

	public String getBoreportContent() {
		return boreportContent;
	}

	public void setBoreportContent(String boreportContent) {
		this.boreportContent = boreportContent;
	}

	public int getCityNo() {
		return cityNo;
	}

	public void setCityNo(int cityNo) {
		this.cityNo = cityNo;
	}

	public String getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(String reviewNo) {
		this.reviewNo = reviewNo;
	}

}
