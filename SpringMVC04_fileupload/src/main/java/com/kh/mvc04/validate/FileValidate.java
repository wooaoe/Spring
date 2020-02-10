package com.kh.mvc04.validate;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

//유효성 검사
@Service
public class FileValidate implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return false;
	}

	@Override
	public void validate(Object uploadFile, Errors errors) {

		UploadFile file = (UploadFile) uploadFile;

		if (file.getFile().getSize() == 0) {
			errors.rejectValue("file", "errorCode", "Please select a file");
			// field에 대한 errorCode를 리턴

		}
	}

}
