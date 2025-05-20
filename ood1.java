//function overloading
// Java program to demonstrate function overloading
public class ood1 { 
    static void MyMethod() {
        System.out.println("Hello from MyMethod!");
    }
    static void MyMethod(String name) {
        System.out.println("Hello " + name );
    }
    static void MyMethod(String fname, String lname) {
        System.out.println("Hello my First name " + fname + " and my last name " + lname);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Declare and initialize an array of integers
        int [] numbers = {1, 2, 3, 4, 5 ,6, 7, 8, 9, 10};
        int sum = 0;
        // Calculate the sum of the numbers in the array    
        //     for (int i = 0; i < numbers.length; i++) {
            //         sum += numbers[i];
            //     }
            //     System.out.println("Sum: " + sum);
            // }
        for (int value : numbers) {
            if (value == 6 || value == 7) {
               continue;
            } else if(value == 9) {
                break;
            } 
            // Check if the number is 6 or 7, if so, skip it
            sum += value;
        }
        // Print the sum of the selected numbers
        System.out.println("Sum of selected numbers : " + sum);
        // Call the MyMethod with different parameters
        MyMethod();
        MyMethod("Sourav");
        MyMethod("Sourav", "Saha");
}      
}
