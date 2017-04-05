package menjacnica;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
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
