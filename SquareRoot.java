import java .io.*;
import java.util.Scanner;
class SquareRoot{
    public static void main(String[] args){
        int number;
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the number:");
        number=n.nextInt();

        System.out.println("The square root of" +number+" is " + Math.sqrt(number));

    }
}