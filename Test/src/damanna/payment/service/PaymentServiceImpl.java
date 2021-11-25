package damanna.payment.service;

import damanna.payment.dao.IPaymentDao;
import damanna.payment.dao.PaymentDaoImpl;
import damanna.vo.PaymentVO;

public class PaymentServiceImpl implements IPaymentService {
	private IPaymentDao payDao;
	
	private static PaymentServiceImpl service;
	
	private PaymentServiceImpl() {
		payDao = PaymentDaoImpl.getInstance();
	}
	public static PaymentServiceImpl getInstance() {
		if(service==null) service = new PaymentServiceImpl();
		return service;
	}
	
	
	
	@Override
	public int insertPayment(PaymentVO payVo) {
		return payDao.insertPayment(payVo);
	}

}
