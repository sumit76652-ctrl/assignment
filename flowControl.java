import java.util.*;

public class flowControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Scanner input = new Scanner(system.in);
        // System.out.print(" Enter number :");
        
        // int a = input.nextInt();
        // System.out.print("  Enter second number :");
        // int b = input.nextInt();
        // System.out.print("  enter third value : ");
        // int c = input.nextInt();

        //question 1...............

        // if(a > b) {
        //     System.out.println(a + "  first number is big");
        // } else {
        //     System.out.println(b + "  second number is big");
        // }

        // question 2.................

        // if(a==b && b==c){
        //     System.out.println("all are equal ");
        // } else if(a>b && a>c) {
        //     System.out.println("first number is greater");
        // } else if (b>a && b>c){
        //     System.out.println("second number is greater ");
        // }else {
        //     System.out.println("third number is greater");
        // }

        //question 3..................

        // char mod = 'a';

        // if(mod >= 'a' && mod <='z'){
        //     System.out.println("entered charcter is alphabet");
        // } else {
        //     System.out.println("entered charater is not alphabet");
        // }

        // question 4.................

        // System.out.print("Enter a character: ");
        // char ch = input.next().charAt(0);  
        // if(ch >= 'A' && ch<= 'Z'){
        //     System.out.println("given charater is upper case");
        // } else if (ch >= 'a' && ch <= 'z'){
        //     System.out.println("given charcter is lower case");
        // } else {
        //     System.out.println("other alpabet ");
        // }

        // question no 5///////.....................

        // System.out.println("enter anything ");
        // char ch = input.next().charAt(0);
        // if(ch>='A' && ch<='Z'){
        //     System.out.println("given letter is upperCase ");
        // } else if(ch>='a' && ch<='z') {
        //     System.out.println("given letter is lower case");
        // } else if (ch >='0' && ch<='9'){
        //     System.out.println("given charter is digit ");
        // }else {
        //     System.out.println("given character is special char");
        // }

        // question no 6.........................

        // System.out.print("enter first angle : ");
        // int first = input.nextInt();
        // System.out.print("enter second number : ");
        // int second = input.nextInt();
        // System.out.print("enter third number : ");
        // int third = input.nextInt();

        // if((first + second + third ) == 180 ) {
        //     System.out.println("given angle is valid for triangle ");
        // }else {
        //     System.out.println("given angles is not valid for triangle  ");
        // }

        // question no 7.......................

        // System.out.print("enter first side ");
        // int s1 = input.nextInt();
        // System.out.print("enter second side "); 
        // int s2 = input.nextInt();
        // System.out.print("enter third value ");
        // int s3 = input.nextInt();

        // if(((s1 + s2) > s3) && ((s1  + s3) > s2) && ((s2 + s3) > s1)) {
        //     System.out.println("valid tringle");
        // } else {
        //     System.out.println("not valid tringle");
        // }

        // question no 8......................

        // System.out.print("enter first side : ");
        // int s1 = input.nextInt();
        // System.out.print("enter second number : ");
        // int s2 = input.nextInt();
        // System.out.print("enter third number : ");
        // int s3 = input.nextInt();

        // if((s1 ==s2 ) && (s2==s3)){
        //     System.out.println("given triangle is equilateral triangle");
        // } else if ((s1 == s2) || (s1==s3) || (s2==s3)){
        //     System.out.println("given triangle is isosceles triangle");
        // }else {
        //     System.out.println("given triangle is scalene triangle");
        // }

        // question no 9............................

        // System.out.print("please enter year ");
        // int year = input.nextInt();

        // if((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))){
        //     System.out.println("given year is leap year ");
        // } else {
        //     System.out.println("enter year is not lea year");
        // }

        // question no 10 ........................

        System.out.print("enter the value of cp ");
        double cp = input.nextInt();
        System.out.print("enter value of sp ");
        double sp = input.nextInt();

        

        if (sp > cp ){
            double profit = sp - cp;
            double profitPer = (profit /cp) *100;
            System.out.println("profit percent is " + profitPer + "%"  );
        } else if (cp > sp){
            double loss = cp - sp;
            double lossPer = (loss / cp) *100;
            System.out.println("loss percentage is " + lossPer + "%");
        }
        
    }
}
