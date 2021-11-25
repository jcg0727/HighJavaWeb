package damanna.ad.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import damanna.util.SqlMapClientFactory;
import damanna.vo.AdVO;

public class AdDaoImpl implements IAdDao {
	private static AdDaoImpl dao;
	private SqlMapClient smc;
	
	private AdDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static AdDaoImpl getInstance() {
		if(dao==null) dao = new AdDaoImpl();
		return dao;
	}
	
	
	
	@Override
	public AdVO getAd(String ad_code) {
		AdVO adVo = null;
		try {
			adVo = (AdVO) smc.queryForObject("ad.getAd", ad_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adVo;
	}

	@Override
	public List<AdVO> getAllAdList() {
		List<AdVO> adList = new ArrayList<>();
		try {
			adList = smc.queryForList("ad.getAllAd");
		} catch (SQLException e) {
			adList = null;
			e.printStackTrace();
		}
		return adList;
	}

}
