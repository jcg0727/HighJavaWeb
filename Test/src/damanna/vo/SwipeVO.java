package damanna.vo;

public class SwipeVO {
	private String memberId;
	private String memberPartner;
	private int matchNy;
	private String likeDate;
	private String likeRank;

	public SwipeVO(String memberId, String memberPartner, int matchNy, String likeDate, String likeRank) {
		super();
		this.memberId = memberId;
		this.memberPartner = memberPartner;
		this.matchNy = matchNy;
		this.likeDate = likeDate;
		this.likeRank = likeRank;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPartner() {
		return memberPartner;
	}

	public void setMemberPartner(String memberPartner) {
		this.memberPartner = memberPartner;
	}

	public int getMatchNy() {
		return matchNy;
	}

	public void setMatchNy(int matchNy) {
		this.matchNy = matchNy;
	}

	public String getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(String likeDate) {
		this.likeDate = likeDate;
	}

	public String getLikeRank() {
		return likeRank;
	}

	public void setLikeRank(String likeRank) {
		this.likeRank = likeRank;
	}

}
