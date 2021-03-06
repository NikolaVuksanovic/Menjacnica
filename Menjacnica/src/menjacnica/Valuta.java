package menjacnica;

import java.util.ArrayList;
import java.util.Date;

class Kurs {
	Date datum;
	double kurs;
}

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	
	private ArrayList<Kurs> listaKurseva = new ArrayList<Kurs>();
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv != null)
			this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if (naziv != null)
			this.skraceniNaziv = skraceniNaziv;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Valuta val = (Valuta) obj;
		return this.naziv.equals(val.naziv);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.naziv;
	}
}


