package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.entornos.miguelRueda.arrays.MisArrays;

@TestInstance(Lifecycle.PER_CLASS)
class testMedia {
	
	static int [] arrayNegativo;
	static int [] arrayPositivos;
	static int [] arrayCorto;

	
	@BeforeAll
	void preparar() {
		arrayNegativo= new int [] {-72, -10, -1, -90, -23, -28};
		arrayPositivos = new int [] {24, 72, 31, 99, 10, 51};
		arrayCorto = new int [] {15, 10, 6, 1};
	}
	
	
	@Test
	 void testMedia() {		
		double resultado1=MisArrays.media(arrayNegativo);
		double resultadoEsperado1=-224.0/6;
		double resultado2=MisArrays.media(arrayPositivos);
		double resultadoEsperado2=287.0/6;
		double resultado3=MisArrays.media(arrayCorto);
		double resultadoEsperado3=32.0/4;

		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}
	@Test
	void testMediana() {
		double resultado1=MisArrays.mediana(arrayNegativo);
		double resultadoEsperado1=-91.0/2;
		double resultado2=MisArrays.mediana(arrayPositivos);
		double resultadoEsperado2=130.0/2;
		double resultado3=MisArrays.mediana(arrayCorto);
		double resultadoEsperado3=8.0;
		
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}
	@Test
	void testMayor() {
		double resultado1=MisArrays.maximo(arrayNegativo);
		double resultadoEsperado1=-1;
		double resultado2=MisArrays.maximo(arrayPositivos);
		double resultadoEsperado2=99;
		double resultado3=MisArrays.maximo(arrayCorto);
		double resultadoEsperado3=15;
		
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}
	@Test
	void testMinimo() {
		double resultado1=MisArrays.minimo(arrayNegativo);
		double resultadoEsperado1=-90;
		double resultado2=MisArrays.minimo(arrayPositivos);
		double resultadoEsperado2=10;
		double resultado3=MisArrays.minimo(arrayCorto);
		double resultadoEsperado3=1;
		
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}

	
}
