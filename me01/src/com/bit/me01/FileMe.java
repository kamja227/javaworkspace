package com.bit.me01;

import java.util.Date;

public class FileMe {
	public static void main(String[] args) {
		
		String path = "C:\\javaWorkspace\\day21";
		java.io.File file = new java.io.File(path);
		String[] dirs = file.list();
		
		java.util.Arrays.toString(dirs);
		
		int cnt = 0;
		for(int i=0; i<dirs.length; i++) {
			java.io.File fileArr = new java.io.File(dirs[i]);
			System.out.print(new Date(fileArr.lastModified()) + "\t");

			if(fileArr.isDirectory()) {
				System.out.print("<DIR>\t");
			} else { 
				cnt++;
				System.out.print("\t"); }
			System.out.println(dirs[i]);
		}
//		System.out.print(cnt + "개 파일\t\t" + fileArr.length() + "바이트");
	}
}
