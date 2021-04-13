package project_6;

/*1. Write a Java programme using the following steps.
1 Declare two instance variables.
2 Declare one instance method.
3 Call both instance variables into the instance method inside the print statement.
4 Declare the Main method.
5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
    // Declare two instance variables.
    int a = 100;  // instance variable.
    String name = "Vrajesh"; // instance variable.

    // Declare one instance method.
    void siya() {  //instance area.
//Call both instance variables into the instance method inside the print statement
        System.out.println(a); //This is print statement
        System.out.println(name); // This is print statement
    }

        // This is a main method
        public static void main (String[] args){
           Programme1 prg = new Programme1(); //object
            prg.siya(); //object

        }
        }


