package unit2.feb23;

public class builder {
    public static void main(String[] args) {
        String str="Hello LPU";
        StringBuilder sb=new StringBuilder("hello LPU");//default constructor creates an empty string builder object with size 16 char

        //append method adds the string to the end of the string builder object and return the same string builder object  
        sb.append("fjask");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(2));
        //string methods are:- length, charAt, indexOf, lastIndexOf, substring, toUpperCase, toLowerCase, concat
        //stringbuilder method are:- append,reverse,charAt,touppercase,tolowercase,concat,lastindexof,indexof,capacity,substring,delete
        System.out.println(sb.lastIndexOf("UPL"));
        System.out.println(sb.indexOf("UPL"));  
        //capacity is the total size of the string builder object
        System.out.println(sb.capacity());
        //substring method returns the substring of the string builder object from the specified index to the end of the string builder object
        System.out.println(sb.substring(0,5));
        //delete
        System.out.println(sb.delete(2, 4));
        // StringBuilder sb1=new StringBuilder(4);//parameterized constructor creates a string builder object with string value and size is 16+string length
        // StringBuilder sb2=new StringBuilder("hello LPU");//parameterized constructor creates a string builder object with string value and size is 16+string length
        // StringBuilder sb3=new StringBuilder(sb2);//copy constructor creates a string builder object with another string builder value
    
    }

}
