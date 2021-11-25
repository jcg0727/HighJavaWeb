package damanna.vo;

public class CityBoard {
	private int cityBoardid;
	private String memberId;
	private int cityCode;
	private String cityCategory;
	private String cityTitle;
	private String cityDate;
	private String cityContent;
	private int cityCount;
	private String cityFile1;
	private String cityFile2;
	private String cityFile3;
	private String cityReport;
	private String cityDrop;

	public CityBoard(int cityBoardid, String memberId, int cityCode, String cityCategory, String cityTitle,
			String cityDate, String cityContent, int cityCount, String cityFile1, String cityFile2, String cityFile3,
			String cityReport, String cityDrop) {
		super();
		this.cityBoardid = cityBoardid;
		this.memberId = memberId;
		this.cityCode = cityCode;
		this.cityCategory = cityCategory;
		this.cityTitle = cityTitle;
		this.cityDate = cityDate;
		this.cityContent = cityContent;
		this.cityCount = cityCount;
		this.cityFile1 = cityFile1;
		this.cityFile2 = cityFile2;
		this.cityFile3 = cityFile3;
		this.cityReport = cityReport;
		this.cityDrop = cityDrop;
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

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityCategory() {
		return cityCategory;
	}

	public void setCityCategory(String cityCategory) {
		this.cityCategory = cityCategory;
	}

	public String getCityTitle() {
		return cityTitle;
	}

	public void setCityTitle(String cityTitle) {
		this.cityTitle = cityTitle;
	}

	public String getCityDate() {
		return cityDate;
	}

	public void setCityDate(String cityDate) {
		this.cityDate = cityDate;
	}

	public String getCityContent() {
		return cityContent;
	}

	public void setCityContent(String cityContent) {
		this.cityContent = cityContent;
	}

	public int getCityCount() {
		return cityCount;
	}

	public void setCityCount(int cityCount) {
		this.cityCount = cityCount;
	}

	public String getCityFile1() {
		return cityFile1;
	}

	public void setCityFile1(String cityFile1) {
		this.cityFile1 = cityFile1;
	}

	public String getCityFile2() {
		return cityFile2;
	}

	public void setCityFile2(String cityFile2) {
		this.cityFile2 = cityFile2;
	}

	public String getCityFile3() {
		return cityFile3;
	}

	public void setCityFile3(String cityFile3) {
		this.cityFile3 = cityFile3;
	}

	public String getCityReport() {
		return cityReport;
	}

	public void setCityReport(String cityReport) {
		this.cityReport = cityReport;
	}

	public String getCityDrop() {
		return cityDrop;
	}

	public void setCityDrop(String cityDrop) {
		this.cityDrop = cityDrop;
	}

}
