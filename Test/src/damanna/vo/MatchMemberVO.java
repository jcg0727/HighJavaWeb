package damanna.vo;

public class MatchMemberVO {
	private String memberId;
	private String memberMatched;
	private String matchingDate;
	private String blockNy;

	public MatchMemberVO(String memberId, String memberMatched, String matchingDate, String blockNy) {
		super();
		this.memberId = memberId;
		this.memberMatched = memberMatched;
		this.matchingDate = matchingDate;
		this.blockNy = blockNy;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberMatched() {
		return memberMatched;
	}

	public void setMemberMatched(String memberMatched) {
		this.memberMatched = memberMatched;
	}

	public String getMatchingDate() {
		return matchingDate;
	}

	public void setMatchingDate(String matchingDate) {
		this.matchingDate = matchingDate;
	}

	public String getBlockNy() {
		return blockNy;
	}

	public void setBlockNy(String blockNy) {
		this.blockNy = blockNy;
	}

}
