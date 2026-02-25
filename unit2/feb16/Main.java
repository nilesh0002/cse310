package unit2.feb16;
class student{
    String name;
    int age;
    float gpa;

    public void print(){
        System.out.println(name+" "+ age +" "+gpa);
    }
}
public class Main {
    public static void main(String[]args){
        student s1=new student();
        s1.name="Student 1";
        s1.age=24;
        s1.gpa=8.84f;
        s1.print();
        // student s2= new student();


    }
}
/*
instanace variable,inplicit,

if it is static by default we dont have to create obj
if cant call non static  memeber in static class 

speciak member
 get automatically invoke
 

*/
