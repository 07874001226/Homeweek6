package project_6;
/*Write a Java programme using the following steps.
1 Declare two instance and two static variables.
2 Declare one instance method.
3 Declare one static method.
4 Call all four instance and static variables into both instance and static methods inside the
print statement.
5 Declare the Main method.
6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
    //Declare two instance and two static variables.
     double x = 50.55d;
     float y = 10.5f;
     static int z = 55;
     static String name = "Siya";
    //Declare one instance method
     void xyz () {
         System.out.println(x); //Statement
         System.out.println(y); //Statement
         System.out.println(z);//Statement
         System.out.println(name);//Statement

     }
     //Declare one static method
     static void abc () {
         Programme4 abc = new Programme4();
         System.out.println(abc.x);//Print Statement
         System.out.println(abc.y);//Print Statement
         System.out.println(z);//Print Statement
         System.out.println(name);//Print Statement
     }
//This is a Main Method
    public static void main(String[] args) {
       Programme4 abc = new Programme4(); // object
       abc.xyz();  //object
       Programme4.abc();//object




    }

}
