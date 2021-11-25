package damanna.vo;

public class ProfileReportVO {
	private String reportId;
	private String memberReported;
	private String memberId;
	private String blackReason;
	private String blackDate;

	public ProfileReportVO(String reportId, String memberReported, String memberId, String blackReason,
			String blackDate) {
		super();
		this.reportId = reportId;
		this.memberReported = memberReported;
		this.memberId = memberId;
		this.blackReason = blackReason;
		this.blackDate = blackDate;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getMemberReported() {
		return memberReported;
	}

	public void setMemberReported(String memberReported) {
		this.memberReported = memberReported;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getBlackReason() {
		return blackReason;
	}

	public void setBlackReason(String blackReason) {
		this.blackReason = blackReason;
	}

	public String getBlackDate() {
		return blackDate;
	}

	public void setBlackDate(String blackDate) {
		this.blackDate = blackDate;
	}

}
