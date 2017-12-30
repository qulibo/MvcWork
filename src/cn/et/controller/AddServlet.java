package cn.et.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.et.model.Article;
import cn.et.model.ArticleDao;

public class AddServlet extends HttpServlet {

	ArticleDao dao = new ArticleDao();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		System.out.println(11);
		Article art = new Article();
		art.setTitle(title);
		art.setContent(content);
		try {
			dao.insert(art);
			request.getRequestDispatcher("/listAll").forward(request, response);
			//response.sendRedirect(request.getContextPath()+"/listAll");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
