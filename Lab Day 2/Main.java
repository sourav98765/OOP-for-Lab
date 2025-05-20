import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        circle c1 = new circle();
        System.out.println("enter the radius");
        c1.radius =sc.nextFloat();
        c1.display();
        c1.pi=4.3f;

        // Student s1 = new Student();
        // System.out.println("Enter your name");
        // s1.name = sc.next();
        // System.out.println("Enter Your id :");
        // s1.id =sc.nextInt();
        // System.out.println("Enter your Cgpa");
        // s1.cgpa = sc. nextFloat();
        // s1.display();
        // Student S1 = new Student();
        // //new memory alloat
        // S1.name = "Sourav Saha";
        // S1.id = 241;
        // S1.cgpa = (float) 4.00;
        // Student S2 = new Student();
        // S2.setValue("Sourav", 241, 3.85f);
        // S1.display();
        // S2.display();


    }
}