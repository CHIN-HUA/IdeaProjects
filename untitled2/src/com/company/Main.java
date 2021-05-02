package com.company;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main
{
    public static void main(String[] args)
    {
        String nameString;
        String[] arr = new String[10000]; // 字串陣列
        float num1 = 0;
        float str = 0;

        int run = 0;

        Scanner scanner = new Scanner(System.in);

        nameString = scanner.nextLine();




        StringTokenizer st = new StringTokenizer( nameString , ", + - * / % () ");// 字串分解

        while(st.hasMoreElements())
        {
            arr[run] = st.nextToken();//讀入陣列
            run++;
        }

        for( int ike = 0 ; ike < run ; ike++)
        {
            System.out.print(arr[ike]);

            if(ike != run-1)
            {
                System.out.print(" ");//最後不能有空行
            }

        }
        System.out.println();

        StringTokenizer sb = new StringTokenizer( nameString , ". 0 1 2 3 4 5 6 7 8 9");// 字串分解

        String[] qaz = nameString.split("1|2|3|4|5|6|7|8|9|0|\\.");

        String qwe ="";
        for( int i = 0 ; i < qaz.length ; i++)// 中間那行處理正確//結尾不要空格
        {
            qwe += qaz[i];
        }

        char yee []  = qwe.toCharArray();

        for( int i = 0 ; i < yee.length ; i++)
        {

            System.out.print(yee[i]);
            if(i != yee.length-1)
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        /*while(sb.hasMoreElements())
        {
            System.out.print(sb.nextToken());// 印出數字
            System.out.print(" ");
        }
        System.out.println();*/

        for( int run1 = 0 ; run1 < run ; run1++)
        {
            num1 = Float.parseFloat( arr[run1] );
            str = str + num1;
        }
        System.out.printf("%.3f",str);
        System.out.print("\n");
    }
}
