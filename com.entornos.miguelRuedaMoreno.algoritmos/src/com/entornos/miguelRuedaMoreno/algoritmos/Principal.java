package com.entornos.miguelRuedaMoreno.algoritmos;

public class Principal {

	public static void main(String[] args) {
		/*1. Crea mediante un bucle un array llamado números con 5 numeros aleatorios
		 * del 1 al 20.(Suponemos números enteros)*/
		int [] arrayNumeros = new int [5];
		for (int i = 0 ; i < arrayNumeros.length ; i++) {
			arrayNumeros[i]=(int)((Math.random()*(20))+1);
		}
		/*2. Calcula mediante un bucle el número de fibonacci de los 5 numeros del array
		 * y almacena el resultado en otro array llamado "resultadoFibonacci*/
		long [] resultadoFibonacci = new long [5];
		for (int i = 0 ; i < arrayNumeros.length ; i++) {
			resultadoFibonacci[i]=Algoritmos.fibonacci((long)arrayNumeros[i]);
		}
		/*3. Calcula mediante un bucle el factorial de los 5 números del array y almacena
		 * el resultado en otro array llamado resultadoFactorial*/
		int [] resultadoFactorial = new int [5];
		for (int i = 0 ; i < arrayNumeros.length ; i++) {
			resultadoFactorial[i] = Algoritmos.factorial(arrayNumeros[i]);
		}
		/*4. Comprueba mediante un bucle si los 5 números del array son primos o no
		 * y almacena el resultado en otro array llamado resultadoPrimos*/
		/*Supongo que lo quiere en un array de booleanos, pensaba hacerlos guardando alguna frase*/
		boolean [] resultadoPrimos = new boolean [5];
		for ( int i = 0; i < resultadoPrimos.length ; i++) {
			resultadoPrimos[i]=Algoritmos.primo(arrayNumeros[i]);
		}

	}

}
