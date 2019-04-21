package org.ismek;

import java.io.File;

public class DizinOlusturma {

	public static void main(String[] args) {
		
		File fileDir = new File("z:\\");
		File[] fileArray = fileDir.listFiles();
        for(File file : fileArray){
        	if (file.isDirectory()) {
        		System.out.println(file.getName() + "*");
			} else {
				System.out.println(file.getName());
			}
        	
//        	if (file.isHidden()) {
//        		System.out.println(file.getName());
//			}
        }
	}
}
