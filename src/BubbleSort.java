import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BubbleSort {

    // My BubbleSort I promised to finish with array, although I would prefer to use ArrayList :)

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean inputWrong = true;

        System.out.println("Type in your numbers you want to sort separated by space, for example: \"2 1 3\"");
        String input = reader.readLine();

        while (inputWrong) {

            try {
                String[] values = input.split(" ");

                int[] array = new int[values.length];

                for (int i = 0; i <values.length; i++) {
                   array[i] = Integer.parseInt(values[i]);

                }

                sortAscending(array);
                System.out.println("Your sorted numbers:");
                printArray(array);
                inputWrong = false;
                reader.close();


            } catch (NumberFormatException ex) {

                System.out.println("Sorry, you can enter only numbers. Please try again:");
                input = reader.readLine();
                inputWrong = true;
            }

        }


    }


    static void sortAscending(int[] array) {
        int tmp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }



    static  void printArray(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");
        }

    }


}
