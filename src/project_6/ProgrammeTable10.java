package project_6;
/*Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

 */

import java.util.Scanner;

public class ProgrammeTable10 {
// This is a Main Method
    public static void main(String[] args) {
        int n;
        int i = 1;
        Scanner abc = new Scanner(System.in);// scanner class
        System.out.println( " Enter any number " ); //Print Statement
        n = abc.nextInt();

        while (i<=10){
            //This is a statement
            System.out.println(n+" * "+i+ " = "+n * i);
            i++;
        }




    }






}
