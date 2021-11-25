package damanna.ad.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import damanna.ad.service.AdServiceImpl;
import damanna.ad.service.IAdService;
import damanna.vo.AdVO;


@WebServlet("/adView.do")
public class AdViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String adCode = request.getParameter("ad_code");
	
		IAdService service = AdServiceImpl.getInstance();
		
		AdVO adVo = service.getAd(adCode);
		request.setAttribute("adVo", adVo);
		
		request.getRequestDispatcher("/WEB-INF/ad/adView.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
