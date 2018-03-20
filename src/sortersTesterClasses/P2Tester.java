package sortersTesterClasses;

import dataGenerator.DataGenerator;
import sorterClasses.InsertionSortSorter;

public class P2Tester {
public static void main(String[] args) { 
		Integer[] Arr = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10}; 
		InsertionSortSorter<Integer> x = new InsertionSortSorter<>();
		IntegerComparator1  c = new IntegerComparator1();
		IntegerComparator2  c1 = new IntegerComparator2();
		
		x.sort(Arr, c);
		for (int i = 0; i < Arr.length; i++) {
		    System.out.print(Arr[i]+" ");
		}
		 System.out.println("");
		x.sort(Arr, c1);
		for (int i = 0; i < Arr.length; i++) {
		    System.out.print(Arr[i]+ " ");
		}
	}
}
