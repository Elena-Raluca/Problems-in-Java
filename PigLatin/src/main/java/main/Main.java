package main;

import piglatin.PigLatin;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        PigLatin pigLatin = new PigLatin();
        String string = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        string = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
        while (stringTokenizer.hasMoreTokens()) {
            pigLatin.printLatinWord(stringTokenizer.nextToken());
        }

    }

}

