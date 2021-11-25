package damanna.ad.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import damanna.ad.service.AdServiceImpl;
import damanna.ad.service.IAdService;
import damanna.vo.AdVO;


@WebServlet("/ad/AdList.do")
public class AdListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IAdService service = AdServiceImpl.getInstance();
		List<AdVO> adList = service.getAllAdList();
		request.setAttribute("AdList", adList);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/ad/adList.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
