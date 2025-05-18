package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Servlet implementation class ImageServlet
 */
@MultipartConfig
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part part = request.getPart("image");
		String fileName = part.getSubmittedFileName();
		InputStream is = part.getInputStream();
		byte []arr = new byte[is.available()];
		is.read(arr);
		
		String path =getServletContext().getRealPath("/")+"img"+File.separator+fileName;
		System.out.println(path);
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(arr);
		fos.flush();
		fos.close();
		System.out.println("File uploaded");
				
	}

}
