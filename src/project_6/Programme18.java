package project_6;
/*. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Programme18 {
    //This is a main method
    public static void main(String[] args) {


        int a = 125;
        int b = 24;
        int c;
//This is a Print Statement
        System.out.println(a+" + "+b+" = "+(c=a+b));
        System.out.println(a+" - "+b+" = "+(c=a-b));
        System.out.println(a+" * "+b+" = "+(c=a*b));
        System.out.println(a+" / "+b+" = "+(c=a/b));
        System.out.println(a+" % "+b+" = "+(c=a%b));




    }



}
