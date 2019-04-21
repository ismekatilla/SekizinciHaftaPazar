package org.ismek;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedDosyaOkuma {

	public static void main(String[] args) {
		
		File file = new File("Z:\\20190421\\servis.txt");
		try (FileReader fileReader = new FileReader(file);) {
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String satir = "";
			while((satir = bufferedReader.readLine()) != null) {
				System.out.println(satir);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try(FileWriter fileWriter = new FileWriter(file);) {
			String yazilacakBilgi = "TEST BİLGİSİDİR";
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(yazilacakBilgi);
			bufferedWriter.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
