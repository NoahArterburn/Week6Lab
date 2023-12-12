package controllerToy;

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
 * Servlet implementation class AddToy
 */
@WebServlet("/addToy")
public class AddToy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Toy t = new Toy();
		ToyHelper helper = new ToyHelper();
		t.setCommonName(request.getParameter("commonName"));
		t.setStoreName(request.getParameter("storeName"));
		t.setSize(Double.valueOf(request.getParameter("size")));
		t.getHome().setName(request.getParameter("homeName"));
		helper.persist(t);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
