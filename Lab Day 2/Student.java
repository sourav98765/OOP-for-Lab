public class Student {

    String name ;
    // private int id;
    int id ;
    float cgpa;


void display(){
    System.out.println("Name is" + " " +this.name+ " " + "Id is"+ " " + this.id + " "+ "Cgpa is" + " "+ this.cgpa);
}
void setValue(String name , int id , float cgpa){
    this.name = name ;
    this.id = id;
    this.cgpa = cgpa;
}
float getCgpa(){
    return this.cgpa;
}
public static void main(String[] args) {
    Student S1 = new Student();
        //new memory alloat
        S1.name = "Sourav Saha";
        S1.id = 241;
        S1.cgpa = (float) 4.00;
        S1.display();
}
}