public class main {
    public static void main(String[] args) {
        Employee.Company_name = "EX";  // Set static company name once

        Employee e1 = new Employee();
        // E1.insertValue("Saha", 20000f);
        // E1.display();

        // Employee e2 = new Employee("Sourav");
        // e2.display();

        // Employee e3 = new Employee("Sourav", 30000f);
        // e3.display();
        e1.setname("Cde");
        e1.setsalary(2000);
        System.out.println(e1.getsalary());
        String name =e1.getName();
        System.out.println(name);
        
    }

}