package org.ismek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOkuma {

	public static void main(String[] args) {
		
		File servisTxtFile = new File("Z:\\20190421\\servis.txt");
		if (servisTxtFile.exists()) {
			try (FileReader fileReader = new FileReader(servisTxtFile);){
				char[] karakterDizisi = new char[(int) servisTxtFile.length()];
				fileReader.read(karakterDizisi);
				System.out.println(karakterDizisi);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		try (FileInputStream fileInputStream = new FileInputStream(servisTxtFile);) {
			byte[] okunacakBilgi = new byte[(int) servisTxtFile.length()];
			fileInputStream.read(okunacakBilgi);
			String yazi = new String(okunacakBilgi);
			System.out.println(yazi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
