public class main2 {
    public static void main(String[] args) {
        teacher T1 = new teacher();
        T1.name = "Ifty Sir";
        T1.id = 241;
        T1.salary =(float) 1000.0;
        teacher t2 = new teacher();
        t2.setValue("ifto sir", 241, 700);
        T1.display();
        t2.display();
    }
}
