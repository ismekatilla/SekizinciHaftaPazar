package org.ismek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


public class Program {

	public static void main(String[] args) {
		
		Sofor sofor = new Sofor();
		sofor.setIsim("AHMET MEHMET");
		sofor.setDogumTarihi(new Date());
		sofor.setEhliyetSinifi(EnumEhliyetSinifi.A);
		
		Servis servis = new Servis();
		servis.setGuzergah("A-B");
		servis.setPlaka("34AK01");
		servis.setYolcuSayisi((byte)17);
		servis.setSofor(sofor);
		
		File file = new File("Z:\\20190421\\servisSofor.txt");
//		try(FileWriter fileWriter = new FileWriter(file);) {
//			fileWriter.append(servis.getGuzergah());
//			fileWriter.append("\t");
//			fileWriter.append(servis.getPlaka());
//			fileWriter.append("\t");
//			fileWriter.append(String.valueOf(servis.getYolcuSayisi()));
//			fileWriter.flush();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		// Nesneyi yaz
		try (FileOutputStream fileOutputStream = new FileOutputStream(file); ){
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(servis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Nesneyi oku
		try (FileInputStream fileInputStream = new FileInputStream(file); ){
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Servis okunanServis = (Servis) objectInputStream.readObject();
			System.out.println(okunanServis.getSofor().getEhliyetSinifi());
			System.out.println(okunanServis.getYolcuSayisi());
			System.out.println(okunanServis.getGuzergah());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}