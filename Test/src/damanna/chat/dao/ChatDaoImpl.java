package damanna.chat.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import damanna.util.SqlMapClientFactory;
import damanna.vo.ChatVO;

public class ChatDaoImpl implements IChatDao {
	private static ChatDaoImpl dao;
	private SqlMapClient smc;
	
	private ChatDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	public static ChatDaoImpl getInstance() {
		if(dao==null)dao = new ChatDaoImpl();
		return dao;
	}
	
	
	
	@Override
	public int insertChat(ChatVO chatVo) {
		int cnt = 0;
		try {
			Object obj = smc.insert("chat.insertChat", chatVo);
			if(obj==null) cnt=1;
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

}
