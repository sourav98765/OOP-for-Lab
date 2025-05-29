class Employee {
    static String Company_name;  // static variable shared by all employees
    private String Name;
    private float Salary;

    // Method to insert name and salary (company name is static so no need here)
    public void insertValue(String Name, float Salary) {
        this.Name = Name;
        this.Salary = Salary;
    }

    public void display() {
        System.out.println("Company name: " + Company_name + ", Employee name: " + Name + ", Salary is: " + Salary);
    }

    // Constructors
    public Employee() {
        System.out.println("Default constructor called");
    }

    public Employee(String Name) {
        this.Name = Name;
        this.Salary = 0f;  // default salary
    }

    public Employee(String Name, float Salary) {
        this.Name = Name;
        this.Salary = Salary;
    }
    public void setsalary(float salary){
        this.Salary=salary;
    }
    public void setname(String Name)
   {
    this.Name=Name;
   }
   public String getName(){
    return this.Name ;
   }
   public float getsalary (){
    return this.Salary;
   }
}