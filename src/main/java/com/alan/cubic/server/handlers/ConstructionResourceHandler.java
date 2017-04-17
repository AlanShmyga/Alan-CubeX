package com.alan.cubic.server.handlers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ConstructionResourceHandler implements ResourceHandler {

	@Override
	public InputStream getStreamFromResource(String resourceUrl) {
		File file = new File("/Users/alan/Documents/Test/RHCP-Otherside.mp3");
    	FileInputStream fis;
    	BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return bis;
	}

}
