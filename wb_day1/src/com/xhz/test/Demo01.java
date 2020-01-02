package com.xhz.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = dateFormat.format(date);
		System.out.println(time);
	}
}
