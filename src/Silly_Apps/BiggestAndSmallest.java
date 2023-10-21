package Silly_Apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BiggestAndSmallest {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Type in the numbers, from which you want to find biggest and smallest number.");
        System.out.println("and because this is super uper duper numbers finder, we will give you more than you asked :)");
        System.out.println();
        System.out.println("Type in your numbers separated by space \" \" :");


        ArrayList<Integer> list = new ArrayList();
        int biggest;
        int smallest;


        boolean inputWrong = true;
        String input = reader.readLine();


        while (inputWrong) {

            int temp;

            try {
                String[] values = input.split(" ");

                for (int i = 0; i < values.length; i++) {
                    temp = Integer.parseInt(values[i]);
                    list.add(temp);
                }

                inputWrong = false;

                } catch (NumberFormatException ex) {

                System.out.println("Sorry, but you need to enter only numbers separated by space, for example: \"1 2 3\"");
                System.out.println("Please try again: ");
                input = reader.readLine();
                System.out.println();

            }


        }

        Collections.sort(list);

        System.out.println("Smallest number is: " + list.get(0));
        System.out.println("Biggest number is: " + list.get(list.size() - 1));
        System.out.println();


        System.out.println("And some extra bonus for you!");
        System.out.println("All your numbers sorted from smallest to biggest:");
        System.out.println(list);


        System.out.println();
       // Collections.sort(list, Collections.reverseOrder());
        list.sort(Collections.reverseOrder());

        System.out.println("All your numbers sorted from biggest to smallest:");
        System.out.println(list);


    }


}
