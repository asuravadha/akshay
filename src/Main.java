import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b;
        String operation;
        System.out.println("enter a,b values");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("choose any one of this (+,-,*,/,%) to perform operation");
        operation=input.next();
        if(operation.equals("+")){
            System.out.println("a+b is "+(a+b));
        }
         else if(operation.equals("-")){
            System.out.println("a-b is "+(a-b));
        }
        else if(operation.equals("*")){
            System.out.println("a*b is "+(a*b));
        }
        else if(operation.equals("/")){
            System.out.println("a/b is "+(a/b));
        }
        else if(operation.equals("%")){
            System.out.println("a%b is "+(a%b));
        }
        else{
            System.out.println("invalid operation");
        }







//        int a;
//        Scanner input=new Scanner(System.in);
//        a=input.nextInt();
//        if(a>0){
//            System.out.println("positive");
//            if(a<=100){
//                System.out.println("its below 100");
//            }
//            else{
//                System.out.println("its above 100");
//            }
//        }
//        else if(a<0){
//            System.out.println("negative");
//        }
//        else{
//            System.out.println("zero");
//        }




//        int age;
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter  your age :");
//        age=input.nextInt();
//        if(age>18){
//            System.out.print("\neligible because your age is "+age);
//        }
//        else{
//            System.out.print("\nnot eligible because your age is "+age);
//        }



        //logical

//        System.out.println(!(true));
//        System.out.println(!(false));
//
//        int a=0;
//        System.out.println(!(a<0));//false    false
//        System.out.println(a>0);//true      false
//        System.out.println(a<=0);//false    true
//        System.out.println(a>=0);//false    true
       //arith operators
//    float a=13,b=2;
//    System.out.println("a is "+a+"\nb is "+b);
//    System.out.println("a+b is "+(a+b));
//    System.out.println("a-b is "+(a-b));
//    System.out.println("a*b is "+(a*b));
//    System.out.println("a/b is "+(a/b));
//    System.out.println("a%b is "+(a%b));

    }
}
