import java.io.*;
import java.util.Scanner;
Public class Details {
    public static void main(String[] args){
        String name, city, address;
        int age,telephone;
        Scanner x=new Scanner(System.in);
        System.out.print("Enter name:");
        name = x.nextLine();
        System.out.print("Enter address:");
        address =x.nextLine();
        System.out.print("Enter city:");
        city= x.nextLine();
        System.out.print("Enter telephone:");
        telephone = x.nextInt();
        System.out.print("Enter age:");
        age= x.nextInt();
        System.out.println("Welcome");
    }
}