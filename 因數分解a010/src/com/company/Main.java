package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 2; i <= N; i++)
        {
            int CountNumber = 0; //次方數
            while(N % i == 0)
            {
                N /= i;
                CountNumber++;
            }


            if(CountNumber >= 2)
            {
                System.out.print(i + "^" + CountNumber);
                if(N != 1) System.out.print(" * ");
            }

            else if(CountNumber == 1)
            {
                System.out.print(i);
                if(N != 1) System.out.print(" * ");
            }
        }

    }
} ///:~
