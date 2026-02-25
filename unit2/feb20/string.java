package unit2.feb20;

public class string {
    public static void main(String[] args) {    
    String str="satyarth";

    String str1=new String();//default constructor creates an empty string
    System.out.println(str1);

    String str2=new String(str);
    System.out.println(str2);

    String str3=new String(new byte[]{65,66,67});
    System.out.println(str3);

    String str4=new String(new char[]{'a','b','c'});
    System.out.println(str4);
    
    //offset=starting index
    //count=number of characters to be taken
    String str5=new String(new char[]{'a','b','c','d','e','f'},1,2); 
    System.out.println(str5);
    System.out.println(str5.length());
    System.out.println(str5.charAt(1)); // 0-based index, so index 1 is 'b'
    System.out.println(str5.contains(str5)); // Check if str5 contains itself
    System.out.println(str5.split("")); // split str5 into an array of characters
    System.out.println(str5);
    //input

    String str6=new String(new StringBuilder("hello world"));
    System.out.println(str6);
    }
}
