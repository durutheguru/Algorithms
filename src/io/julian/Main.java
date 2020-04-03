package io.julian;

import io.julian.core.Algorithm;
import io.julian.impl.basics.SieveOfErasthenoses;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static Map<Integer, Algorithm> algorithmHashMap = new HashMap<Integer, Algorithm>();

    static {
        algorithmHashMap.put(1, new SieveOfErasthenoses());
    }


    public static void main(String[] args) {
        while (true) {
            System.out.print("\n\nSelect Algorithm to run: ");
            int code = scanner.nextInt();

            algorithmHashMap.get(code).execute();
        }
    }


}
