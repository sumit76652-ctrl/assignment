public class question2 {
    
    public static void main(String[] args) {

        // question 1............

        // int a =5, b=10;
        // int c=(a>b)?a++:b++;
        // System.out.println(a+" "+b+" "+c); // output is 5,11,10

        // question 2............
        
        // int a=3,b=4,c=5;
        // int result = (a>b)?(a>c?a:c):(b>c?b:c);
        // System.out.println(result); // output is 5

        // question 3............

        // int x =10;
        // int y =5;
        // int z = (x>y)?(x<15?x:y):(x>5?y:x);
        // System.out.println(z); // output is 10

        // question 4............

        // int x = 10;
        // int y = 5;
        // int z= 7;
        // int result = (x<y) ? (y<z?z:y):x;
        // System.out.println(result); // output is 10

        // question 5............

        // int a= 1, b=2, c=3;
        // int result = a<b?a<c?c:a:b;
        // System.out.println(result); // output is 3

        // question 6............

        // int a =5;
        // int b = 10;
        // int c = (a>b)?b++:(a<b?--b:b);
        // System.out.println(c); // output is  9

        // question 7............

        // int value =10;
        // int result = (value >5)?(value<8?1:2):3;
        // System.out.println(result); // output is 2

        // question 8,9............

        // int x=5, y=7, z=3;
        // int result1 = (x>y)?(x>z?x:z):(y>z?y:z);
        // System.out.println(result1); // output is 7
        // int result = (x<y)?(x<z?x:z):(y<z?y:z);
        // System.out.println(result); // output is 7

        // question 10............

        // int num=8;
        // String type = (num % 2==0) ?"Even": "odd";
        // System.out.println(type); // output is Even

        // question 11............

        // int num = 244;
        // String type = ((num<=999) && (num>=100))? "three digit number ": "not three digit number";
        // System.out.println(type); // output is three digit number

        // question 12............

        // int num = 12;
        // String type = ((num%3==0) && (num %5==0)) ? 
        // "divisible by 3 and 5" : (num % 3 == 0)? 
        // "divisible by 3 " : (num % 5 == 0) ? 
        // "divisible by 5" :
        //  "not divisible by 3 or 5";
        // System.out.println(type); // output is divisible by 3 or 5

        // question no 13............

        // int x=12, y=4;
        // String type = (x%y==0)? "x is factor of y ": "x is not factor of y";
        // System.out.println(type);  // x is factor of y

        //question no 14.....................

        // int a = 3, b=4, c=6;
        // String result = (a+b>c && a+c>b && b+c>a)? "Triangle is possible": "Triangle is not possible";
        
        // System.out.println(result); // output is Triangle is possible

        // question no 15.....................

        // char AC = 'B';
        // String type = (AC >='A'&& AC <='Z')? "Uppercase" : "not Uppercase";
        // System.out.println(type); // output is Uppercase

        // question no 16.....................

        // char ch = 'g';
        // String type = (ch >='a' && ch <='z') ? "lowercase" : "not lowercase";
        // System.out.println(type); // output is lowercase

        // question no 17.....................

        // char ch = 'a';
        // String type = (( ch >= 'A' && ch <= 'z')||(ch >='a' && ch <= 'z')) ? "isAlphabet": "is not Albhabet";
        // System.out.println(type); // output is is not Albhabet

        // question no 18.....................

        // char ch = '9';
        // String type = (ch >= 'a' && ch <='z' )? "lowercase" 
        // : (ch>='A' && ch <='Z')? "uppercase" :
        //  (ch >='0' && ch <='9')?
        // "digit": "special charater";
        // System.out.println(type);  // output: digit

        //question 19......................

        // int a =5, b=6;
        // String type = (a >b) ? a + " a is bigger than a": b + " b is bigger than a";
        // System.out.println(type); output : 6

        // question 20..............

        // int a = 5, b=6;
        // String type = (a < b) ? a + " a is smaller than b" : b + " b is smaller than a";
        // System.out.println(type);  output : 5

        // question 21...............

        // int a =5, b=9, c=7;
        // String type = (a>b && a>c) ? a + " a is bigger then another two"
        // :(b>a && b>c) ? b + " b is bigger then another two number "
        // : c + " c is bigger then another two number ";
        // System.out.println(type);

        // anotherr method ..........

        // int a = 2;
        // int b = 3;
        // int c = 4;
        // int biggest = ((a>b) && (a<c)) ? a :((b>c)? b:c);
        // System.out.println(biggest);
        
        // question no 23...............

        // int a= 2, b=13, c=24,d=5;
        // String type = (a>b && a>c && a>d)? a + " A is greatest number "
        // : (b>a && b>c && b>d) ? b + " b is greatest number"
        // : (c>a && c>b && c>d) ? c + " c is greatest number "
        // : d + " d is the greatest number ";

        // System.out.println(type);

        // question 22...........

        // int a = 14, b=5, c=6;
        // String type = (a<b && a<c)? a +" a is smallest number "
        // : (b<a && b<a)? b +" b is smallest number"
        // : c +" c is the smallest number";

        // System.out.println(type);

        // question 24............

        // int a=13, b=24, c=55, d=6;
        // String type = (a<b && a<c && a<d)? a+" a is smallest number"
        // :(b<a && b<c && b<d) ? b +" b is smallest number"
        // :(c<a && c<b && c<d) ? c +" c is the smallest number"
        // :d +" di is the smallest number";
        // System.out.println(type);

        // question 25................

        // int year = 400;
        // String type = (year%400==0)? year +" is leap year"
        // :(year %4==0 && year % 100 !=0)? year +" is leap year"
        // :"otherwise not a leap year";
        // System.out.println(type);

        // question 26..............

        // int marks =97;
        // String type =(marks>=75 && marks <=100)? "you got Distinction"
        // : (marks >=60 && marks <75)? "you got first class"
        // : (marks >=50 && marks < 60)? "you got second class"
        // :(marks >=35 && marks < 50) ? "pass"
        // :(marks <=35 )?"fail"
        // :"you will not enter correct marks, please enter your marks";
        // System.out.println(type);

        // question 27...................

        // int a=9, b=2, c=7;
        // System.out.println("welcome");
        


    }
}
