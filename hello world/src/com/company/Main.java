package com.company;

import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String[] args)
    {

        int number, count_number = 0;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt(); // 輸入
        int []arr = new int[10000]; // 次數
        int sum = 1; // 相乘整數
        int count_sum = 0;
        count_number = number;

        for(int wear = 1; wear <= 10000; wear++)
        {
            for(int lineawear = 2; lineawear <= 10000; lineawear++)
            {
                if(number % lineawear == 0)
                {
                    number /= lineawear;
                    arr[lineawear]++;
                    break;
                }
            }
            if(number == 1)
            {
                break;
            }
        }

        for(int mathnumber = 2; mathnumber <= 100; mathnumber++)
        {
            if(arr[mathnumber] % 2 != 0)
            {
                sum *= mathnumber;
            }
        }
        count_sum = sum;
        count_sum = count_number * count_sum;
        System.out.print(sum +" " + count_sum);
        System.out.println();
    }
}