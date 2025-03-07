package com.Q3;

public class SortingDemo {
	public static void main(String[] args) {
        Integer[] numbers = {4, 2, 9, 1, 5};
        SortedArray sortArray = new SortedArray(numbers);
        sortArray.ascendingSort();
        sortArray.descendingSort();

        SortString sortString = new SortString("Apple");
        sortString.ascendingSort();
        sortString.descendingSort();
    }
}
