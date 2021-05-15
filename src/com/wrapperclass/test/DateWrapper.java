package com.wrapperclass.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class DateWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="02-02-2015";
		String str2="02/03/2015";
		String str3="02/01/2015";
		String str4="02/04/2015";
		
		
		String[] strArr=new String[]{str1,str2,str3,str4};
		//Date []dt2=new Date[5];
		ArrayList date=new ArrayList();
		for (int i=0;i<strArr.length;i++){
			String str = strArr[i];
			Date dt=new Date(str);
			date.add(dt);
		}
		System.out.println(date);
		//Date []dt2=new Date[5];
		Collections.sort(date);
		System.out.println("after sorting  "+date);
		
	}

}
