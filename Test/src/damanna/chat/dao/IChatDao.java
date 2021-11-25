package damanna.chat.dao;

import damanna.vo.ChatVO;

public interface IChatDao {

	/**
	 * chatVO에 담겨진 데이터를 db에 insert하는 메서드
	 * @param chatVo dbd에 insert할 자료가 저장될 chatVO객체
	 * @return
	 */
	public int insertChat(ChatVO chatVo);
}
