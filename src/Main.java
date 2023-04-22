/*
Question : Given two number x and y. Find the greatest common divisor of
          x and y using recursion.
_____________________________________________________________________________________________________
Constraints : 0<= x , y <= 10^6
_____________________________________
I/O : x = 4 , y = 9
______________________
O/P : 1
 */


import java.util.Scanner;

public class Main {
    static int GreatestCommonDivisor(int FirstNumber, int SecondNumber){
        if (SecondNumber == 0)
            return FirstNumber;
        return GreatestCommonDivisor(SecondNumber, SecondNumber % FirstNumber);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstNumber,SecondNumber,starting,reminder;
        System.out.println("Enter the first number :");
        FirstNumber = sc.nextInt();
        System.out.println("Enter the second number :");
        SecondNumber = sc.nextInt();
        System.out.println("Brute force approach : Printing the result : Without Recursion.");

       for (starting = FirstNumber; starting >= 1; starting--){
           if (FirstNumber % starting == 0 && SecondNumber % starting == 0){
               System.out.println(starting);
               break;
           }
       }
        System.out.println("Second approach  : For finding GCD is :" );
           while (FirstNumber % SecondNumber != 0){
               reminder = FirstNumber % SecondNumber;
               FirstNumber = SecondNumber;
               SecondNumber = reminder;
           }
           System.out.println(SecondNumber);
        System.out.println("Printing the result by using recursion :");
        System.out.println(GreatestCommonDivisor(FirstNumber,SecondNumber));
    }
}
