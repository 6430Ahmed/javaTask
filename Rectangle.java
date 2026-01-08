import java.io.*;
import java.util.Scanner;
public class Rectangle{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter length:");
        int l=n.nextInt();
        System.out.print("Enter width:");
        int w=n.nextInt();
        int pre=2*(l+w);
        System.out.println("perimeter ="+ pre);

    }
}