import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];  // fixed here
        }
        
        System.out.println("The sum of the array elements is: " + sum);
    }
}
