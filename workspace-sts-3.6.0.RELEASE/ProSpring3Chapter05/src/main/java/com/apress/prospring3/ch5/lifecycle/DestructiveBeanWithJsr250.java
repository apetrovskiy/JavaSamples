package com.apress.prospring3.ch5.lifecycle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DestructiveBeanWithJsr250 {
	private InputStream inputStream = null;
	public String filePath = null;
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean");
		if (filePath == null) {
			throw new IllegalArgumentException("You must specify the filePath property of " + DestructiveBean.class);
		}
		inputStream = new FileInputStream(filePath);
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("destroying Bean");
		if (inputStream != null) {
			try {
				inputStream.close();
				inputStream = null;
			} catch (IOException ex) {
				System.err.println("WARN: An IOException occured, trying to close the InputStream");
			}
		}
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
