package com.ktdsuniversity.edu.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriter {

	public static File createNewFile() throws IOException {
		File textFile = new File("C:\\logaaas", "test.txt");
		textFile.createNewFile();
		return textFile;
	}

	public static File createNewFileThrowsRuntiemException() {
		File textFile = new File("C:\\logaaas", "test.txt");
		try {
			textFile.createNewFile();
		} catch (IOException ioe) {
			throw new RuntimeException(ioe.getMessage(), ioe);
		}
		return textFile;
	}

	public static void main(String[] args) {

//		File textFile = new File("C:\\logs", "text.txt");
		File textFile = new File("C:\\logs");
//		if (textFile.exists() && textFile.isFile()) {
		OutputStream fos = null;
		try {
			fos = new FileOutputStream(textFile);
			fos.write("파일 내용을 씁니다.".getBytes());
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
//				e.printStackTrace();
		} catch (IOException e) {
//				e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
				}

			}
//		createNewFileThrowsRuntiemException();

//		try {
//			createNewFile();
//		}
//		catch (IOException ioe) {
//			System.out.println("에러가 발생했습니다." + ioe.getMessage());
//		}
		}

	}
}

//}
