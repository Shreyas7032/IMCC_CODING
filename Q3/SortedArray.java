package com.Q3;

import java.util.Arrays;
import java.util.Collections;

public class SortedArray implements SortingUtility {

	private Integer[] numbers;

    public SortedArray(Integer[] numbers) {
        this.numbers = numbers;
    }
	
	@Override
	public void ascendingSort() {
		 Arrays.sort(numbers);
	        System.out.println("Ascending Order: " + Arrays.toString(numbers));
		
	}

	@Override
	public void descendingSort() {
		Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(numbers));
    }

		
}

