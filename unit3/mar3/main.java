
class person{
    String  name;
    int age;
}

class student extends person{
    int rollno;
    float cgpa;


}   
class btech extends student{
    String domain;
}
    

public class main {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="satyarth";
        s1.rollno=123;
        s1.cgpa=9.5f;
        btech b1=new btech();
        b1.domain="cse";    
    }
}