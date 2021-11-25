package damanna.test;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import damanna.vo.AdminVO;

public class AdminIbatisTest {

	public static void main(String[] args) {
		try {
			Charset charset = Charset.forName("UTF-8");
			Resources.setCharset(charset);
			
			Reader rd = Resources.getResourceAsReader("damanna/config/sqlMapConfig.xml");
			
			SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
			
			rd.close();
			
			String adminId = "566asg566";
			String adminPw = "555saq65";
			
			AdminVO adminVo = new AdminVO();
			adminVo.setAdminId(adminId);
			adminVo.setAdminPw(adminPw);
			
			Object obj = smc.insert("admin.insertAdmin", adminVo);

			if (obj == null) {
				System.out.println("insert 작업 성공");
			} else {
				System.out.println("insert 작업 실패");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
