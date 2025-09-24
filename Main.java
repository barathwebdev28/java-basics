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

        //Switch case to determine grade
        int value;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter marks:");
        value=scan.nextInt();
        if(value>=91 && value<=100){
            System.out.println("O grade");
        }
        else if(value>=81 && value<=90){
            System.out.println("A grade");
        }
        else if(value>=71 && value<=80){
            System.out.println("B grade");
        }
        else if(value>=61 && value<=70){
            System.out.println("C grade");
        }
        else if(value>=51 && value<=60){
            System.out.println("D grade");
        }
        else if(value<50 && value>=0){
            System.out.println("F grade");
        }
        else{
            System.out.println("Invalid");
        }
        
        //nested loop with labels
        a:
        for(int i=1;i<=5;i++){
            b:
            for(int j=1;j<=5;j++){
            System.out.println(i+" "+j);
            if(i==3){
                break a;
            }
            }
        }
        System.out.println(" ");
        //condition stuff
        for(int i=0,j=0;i<5&&j<3;i++,j++){
            System.out.println(i+" "+j);
        }
    }
}



