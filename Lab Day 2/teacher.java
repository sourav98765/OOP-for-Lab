public class teacher {
    
    // Fields (Instance Variables)
    String name;
    int id;
    float salary;

    // Method to set values
    void setValue(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display teacher details
    void display() {
        System.out.println("Name is " + this.name + ", ID is " + this.id + ", Salary is " + this.salary);
    }

    // Method to get salary
    float getSalary() {
        return this.salary;
    }
}
