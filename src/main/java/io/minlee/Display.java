package io.minlee;

import java.util.Scanner;

/**
 * Created by minlee on 5/19/16.
 */
public class Display {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int sum = 0;

        for(int i = 0; i <= number; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
