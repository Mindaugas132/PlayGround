package Silly_Apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AlphabeticalOrder {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Type in the words you want to order alphabetically.");
        System.out.println("Type in your words separated by space, for example: \"one two three\"");


        String input = reader.readLine();

        String[] words = input.split(" ");

        Arrays.sort(words);
        System.out.println();


        System.out.println("Here are your words ordered alphabetically:");

        for (String value : words) {
            System.out.println(value);
        }


    }
}
