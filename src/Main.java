
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //task 1
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please Input youre age  ");
//            int myAge = scanner.nextInt();
//            System.out.println("Please Input youre friends age ");
//            int friendsAge = scanner.nextInt();
//            System.out.println("My age is " + myAge);
//            System.out.println("My  friend age  is" + friendsAge);
//            System.out.println(myAge + friendsAge);

        //task 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Pleasr input first number ");
//        int firstElement = scanner.nextInt();
//        System.out.println("Pleasr input second number ");
//        int secondElement = scanner.nextInt();
//        System.out.println(firstElement > secondElement);
        //task3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input first number ");
//        int firstElement = scanner.nextInt();
//        System.out.println("Please input second number");
//        int secondElement = scanner.nextInt();
//        System.out.println(firstElement % secondElement);
//task 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number ");
        short firstElement = scanner.nextShort();
        System.out.println("Please input second number ");
        int secondElement = scanner.nextInt();
        System.out.println("Please input third number ");
        float thirdElement = scanner.nextFloat();
        System.out.println(firstElement + secondElement + thirdElement);
        float sum = firstElement + secondElement + thirdElement;
        System.out.println("sum is "+ sum %  3 );


    }

}
