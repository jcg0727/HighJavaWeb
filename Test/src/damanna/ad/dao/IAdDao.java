package damanna.ad.dao;

import java.util.List;

import damanna.vo.AdVO;

public interface IAdDao {
	
	/**
	 * 광고 코드를 매개변수로 받아서 해당 ad코드의 정보를 가져오는 메서드
	 * @param adGode 가져올 광고코드
	 * @return 조건에 맞는 회원정보가 저장된 AdVO객체
	 */
	public AdVO getAd(String ad_code);
	
	/**
	 * DB의 광고테이블의 전체 레코드를 가져와서 List에 담아서 반환하는 메서드
	 * @return 검색된 데이터가 저장된 List객체
	 */
	public List<AdVO> getAllAdList();
}
