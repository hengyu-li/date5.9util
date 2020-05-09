package com.lihengyu.dateutil;

import java.io.File;

public class FileUtil {
	
	public static String getExtendName(String fileName){//获取后缀名
		//TODO 实现代码
//		File file=new File("E:\\aa.txt");
//		fileName=file.getName();
		String fileTyle=fileName.substring(fileName.lastIndexOf("."),fileName.length());
		return fileTyle;
	}
	 
}
