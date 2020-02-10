package com.kh.mvc04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.kh.mvc04.validate.FileValidate;
import com.kh.mvc04.validate.UploadFile;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private FileValidate fileValidator;

	@RequestMapping(value = "/form")
	public String getUploadForm() {
		return "uploadForm";
	}

	@RequestMapping(value = "/upload")
	public String fileUpload(HttpServletRequest request, Model model, UploadFile uploadFile, BindingResult result) {
		// BindingResult - 객체를 Binding 하다가 에러가 발생하면 해당 에러의 정보를 받기 위해 사용된다.

		fileValidator.validate(uploadFile, result);

		if (result.hasErrors()) {
			return "uploadForm";
		}

		MultipartFile file = uploadFile.getFile();
		String filename = file.getOriginalFilename(); // 파일의 실제 이름

		UploadFile fileobj = new UploadFile();
		fileobj.setFilename(filename);
		fileobj.setDesc(uploadFile.getDesc());

		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {

			inputStream = file.getInputStream(); // 스트림 열어주기
			String path = WebUtils.getRealPath(request.getSession().getServletContext(), "/storage");

			System.out.println("업로드 될 실제 경로 : " + path);

			File storage = new File(path);
			if (!storage.exists()) {
				storage.mkdirs(); // 해당하는 위치에 디렉토리를 만들겠다
			}

			File newfile = new File(path + "/" + filename);
			if (!newfile.exists()) {
				newfile.createNewFile();
			}

			outputStream = new FileOutputStream(newfile);

			int read = 0;
			byte[] b = new byte[(int) file.getSize()];

			while ((read = inputStream.read(b)) != -1) {
				outputStream.write(b, 0, read);
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		model.addAttribute("fileobj", fileobj);

		return "uploadFile";
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

}
