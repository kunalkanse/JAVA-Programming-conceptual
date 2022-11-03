/**
 * Class demonstrate the basics of Array
 * @author Kunal kanse
 *
 */
public class Array2 {

        public static void main(String[] args) {
                // initialize primitive one dimensional integer array
                int[] anArray = new int[5];

                anArray[0] = 10; // initialize first element
                anArray[1] = 20; // initialize second element
                anArray[2] = 30; // and so forth
                anArray[3] = 40;
                anArray[4] = 50;

                // Each array element is accessed by its numerical index:
                System.out.println("Element 1 at index 0: " + anArray[0]);
                System.out.println("Element 2 at index 1: " + anArray[1]);
                System.out.println("Element 3 at index 2: " + anArray[2]);
                System.out.println("Element 4 at index 3: " + anArray[3]);
                System.out.println("Element 5 at index 4: " + anArray[4]);

                System.out.println();

                // initialize Object one dimensional string array
                String[] anArrayOfStrings = new String[5];
                anArrayOfStrings[0] = "abc"; // initialize first element
                anArrayOfStrings[1] = "xyz"; // initialize second element
                anArrayOfStrings[2] = "name"; // and so forth
                anArrayOfStrings[3] = "address";
                anArrayOfStrings[4] = "id";

                
                // Each array element is accessed by its numerical index:
                System.out.println("Element 1 at index 0: " + anArrayOfStrings[0]);
                System.out.println("Element 2 at index 1: " + anArrayOfStrings[1]);
                System.out.println("Element 3 at index 2: " + anArrayOfStrings[2]);
                System.out.println("Element 4 at index 3: " + anArrayOfStrings[3]);
                System.out.println("Element 5 at index 4: " + anArrayOfStrings[4]);

                System.out.println();

                // Creating array of class type
                Employee[] anArrayOfEmployees = new Employee[2];
                anArrayOfEmployees[0] = new Employee(10, "ramesh");
                anArrayOfEmployees[1] = new Employee(11, "john");

                // Each array element is accessed by its numerical index:
                System.out.println("Element 1 at index 0: " + anArrayOfEmployees[0].getName());
                System.out.println("Element 2 at index 1: " + anArrayOfEmployees[1].getName());

                System.out.println();
                
                // shortcut syntax to create and initialize an integer array
                int[] array = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
                // Each array element is accessed by its numerical index:
                System.out.println("Element 1 at index 0: " + array[0]);
                System.out.println("Element 2 at index 1: " + array[1]);
                System.out.println("Element 3 at index 2: " + array[2]);
                System.out.println("Element 4 at index 3: " + array[3]);
                System.out.println("Element 5 at index 4: " + array[4]);

                System.out.println();
                
                // shortcut syntax to create and initialize an String array
                String[] arrayOfStrings = {"abc", "xyz", "name", "address", "id"};
                // Each array element is accessed by its numerical index:
                System.out.println("Element 1 at index 0: " + arrayOfStrings[0]);
                System.out.println("Element 2 at index 1: " + arrayOfStrings[1]);
                System.out.println("Element 3 at index 2: " + arrayOfStrings[2]);
                System.out.println("Element 4 at index 3: " + arrayOfStrings[3]);
                System.out.println("Element 5 at index 4: " + arrayOfStrings[4]);

                System.out.println();
                
                // shortcut syntax to create and initialize class type array
                Employee[] employees = {new Employee(10, "ramesh"),new Employee(11, "john")};
                // Each array element is accessed by its numerical index:
                System.out.println("Element 1 at index 0: " + employees[0].getName());
                System.out.println("Element 2 at index 1: " + employees[1].getName());

                System.out.println();
                
        }
}

class Employee {
        private int id;
        private String name;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Employee(int id, String name) {
                super();
                this.id = id;
                this.name = name;
        }
}