package menjacnica;

import java.util.Date;

public interface IMenjacnica {
	
	void dodajKursZaDan(Date datum, double kurs);
	
	void izbrisiKursZaDan(Date datum);
	
	double pronadjiKurs(Date datum);

}
