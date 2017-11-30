package org.waarp.ftp.client.testcode;

import java.io.File;

public class StringPath {

	public static void main(String[] args) 
	{
		File file = new File("D:\1627587845645125_652188763841_Dayaannd.txt");
		String strName = file.getName();
		String str = strName.substring(strName.indexOf('_') +1);
		String dee = str.substring(str.indexOf('_') +1);
		System.out.println(dee);
	}
}
