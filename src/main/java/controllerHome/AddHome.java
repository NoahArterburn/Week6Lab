package controllerHome;

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

/**
 * Servlet implementation class AddHome
 */
@WebServlet("/addHome")
public class AddHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Home t = new Home();
		HomeHelper helper = new HomeHelper();
		t.setName(request.getParameter("name"));
		t.setLocation(request.getParameter("location"));
		helper.persist(t);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
