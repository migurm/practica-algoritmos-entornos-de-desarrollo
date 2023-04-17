package com.entornos.miguelRueda.arrays;

public abstract class MisArrays {

	/**
	 * Metodo para calcular la media de una serie de numeros enteros
	 * @param Recibe por parametro una estructura array de numeros enteros
	 * @return La división entre el sumatorio de los numeros y la cantidad de valores. La media.
	 */
	public static double media (int [] numeros) {
		int sumatorio=0;
		for(int numero:numeros) {
		 sumatorio+=numero;
		}
		return Math.round((sumatorio/numeros.length)*100.0)/100.0;
	}
}

/*
 * System.out.println((double)Math.round(number * 100d) / 100d);
 /* Salida : 1.42*/
