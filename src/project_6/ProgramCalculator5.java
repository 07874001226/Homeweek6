package project_6;
/*Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */

public class ProgramCalculator5 {
      int v = 400;
   static int m = 100;
   static int c;
     void addition (){
        c=v+m;
        System.out.println("v+m=" +c);// Print statement
    }
    //This is instance metods
   void subtraction (){
       c=v-m;
       System.out.println("v-m=" +c); // Print statement
   }
   //This is a static method
     static void multiplication (){
        ProgramCalculator5 abc1= new ProgramCalculator5();


         c=abc1.v*m;
         System.out.println("v*m= "+c); // Print Statement
    }
    static void division (){
        ProgramCalculator5 abc1= new ProgramCalculator5(); // object
        c=abc1.v/m;
        System.out.println("v/m= "+c);// print statement
    }
//This is a Main Method
    public static void main(String[] args) {
         ProgramCalculator5 xyz = new ProgramCalculator5(); //object

        xyz.addition(); //object
        xyz.subtraction();//object
        ProgramCalculator5.multiplication();//object
        ProgramCalculator5.division();//object




    }



}
