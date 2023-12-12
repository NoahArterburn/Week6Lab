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

/**
 * Servlet implementation class UpdateHome
 */
@WebServlet("/updateHome")
public class UpdateHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HomeHelper helper = new HomeHelper();
		
		String oldName = request.getParameter("oldName");
		String name = request.getParameter("name");
		String location = request.getParameter("location");

		Home forestToUpdate = helper.searchHomeByName(oldName);
		forestToUpdate.setName(name);
		forestToUpdate.setLocation(location);
		helper.update(forestToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}


}
