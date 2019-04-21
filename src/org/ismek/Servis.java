package org.ismek;

import java.io.Serializable;

public class Servis implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String plaka;
	private String guzergah;
	private transient byte yolcuSayisi;
	private Sofor sofor;

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public String getGuzergah() {
		return guzergah;
	}

	public void setGuzergah(String guzergah) {
		this.guzergah = guzergah;
	}

	public byte getYolcuSayisi() {
		return yolcuSayisi;
	}

	public void setYolcuSayisi(byte yolcuSayisi) {
		this.yolcuSayisi = yolcuSayisi;
	}

	public Sofor getSofor() {
		return sofor;
	}

	public void setSofor(Sofor sofor) {
		this.sofor = sofor;
	}
}
