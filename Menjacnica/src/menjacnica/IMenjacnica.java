package menjacnica;

import java.util.ArrayList;
import java.util.Date;

public interface IMenjacnica {
	
	
	
	void dodajKursZaDan(Date datum, double kurs, Valuta val);
	
	void izbrisiKursZaDan(Date datum);
	
	double pronadjiKurs(Date datum);

}
