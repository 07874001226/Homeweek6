package project_6;
/*Write a Java programme using the following steps.
1 Declare two static variables
2 Declare one static method
3 Call both static variables into the static method inside the print statement.
4 Declare the Main method.
5 Call the static method into the Main method and Run the programme.
 */
public class Programme2 {
    //two static variables
    static int a= 25;
    static int b= 30;
 //one static method
    static void siya(){
        //Call both static variables into the static method inside the print statement.
        System.out.println(a); // This is print statement
        System.out.println(b); // This is print statement
    }
    //This is the Main method.
    public static void main(String[] args) {
        Programme2.siya();
    }
}
