import java.io.*;
import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter the first number:");
        num1=n.nextInt();
        System.out.print("Enter the second number:");
        num2=n.nextInt();
        sum=num1+num2;
        System.out.println("sum is:" +sum);
    }
}