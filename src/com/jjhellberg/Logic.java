package com.jjhellberg;

public class Logic {
    public String aoc1(String input) {
        int sum = 0;
        int[] inputArray = getInts(input);

        for(int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                sum += inputArray[i];
            }
        }
        if (inputArray[inputArray.length - 1] == inputArray[0]) {
            sum += inputArray[inputArray.length - 1];
        }

        return Integer.toString(sum);
    }

    public String aoc12(String input) {
        int sum = 0;
        int[] ints = getInts(input);
        int offset = ints.length / 2;

        for(int i = 0; i < offset; i++) {
            if (ints[i] == ints[i + offset]) {
                sum += ints[i] * 2;
            }
        }
        return Integer.toString(sum);
    }

    private int[] getInts(String input) {
        int[] inputArray = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            inputArray[i] = Character.getNumericValue(input.charAt(i));
        }
        return inputArray;
    }


}
