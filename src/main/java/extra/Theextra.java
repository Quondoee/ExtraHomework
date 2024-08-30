package extra;


import java.util.Scanner;

public class Theextra {
    public static void main(String[] args) {
        //while vs for loop
        //write a method that keeps scanning or asking a user a question such as are we there yet?
        //when the use says yes..then quit the program
        Scanner scanner = new Scanner(System.in);
        int x = 1;

        while (x > 0) {

            System.out.println("Are we there yet?");
            x++;

            String answer = scanner.nextLine();  // Read user input
            if (answer.equals("no")) {
                //if answer is no ..ask the question again
                System.out.println("answer is : " + answer);
                // Output user input
            } else
                if (answer.equals("yes")){
                    x = -1;
                    System.out.println("yes we are there");



                    //what i want to do if the answer is no\


            }else { }


        }


    }
}