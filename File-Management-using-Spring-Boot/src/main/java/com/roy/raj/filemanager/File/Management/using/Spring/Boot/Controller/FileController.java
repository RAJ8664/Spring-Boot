package com.roy.raj.filemanager.File.Management.using.Spring.Boot.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.roy.raj.filemanager.File.Management.using.Spring.Boot.Services.FileService;

@RestController
public class FileController {
	
	@Autowired
	private FileService fileService;

	private Logger log = LoggerFactory.getLogger(FileController.class);

	@PostMapping("/upload")
	public boolean uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			fileService.uploadFile(file);
			return true;
		} catch (Exception e) {
			log.error("Error Occured while upload file :", e);
		}
		return false;
	}

}
