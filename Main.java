public class Main{
    public static void main(String[] args){
        int a=20;
        int b=10;
        int c=30;
        //swapping using multiplication and division
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+" "+b);
        //swapping using addition and subtraction
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        
        //swapping using temp variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        
        //using ternary operator
        int n=(a>b)?a:b;
        System.out.println("Ternary Operator output:");
        System.out.println(n);
        
        //checking odd or even with ternary
        System.out.println((b%2==0)?"b is even":"b is odd");
        
        //checking odd or even with bitwise
        System.out.println(((b&1)==1)?"Odd":"Even"); 
        
        //checking the greatest among 3 numbers
        System.out.println(((a>b)&&(a>c))?"A is greater":(b>c)?"B is greater":"C is greater");
    }
}