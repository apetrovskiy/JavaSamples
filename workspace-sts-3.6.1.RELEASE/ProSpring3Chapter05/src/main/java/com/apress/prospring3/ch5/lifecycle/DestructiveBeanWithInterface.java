package com.apress.prospring3.ch5.lifecycle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DestructiveBeanWithInterface implements InitializingBean,
		DisposableBean {
	private InputStream inputStream = null;
	public String filePath = null;
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing Bean");
		if (filePath == null) {
			throw new IllegalArgumentException("You must specify the filePath property of " + DestructiveBean.class);
		}
		inputStream = new FileInputStream(filePath);
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
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
