		/****************************************
         *                                      *
         *       Roulette Wheel Test Class      *
         *         Andrew Miller-Smith          *
         *                                      *
         ****************************************/

        /*

        Description:    Testing class for RouletteWheel object.

        				Copyright 2015, Andrew Miller-Smith. Class is free for non-commercial use. For commercial use, inquire at amillers@bowdoin.edu.
        */

import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class TestClass {

	//random number generator, named constants for testing
	private static final Random random = new Random();
	private static final int NUM_VALUES = 20;
	private static final int MAX_VALUE = 50;
	private static final int NUM_TESTS = 1000;

	public static void main(String[] args){

		//test RouletteWheel for NUM_TESTS iterations
		int tests = 0;
		while (tests < NUM_TESTS){

			//generate test ArrayList of doubles
			ArrayList<Double> testList = new ArrayList<Double>();
			for (int i = 0; i < NUM_VALUES; i++){
				double value = random.nextDouble() * MAX_VALUE;
				testList.add(value);
			}

			//test print
			for (int i = 0; i < testList.size(); i++){
				System.out.println("ArrayList value at " + i + ": " + testList.get(i));
			}

			//test constructor and initialization
			RouletteWheel testWheel = new RouletteWheel(testList);
			System.out.println("Wheel size: " + testWheel.size());
			System.out.println("Wheel sum: " + testWheel.getSum());
			testWheel.printValues();
			System.out.println();

			//test selection
			for (int i = 0; i < NUM_VALUES; i++){
				int returnIndex = testWheel.selectValue();
				System.out.println("Selected index: " + returnIndex); //add print statement for randomly generated value in selectValue method
				testWheel.printValues();
				System.out.println();
			}
			//test selection & removal
			for (int i = 0; i < NUM_VALUES; i++){
				int returnIndex = testWheel.selectAndRemove();
				System.out.println("Selected index: " + returnIndex); //add print statement for randomly generated value in selectAndRemove method
				testWheel.printValues();
				System.out.println();
			}

			//test removal
			// while(!testWheel.isEmpty()){

			// 	System.out.println("Wheel size: " + testWheel.size());
			// 	testWheel.printValues();
			// 	testWheel.remove(0);
			// 	System.out.println("");
			// }
			tests++;
		}

	}

	/* THE CAKE IS A LIE. */
}