
package feb4;
public class precedence{
    public static void main(String []args){
        int result = 7 % 4 / 2;
        System.out.println(result);
    }
}


/*
% and / have same precedence(which operation compute 1st) resolve by associativity(left and right) from left to right
x << n = x × 2ⁿ
x >> n = x ÷ 2ⁿ (integer division)
*/