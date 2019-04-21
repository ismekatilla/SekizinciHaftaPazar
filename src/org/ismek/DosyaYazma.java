package org.ismek;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class DosyaYazma {

	public static void main(String[] args) {
		
		File file = new File("Z:\\20190421\\servis.txt");
		try(FileWriter fileWriter = new FileWriter(file, false);) {
			fileWriter.write("test4");
			fileWriter.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try (FileOutputStream fileOutputStream = new FileOutputStream(file, true);) {
			String yazilacakBilgi = "TEST " + "\n" + "TEST \nTEST";
			byte[] yazilacakBilgiAsByte = yazilacakBilgi.getBytes();
			fileOutputStream.write(yazilacakBilgiAsByte);
			fileOutputStream.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
