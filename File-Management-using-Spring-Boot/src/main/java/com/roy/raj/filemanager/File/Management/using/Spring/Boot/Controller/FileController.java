package com.roy.raj.filemanager.File.Management.using.Spring.Boot.Controller;

import org.springframework.http.HttpHeaders;
import java.nio.file.Files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/download")
	public ResponseEntity<Resource> downloadFile(@RequestParam("fileName") String fileName) {
	    try {
	        var fileToDownload = fileService.getDownloadedFile(fileName);
			return ResponseEntity.ok()
	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
	                .contentLength(fileToDownload.length())
	                .contentType(MediaType.APPLICATION_OCTET_STREAM)
	                .body(new InputStreamResource(Files.newInputStream(fileToDownload.toPath())));
	    } catch (Exception e) {
	        return ResponseEntity.notFound().build();
	    }
	}
}
