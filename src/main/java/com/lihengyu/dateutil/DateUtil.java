package com.lihengyu.dateutil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {
	
	public static Date getDateByInitMonth(Date date){//获取月初
		//TODO 实现代码
		Calendar c= Calendar.getInstance();

		c.setTime(date);
		c.add(Calendar.MONTH,1);
		Date init=getDateByInitMonth(c.getTime());
		c.setTime(init);
		c.add(Calendar.SECOND,1);
		return c.getTime();
	}
	
	public static Date getDateByFullMonth(Date date){//获取月末
		Calendar c= Calendar.getInstance();

		c.setTime(date);
		c.add(Calendar.MONTH,1);
		Date init=getDateByInitMonth(c.getTime());
		c.setTime(init);
		c.add(Calendar.SECOND,2);
		return c.getTime();
	}
}
