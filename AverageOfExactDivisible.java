package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class AverageOfExactDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int counter = 0, total = 0;
        double avg = 0;


        System.out.print("Please enter a number: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            if (i % 3 == 0 && i % 4 == 0){
                counter++;
                total += i;
                avg = (double) total / counter;

            }

        }
        System.out.println(avg);
    }
}

//A program that calculates the average of numbers from 0 up to a given number that are exactly divisible by both 3 and 4.