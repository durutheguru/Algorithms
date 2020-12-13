package io.julian.impl.basics.strings;


import io.julian.core.Algorithm;

import java.util.Scanner;

/**
 * created by julian
 */
public class Insert implements Algorithm {


    Scanner scanner = new Scanner(System.in);


    @Override
    public void execute() {
        System.out.println("Enter full string: ");
        String fullString = scanner.nextLine();

        System.out.println("Enter query string: ");
        String query = scanner.nextLine();


    }


//    private String insert(String fullString, int startIndex, String query) {
//
//    }


}
