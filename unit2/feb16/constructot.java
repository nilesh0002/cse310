package unit2.feb16;
class Student{
    String name;
    int age;
    float gpa;

    Student(String n,int a,float g){
        System.out.print("student obj created");
        name=n;
        age=a;
        gpa=g;
    }

    Student(){
        System.out.println("student obj created");
    }

    Student(student obj){
        System.out.println("copy object created");
        name=obj.name;
        age=obj.age;
        gpa=obj.gpa;
    }
}


/*

*/