package controllerToy;

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
 * Servlet implementation class ShowToy
 */
@WebServlet("/showToy")
public class ShowToy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowToy() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ToyHelper helper = new ToyHelper();
		
		List<Toy> toyList = helper.showAllToys();

		request.setAttribute("allToys", toyList);
		
		String path = "/showToys.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
