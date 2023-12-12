package controllerHome;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import helpers.HomeHelper;
import helpers.ToyHelper;
import models.Home;
import models.Toy;

@WebServlet("/showHome")
public class ShowHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HomeHelper helper = new HomeHelper();
		
		List<Home> homeList = helper.showAllHomes();

		request.setAttribute("allHomes", homeList);
		
		String path = "/showHome.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
