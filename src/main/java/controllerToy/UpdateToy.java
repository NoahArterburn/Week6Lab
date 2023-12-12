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
 * Servlet implementation class UpdateToy
 */
@WebServlet("/updateToy")
public class UpdateToy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateToy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ToyHelper helper = new ToyHelper();
		
		String oldName = request.getParameter("oldName");
		String commonName = request.getParameter("commonName");
		String storeName = request.getParameter("storeName");
		Double size = Double.valueOf(request.getParameter("size"));

		Toy toyToUpdate = helper.searchToyByName(oldName);
		toyToUpdate.setCommonName(commonName);
		toyToUpdate.setStoreName(storeName);
		toyToUpdate.setSize(size);
		helper.update(toyToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}
}

