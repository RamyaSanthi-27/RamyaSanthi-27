package week1.day2;

import java.util.Iterator;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 */
	
	public static void main(String[] args) {
		 int range = 8, firstNum = 0, secNum = 1, sum; 
		 System.out.print("Output : ");
		 System.out.print( firstNum +"," );
		 for (int i = 1; i < range; i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
			System.out.print( firstNum +"," );
		}
	}

}
