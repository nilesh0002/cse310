package unit2.feb18;

class student{
    String name;
    int age;
    float gpa;

    student(String name,int age,float gpa){
        this(name);
        System.out.print("student obj created");
        this.age=age;
        this.gpa=gpa;
    }

    student(String name){
        this();
        System.out.println("student obj created");  
        this.name=name;
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
    public student setValue(int age){
        this.age=age;
        return this;
    }

    public student setValue(String name){
        System.out.println(name+" "+age+" "+gpa);
        return this;
    }
    public student print(){
        System.out.println(name+" "+age+" "+gpa);
        return this;
    }
}
    public class Main4{
    public static void main(String[] args) {
        student s1=new student("satyarth",19,9.5f);
        s1.print();
        s1.setValue(25);
        s1.print();
        s1.setValue("Rakesh");
        s1.print();

    }
}


