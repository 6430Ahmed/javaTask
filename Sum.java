import java.io.*;
import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        int num1,num2;
        int sum;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num1:");
        num1=s.nextInt();
        System.out.println("Enter num2:");
        num2=s.nextInt();
        sum=num1 + num2;
        System.out.println("Sum of the digit number is:"+sum);
    }
}