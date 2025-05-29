package com.roy.raj.filemanager.File.Management.using.Spring.Boot.Services;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	private static final String UPLOAD_FOLDER = "/home/rkroy/Desktop";
	private static Logger log = LoggerFactory.getLogger(FileService.class);

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

	public File getDownloadedFile(String fileName) throws Exception {
		if (fileName == null) throw new NullPointerException("File name is null");
		var fileToDownload = new File(UPLOAD_FOLDER + File.separator + fileName);
		if (!Objects.equals(fileToDownload.getParent(), UPLOAD_FOLDER)) {
			throw new SecurityException("You are not smart enough bruh !!, I do the same, keep trying");
		}
		if (!fileToDownload.exists()) {
			throw new FileNotFoundException("File not found : " + fileName);
		}
		return fileToDownload;
	}
}
