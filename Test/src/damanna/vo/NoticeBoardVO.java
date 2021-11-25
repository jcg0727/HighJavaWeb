package damanna.vo;

public class NoticeBoardVO {
	private int noticeId;
	private String adminId;
	private String noticeTitle;
	private String noticeDate;
	private String noticeContent;
	private int noticeCount;
	private String noticeDrop;

	public NoticeBoardVO(int noticeId, String adminId, String noticeTitle, String noticeDate, String noticeContent,
			int noticeCount, String noticeDrop) {
		super();
		this.noticeId = noticeId;
		this.adminId = adminId;
		this.noticeTitle = noticeTitle;
		this.noticeDate = noticeDate;
		this.noticeContent = noticeContent;
		this.noticeCount = noticeCount;
		this.noticeDrop = noticeDrop;
	}

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public int getNoticeCount() {
		return noticeCount;
	}

	public void setNoticeCount(int noticeCount) {
		this.noticeCount = noticeCount;
	}

	public String getNoticeDrop() {
		return noticeDrop;
	}

	public void setNoticeDrop(String noticeDrop) {
		this.noticeDrop = noticeDrop;
	}

}
