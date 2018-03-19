package sortersTesterClasses;

import dataGenerator.DataGenerator;

import sorterClasses.InsertionSortSorter;


public class EnteroTester {

	
	public static void main(String[] args) { 
		
		DataGenerator r = new DataGenerator(19);
		Integer[] datos = r.generateData(); 
		Entero[] Arr = new Entero[19]; 


		for (int i = 0; i < 19; i++) {
		    Arr[i] = new Entero(datos[i]);
		    System.out.println(datos[i]);
		}

		InsertionSortSorter<Entero> x = new InsertionSortSorter<>();
		x.sort(Arr, null);
	}
}
