package damanna.vo;

public class PaymentVO {
	private String payment_code;
	private String member_id;
	private String payment_amount;
	private String event_code;
	private String payment_date;
	private String membership_end;
	
	public String getPayment_code() {
		return payment_code;
	}
	public void setPayment_code(String payment_code) {
		this.payment_code = payment_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getPayment_amount() {
		return payment_amount;
	}
	public void setPayment_amount(String payment_amount) {
		this.payment_amount = payment_amount;
	}
	public String getEvent_code() {
		return event_code;
	}
	public void setEvent_code(String event_code) {
		this.event_code = event_code;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public String getMembership_end() {
		return membership_end;
	}
	public void setMembership_end(String membership_end) {
		this.membership_end = membership_end;
	}

	
}
