package project_6;
/*Write a Java programme using the following steps.
1 Declare one instance and one static variable.
2 Declare one instance method.
3 Declare one static method.
4 Call both instance and static variables into both instance and static methods inside the
print statement.
5 Declare the Main method.
6 Call both instance and static methods into the Main method and run the programme
 */
public class Programme3 {
    //Declare one instance and one static variable.
    int my = 500;
    static char x = 'A';
    //Declare one instance method.
void v1 () {
    System.out.println(my);
    System.out.println(x);
}
    //Declare one static method.
static void v2 () {
    /*Call both instance and static variables into both instance and static methods inside the
    print statement.*/
    Programme3 obj1 = new Programme3(); // object
   System.out.println(obj1.my);  //This is a print statement
    System.out.println(x);  ////This is a print statement
}
//This is the Main method.
    public static void main(String[] args) {
        //Call both instance and static methods into the Main method and run the programme
        Programme3 obj1 = new Programme3(); // object
        obj1.v1();  // object
        Programme3.v2(); // object
    }
}