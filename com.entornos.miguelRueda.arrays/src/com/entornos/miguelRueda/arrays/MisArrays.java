package com.entornos.miguelRueda.arrays;

public abstract class MisArrays {
	/**
	 * Devolver la media de una serie de numeros enteros
	 * @param Recibe por parametro una estructura array de numeros enteros
	 * @return La división entre el sumatorio de los numeros y la cantidad de valores. La media.
	 */
	public static double media (int [] numeros) {
		int sumatorio=0;
		for(int numero:numeros) {
		 sumatorio+=numero;
		}
		return (double)sumatorio/numeros.length;

	}
	/**
	 * Devolver la mediana de una serie de numeros enteros en un array
	 * @param Recibe por parametro una estructura array de numeros enteros
	 * @return La mediana de la serie de numeros recibidos
	 */
	public static double mediana (int [] numeros) {
		if(numeros.length%2==0) {
			return ((double)numeros[(numeros.length/2)-1]+numeros[numeros.length/2])/2;
		}
		else {
			return (double)numeros[numeros.length/2];
		}
	}
	/**
	 * Devolver el numero mayor de una serie de valores enteros
	 * @param Recibe por parametro un array de numeros enteros
	 * @return Devuelve el numero mayor
	 */
	public static int maximo (int [] numeros) {
		int mayor=numeros[0];
		for (int numero:numeros) {
			if (numero>mayor) mayor=numero;
		}
		return mayor;
	}
	/**
	 * Devolver el numero menor de una serie de valores enteros
	 * @param Recibe por parametro un array de numeros enteros
	 * @return Devuelve el numero menor
	 */
	public static int minimo (int [] numeros) {
		int minimo=numeros[0];
		for (int numero:numeros) {
			if (numero<minimo) minimo=numero;
		}
		return minimo;
	}
	
}

