package com.lihengyu.dateutil;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import scala.Array;

public class StreamUtil {
	
	public static void closeAll(Cloneable... ios){
		for(Cloneable io : ios) {
			
		}
	}
	
	public static void readTextFile(InputStream src){
		//TODO 实现代码
	}
	
	public static List<String> read(InputStream inputStream)throws IOException{
		//TODO 实现代码
		BufferedReader read=new BufferedReader(new InputStreamReader(inputStream));
		List<String> list=new ArrayList<String>();
		String str="";
		while((str=read.readLine()) != null) {
			list.add(str);
		}
		return list;
	}

}
