package org.ismek;

import java.io.File;

public class KlasorOlusturma {

	public static void main(String[] args) {
		
		File file = new File("Z:\\20190421");
		boolean klasorOlustu = file.mkdir();
		if (klasorOlustu) {
			System.out.println("Klasör oluşturulmuştur.");
		} else {
			System.out.println("Sorun oluşmuştur.");
		}
	}
}