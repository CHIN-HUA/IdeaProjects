package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // write your code here
        int i = 0, j;

        //Scanner scanner = new Scanner(System.in);
        //i = scanner.nextInt();

        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt())
        {
             i = scanner.nextInt();


        for (j = 2; j <= i; j++)
        {

            while (i != j)
            {
                if (i % j == 0)
                {
                    System.out.print(j + " " );
                    i = i / j;
                }
                else
                    break;

            }

        }System.out.println( i );
        }
    }
}

