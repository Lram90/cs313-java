/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowList
 */
@WebServlet("/Show")
public class Show extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet() */
    public Show() {
        super(); // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       String user = request.getParameter("ses_uName");
       FileHandler handler = new FileHandler("discussion2.txt", user);
       List <String> list = handler.getPosts();
       List<String> copy = list.subList(0, list.size());
        Collections.reverse(copy);
       
    request.setAttribute("discussion", copy);
    request.getRequestDispatcher("viewPost.jsp").forward(request, response);
}
}
