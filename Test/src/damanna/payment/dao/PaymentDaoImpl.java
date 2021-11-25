package damanna.payment.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import damanna.util.SqlMapClientFactory;
import damanna.vo.PaymentVO;

public class PaymentDaoImpl implements IPaymentDao {
	private static PaymentDaoImpl dao;
	private SqlMapClient smc;
	
	private PaymentDaoImpl() {
		smc=SqlMapClientFactory.getSqlMapClient();
	}
	
	public static PaymentDaoImpl getInstance() {
		if(dao==null)dao = new PaymentDaoImpl();
		return dao;
	}
	
	
	
	@Override
	public int insertPayment(PaymentVO payVo) {
		int cnt = 0;
		try {
			Object obj = smc.insert("pay.insertPayment", payVo);
			if(obj==null) cnt=1;
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

}
