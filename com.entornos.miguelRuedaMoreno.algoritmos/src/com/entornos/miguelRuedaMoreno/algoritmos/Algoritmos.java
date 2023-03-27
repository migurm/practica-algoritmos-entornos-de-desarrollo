package com.entornos.miguelRuedaMoreno.algoritmos;

/**
 * @author miguelr
 *
 */
public abstract class Algoritmos {

	/**
	 * Metodo para la sucesion de fibonacci (recursivo)
	 * @param posicion que queremos de la sucesion 
	 * @return el valor que se encuentra en la posicion indicada
	 */
	public long fibonacci(long posicion) {
		if (posicion < 2) {
			return posicion;
		} else {
			return fibonacci(posicion - 1) + fibonacci(posicion - 2);
		}

	}
	/**
	 * Metodo para devolver el factorial de un número
	 * @param numero (el que recibimos)
	 * @return res (variable creada para almacenar el resultado)
	 */
	public int factorial(int numero) {
		if(numero<1) {
			return 0;
		}else {
			int res=1;
			for(int i = numero; i>=1; i--){
				res*=i;
			}
			return res;
		}

	}

}
