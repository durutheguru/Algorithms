package io.julian.impl.basics;


import io.julian.core.Algorithm;
import io.julian.exception.IllegalInputException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * created by julian
 */
public class SieveOfErasthenoses implements Algorithm {


    private Scanner scanner = new Scanner(System.in);


    @Override
    public void execute() {
        System.out.print("Enter Array Size: ");
        int count = scanner.nextInt();
        if (count < 1) {
            throw new IllegalInputException("Array Size must be positive");
        }

        int[] numbers = generateNumbers(count);

        sievePrimes(numbers);

        System.out.println("Output: " + preparedOutput(numbers));
    }


    private int[] generateNumbers(int count) {
        int[] numbers = new int[count];
        for (int i = 1; i < count; i++) {
            numbers[i] = i;
        }

        return numbers;
    }


    private void sievePrimes(int[] numbers) {
        for (int i = 1; i <= Math.sqrt(numbers.length); i++) {
            if (numbers[i] == 1) {
                continue;
            }

            cancelMultiples(numbers[i], i, numbers);
        }
    }


    private void cancelMultiples(int value, int startIndex, int[] numbers) {
        for (int i = startIndex; i < numbers.length; i += value) {
            if (numbers[i] == value) {
                continue;
            }

            numbers[i] = 1;
        }
    }


    private List<Integer> preparedOutput(int[] numbers) {
        List<Integer> output = new ArrayList<Integer>();
        output.add(1);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                continue;
            }

            output.add(numbers[i]);
        }

        return output;
    }


}
