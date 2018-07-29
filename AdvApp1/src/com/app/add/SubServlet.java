package com.app.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
	/*	int k = (int) req.getAttribute("k");
		
		PrintWriter out = res.getWriter();
		out.println("hello everyOne in subservlet");
		out.println(k);*/
		
		int k = Integer.parseInt(req.getParameter("k"));
		k = k*k;

		PrintWriter out = res.getWriter();
		out.println(k);
		out.println("result is "+k);
		System.out.println("sub called");
	}
}
