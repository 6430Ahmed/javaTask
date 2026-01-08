import java.io.*;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a=n.nextInt();
        System.out.print("Enter Second Number:");
        int b=n.nextInt();
       System.out.println("Enter operators(+,-,*,/,%):") ;
       char op=n.next().charAt(0);
       switch (op){
            case '+':
                System.out.println("Result=" +(a+b));
                break;
            case '-':
                System.out.println("Result=" +(a-b));
                break;

            case '*':
                System.out.println("Result=" +(a*b));
                break;
            case '/':
                System.out.println("Result=" +(a/b));
                break;
            case '%':
                System.out.println("Result=" +(a%b));
                break;
            default:
                System.out.println("Invalid operators");

        }


    }
}