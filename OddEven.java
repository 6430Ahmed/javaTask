import java.io.*;
import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        int num;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter number:");
        num=n.nextInt();
        if(num%2 ==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}