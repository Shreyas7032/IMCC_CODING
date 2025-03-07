package com.Q3;

import java.util.Arrays;
import java.util.Collections;

public class SortString implements SortingUtility{

	private String data;

    public SortString(String data) {
        this.data = data;
    }
	
	@Override
	public void ascendingSort() {
		char[] chars = data.toCharArray();
        Arrays.sort(chars);
        System.out.println("Ascending Order: " +new String(chars));	
	}

	@Override
	public void descendingSort() {
		Character[] chars = new Character[data.length()];
        for (int i = 0; i < data.length(); i++) {
            chars[i] = data.charAt(i);
        }
        Arrays.sort(chars, Collections.reverseOrder());
        System.out.println("Descending Order: " + new String(Arrays.toString(chars)));
		
	}

}
