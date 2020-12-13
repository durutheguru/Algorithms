package io.julian.impl.basics.strings;


import io.julian.core.Algorithm;

import java.util.Scanner;

/**
 * created by julian
 */
public class IndexOf implements Algorithm {


    Scanner scanner = new Scanner(System.in);


    @Override
    public void execute() {
        System.out.print("Enter Full String: ");
        String fullString = scanner.nextLine();

        System.out.print("Enter Search String: ");
        String query = scanner.nextLine();

        if (fullString.length() == 0 || query.length() == 0) {
            System.err.println("Valid strings must be inputted");
            return;
        }

        int startIndex = indexOf(fullString, query);
        System.out.println("Index Search Returned: " + startIndex);
    }


    private int indexOf(String fullString, String query) {
        int startIndex = -1;
        char currentChar;
        String matchingBuffer = "";
        for (int i = 0, l = fullString.length(); i < l; i++) {
            currentChar = fullString.charAt(i);

            if (currentChar == query.charAt(matchingBuffer.length())) {
                matchingBuffer += currentChar;
                if (startIndex == -1) {
                    startIndex = i;
                }

                if (matchingBuffer.length() == query.length()) {
                    return startIndex;
                }
            }
            else {
                matchingBuffer = "";
                startIndex = -1;
            }
        }

        if (matchingBuffer.length() != query.length()) {
            startIndex = -1;
        }

        return startIndex;
    }


}
