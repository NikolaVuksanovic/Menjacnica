package menjacnica;

import java.util.ArrayList;
import java.util.Date;


public class Menjacnica implements IMenjacnica {

	ArrayList<Kurs> listaValuta= new ArrayList<Kurs>();
	@Override
	public void dodajKursZaDan(Date datum, double kurs, Valuta val) {
		// TODO Auto-generated method stub
		
		System.out.println("Neki drugaciji kod!");

		Kurs noviKurs = new Kurs();
		noviKurs.datum = datum;
		noviKurs.kurs = kurs;
		
		listaValuta.add(noviKurs);
		

	}

	@Override
	public void izbrisiKursZaDan(Date datum) {
		// TODO Auto-generated method stub

		System.out.println("Neki drugaciji kod!");

		int i = 0;
		while (i < listaValuta.size()) {
			if (listaValuta.get(i).datum.equals(datum)) {
				listaValuta.remove(i);
			}
		}

	}

	@Override
	public double pronadjiKurs(Date datum) {
		// TODO Auto-generated method stub

		System.out.println("Neki drugaciji kod!");


		int i = 0;
		while (i < listaValuta.size()) {
			if (listaValuta.get(i).datum.equals(datum)) {
				return listaValuta.get(i).kurs;
			}
		}
		return -1;

	}

}
