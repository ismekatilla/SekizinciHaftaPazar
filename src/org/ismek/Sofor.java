package org.ismek;

import java.io.Serializable;
import java.util.Date;

public class Sofor implements Serializable {

	private String isim;
	private Date dogumTarihi;
	private EnumEhliyetSinifi ehliyetSinifi;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Date getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public EnumEhliyetSinifi getEhliyetSinifi() {
		return ehliyetSinifi;
	}

	public void setEhliyetSinifi(EnumEhliyetSinifi ehliyetSinifi) {
		this.ehliyetSinifi = ehliyetSinifi;
	}
}
