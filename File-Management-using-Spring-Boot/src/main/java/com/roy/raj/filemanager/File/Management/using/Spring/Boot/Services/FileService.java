package com.roy.raj.filemanager.File.Management.using.Spring.Boot.Services;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	private static final String UPLOAD_FOLDER = "/home/rkroy/Desktop";

	public void uploadFile(MultipartFile file) throws Exception {
		if (file == null) {
			throw new NullPointerException("File is null");
		} 
		var targetFile = new File(UPLOAD_FOLDER + File.separator + file.getOriginalFilename());
		if (!Objects.equals(targetFile.getParent(), UPLOAD_FOLDER)) {
			throw new SecurityException("You are not smart enough bruh !!, I do the same, keep trying");
		}
		Files.copy(file.getInputStream(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);	
	}
}
