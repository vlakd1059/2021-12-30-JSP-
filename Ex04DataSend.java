package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataSend")
public class Ex04DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		System.out.println("������ ��û�� ����...");

		// ����ڰ� �Է��� ������ ��������
		String data = request.getParameter("data");
		System.out.println("���޹��� �� : " + data);

		out.print("<html><head><title>������</title></head>");
		out.print("<body>�������� ���� �� : " + data + "</body></html>");

	}
}
