package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.entornos.miguelRueda.arrays.MisArrays;

class testMedia {
	int [] arrayNegativo= new int [] {-72, -10, -1, -90, -23, -28};
	int [] arrayPositivos = new int [] {24, 72, 31, 99, 10, 51};
	int [] arrayIntermedio = new int [] {-10, 15, -95, -30, 82, 77};

	
	@Test
	 void testMedia() {		
		double resultado1=MisArrays.media(arrayNegativo);
		double resultadoEsperado1=37.33;
		double resultado2=MisArrays.media(arrayIntermedio);
		double resultadoEsperado2=47.83;
		double resultado3=MisArrays.media(arrayPositivos);
		double resultadoEsperado3=6.5;

		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}

}
