package damanna.payment.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import damanna.payment.service.IPaymentService;
import damanna.payment.service.PaymentServiceImpl;
import damanna.vo.PaymentVO;


@WebServlet("/paymentInsert.do")
public class PaymentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("utf-8");
	String payCode = request.getParameter("code");
	String payId = request.getParameter("id");
	String payAmount = request.getParameter("amount");
	
	PaymentVO payvo = new PaymentVO();
	payvo.setPayment_code(payCode);
	payvo.setMember_id(payId);
	payvo.setPayment_amount(payAmount);
	
	IPaymentService service = PaymentServiceImpl.getInstance();
	service.insertPayment(payvo);

	}

	
	
	
	
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
