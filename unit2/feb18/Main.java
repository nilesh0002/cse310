package unit2.feb18;

class student{
    String name;
    int age;
    float gpa;

    student(String name,int age,float gpa){
        System.out.print("student obj created");
        this.name=name  ;
        this.age=age;
        this.gpa=gpa;
    }

    student(){
        System.out.println("student obj created");
    }

    student(student obj){
        System.out.println("copy object created");
        name=obj.name;
        age=obj.age;
        gpa=obj.gpa;
    }
}
    public class Main {
    public static void main(String[] args) {
        student s1=new student("satyarth",19,9.5f);
        student s2=new student(s1);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gpa);
    }
}


