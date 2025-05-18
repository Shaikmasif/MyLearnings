package com.springmvc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {

	@RequestMapping("/upload")
	public String upload() {
		return "uploadFile";
	}
	
	@RequestMapping("/uploadFile")
	public String uploadFile(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m) {
		
		String fileName = file.getOriginalFilename();
		Long size = file.getSize();
		String desc = file.getStorageDescription();
		System.out.println(fileName+ " "+size+" "+desc);
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+fileName;
		System.out.println(path);
		try {
			InputStream is = file.getInputStream();
			byte[] data = new byte[is.available()];
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			m.addAttribute("msg","File Uploaded Successfully...");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m.addAttribute("msg","Error while uploading file...");
		}
		m.addAttribute("fileName",fileName);
		
		return "uploadFileResult";
	}
}
