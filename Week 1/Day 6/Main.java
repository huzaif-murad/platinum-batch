class Student{
    int roll;
    String name;
    Student p;
}
public class Main {

     public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Huzaif";
        s1.roll=24;
        
        s1.p=new Student();

        s1.p.name="Irfan";
        s1.p.roll=23;
        s1.p.p=new Student();

        s1.p.p.name="Dhiraj";
        s1.p.p.roll=12;

        while(s1!=null){
            System.out.println(s1.name+" "+s1.roll);
            s1=s1.p;
        }

     }
}