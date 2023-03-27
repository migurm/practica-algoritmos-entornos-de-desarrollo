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

}
