package damanna.vo;

public class MemberVO {
	private int cityCode;
	private String memberId;
	private String memberPw;
	private String memberNm;
	private String memberBir;
	private String membmerMail;
	private String memberHp;
	private String memberGen;
	private String memberImg1;
	private String memberImg2;
	private String matchType;
	private String memberHobby;
	private String profileIntro;
	private String memberInsta;
	private String profileMusic;
	private String memJoin;
	private String approveNy;
	private String memRej;
	private String membershipYn;

	// 기본 생성자
	public MemberVO() {
	}

	// 회원 가입을 위한 생성자, DEFAULT 값이 있는 경우 자동입력되게 함
	public MemberVO(int cityCode, String memberId, String memberPw, String memberNm, String memberBir,
			String membmerMail, String memberHp, String memberGen, String memberImg1, String memberImg2,
			String matchType, String memberHobby, String profileIntro, String memberInsta, String profileMusic) {
		super();
		this.cityCode = cityCode;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberNm = memberNm;
		this.memberBir = memberBir;
		this.membmerMail = membmerMail;
		this.memberHp = memberHp;
		this.memberGen = memberGen;
		this.memberImg1 = memberImg1;
		this.memberImg2 = memberImg2;
		this.matchType = matchType;
		this.memberHobby = memberHobby;
		this.profileIntro = profileIntro;
		this.memberInsta = memberInsta;
		this.profileMusic = profileMusic;
	}

	public MemberVO(int cityCode, String memberId, String memberPw, String memberNm, String memberBir,
			String membmerMail, String memberHp, String memberGen, String memberImg1, String memberImg2,
			String matchType, String memberHobby, String profileIntro, String memberInsta, String profileMusic,
			String memJoin, String approveNy, String memRej, String membershipYn) {
		super();
		this.cityCode = cityCode;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberNm = memberNm;
		this.memberBir = memberBir;
		this.membmerMail = membmerMail;
		this.memberHp = memberHp;
		this.memberGen = memberGen;
		this.memberImg1 = memberImg1;
		this.memberImg2 = memberImg2;
		this.matchType = matchType;
		this.memberHobby = memberHobby;
		this.profileIntro = profileIntro;
		this.memberInsta = memberInsta;
		this.profileMusic = profileMusic;
		this.memJoin = memJoin;
		this.approveNy = approveNy;
		this.memRej = memRej;
		this.membershipYn = membershipYn;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberNm() {
		return memberNm;
	}

	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}

	public String getMemberBir() {
		return memberBir;
	}

	public void setMemberBir(String memberBir) {
		this.memberBir = memberBir;
	}

	public String getMembmerMail() {
		return membmerMail;
	}

	public void setMembmerMail(String membmerMail) {
		this.membmerMail = membmerMail;
	}

	public String getMemberHp() {
		return memberHp;
	}

	public void setMemberHp(String memberHp) {
		this.memberHp = memberHp;
	}

	public String getMemberGen() {
		return memberGen;
	}

	public void setMemberGen(String memberGen) {
		this.memberGen = memberGen;
	}

	public String getMemberImg1() {
		return memberImg1;
	}

	public void setMemberImg1(String memberImg1) {
		this.memberImg1 = memberImg1;
	}

	public String getMemberImg2() {
		return memberImg2;
	}

	public void setMemberImg2(String memberImg2) {
		this.memberImg2 = memberImg2;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getMemberHobby() {
		return memberHobby;
	}

	public void setMemberHobby(String memberHobby) {
		this.memberHobby = memberHobby;
	}

	public String getProfileIntro() {
		return profileIntro;
	}

	public void setProfileIntro(String profileIntro) {
		this.profileIntro = profileIntro;
	}

	public String getMemberInsta() {
		return memberInsta;
	}

	public void setMemberInsta(String memberInsta) {
		this.memberInsta = memberInsta;
	}

	public String getProfileMusic() {
		return profileMusic;
	}

	public void setProfileMusic(String profileMusic) {
		this.profileMusic = profileMusic;
	}

	public String getMemJoin() {
		return memJoin;
	}

	public void setMemJoin(String memJoin) {
		this.memJoin = memJoin;
	}

	public String getApproveNy() {
		return approveNy;
	}

	public void setApproveNy(String approveNy) {
		this.approveNy = approveNy;
	}

	public String getMemRej() {
		return memRej;
	}

	public void setMemRej(String memRej) {
		this.memRej = memRej;
	}

	public String getMembershipYn() {
		return membershipYn;
	}

	public void setMembershipYn(String membershipYn) {
		this.membershipYn = membershipYn;
	}

}
