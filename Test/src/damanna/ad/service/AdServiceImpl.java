package damanna.ad.service;

import java.util.List;

import damanna.ad.dao.AdDaoImpl;
import damanna.ad.dao.IAdDao;
import damanna.vo.AdVO;

public class AdServiceImpl implements IAdService {
	
	private IAdDao adDao;
	private static AdServiceImpl service;
	private AdServiceImpl() {
		adDao = AdDaoImpl.getInstance();
	}
	public static AdServiceImpl getInstance() {
		if(service==null) service = new AdServiceImpl();
		return service;
	}

	
	@Override
	public AdVO getAd(String ad_code) {
		return adDao.getAd(ad_code);
	}
	@Override
	public List<AdVO> getAllAdList() {
		return adDao.getAllAdList();
	}

}
