package damanna.vo;

public class ReviewBoardVO {
	private int reviewId;
	private String reviewTitle;
	private String memberId;
	private String reviewDate;
	private String reviewContent;
	private int reviewCount;
	private int reviewLike;
	private int reviewDis;
	private String reviewFile1;
	private String reviewFile2;
	private String reviewFile3;
	private String reviewDrop;

	public ReviewBoardVO(int reviewId, String reviewTitle, String memberId, String reviewDate, String reviewContent,
			int reviewCount, int reviewLike, int reviewDis, String reviewFile1, String reviewFile2, String reviewFile3,
			String reviewDrop) {
		super();
		this.reviewId = reviewId;
		this.reviewTitle = reviewTitle;
		this.memberId = memberId;
		this.reviewDate = reviewDate;
		this.reviewContent = reviewContent;
		this.reviewCount = reviewCount;
		this.reviewLike = reviewLike;
		this.reviewDis = reviewDis;
		this.reviewFile1 = reviewFile1;
		this.reviewFile2 = reviewFile2;
		this.reviewFile3 = reviewFile3;
		this.reviewDrop = reviewDrop;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public int getReviewLike() {
		return reviewLike;
	}

	public void setReviewLike(int reviewLike) {
		this.reviewLike = reviewLike;
	}

	public int getReviewDis() {
		return reviewDis;
	}

	public void setReviewDis(int reviewDis) {
		this.reviewDis = reviewDis;
	}

	public String getReviewFile1() {
		return reviewFile1;
	}

	public void setReviewFile1(String reviewFile1) {
		this.reviewFile1 = reviewFile1;
	}

	public String getReviewFile2() {
		return reviewFile2;
	}

	public void setReviewFile2(String reviewFile2) {
		this.reviewFile2 = reviewFile2;
	}

	public String getReviewFile3() {
		return reviewFile3;
	}

	public void setReviewFile3(String reviewFile3) {
		this.reviewFile3 = reviewFile3;
	}

	public String getReviewDrop() {
		return reviewDrop;
	}

	public void setReviewDrop(String reviewDrop) {
		this.reviewDrop = reviewDrop;
	}

}
