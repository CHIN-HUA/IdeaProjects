package com.company;
import java.util.*;
//M = n（n ^ 2 + 1）/ 2


public class Main
{
    public static void main(String[] args) {
        int Nsize;
        int c = 0;
        Scanner scanner = new Scanner(System.in);// 輸入

        while (scanner.hasNext()) {
            Nsize = scanner.nextInt();

            if(c != 0)
            {
                System.out.println(); // 換行
            }
            c++;

            int count = 0;
            int NXN[][] = new int[100][100];// 陣列


            int x = Nsize - 1;//直
            int y = Nsize / 2;//橫
            NXN[x][y] = 1;// 固定中下為1
            int num = 2;
            int Num = Nsize * Nsize;
            if (Nsize % 2 != 0) {

                while (num <= Num) {



                    x = x + 1;
                    y = y + 1;

                    if (x == Nsize && y == Nsize)// 超過橫向邊界 && 超過直行邊界 ex: Nsize = 3，NXN[x = 3][y = 3]
                    {
                        x = x - 2;// 是為原位子往上一格，退回同行
                        y = y - 1;// 是為原位子往上一格，退回同行
                    } else {
                        if (x == Nsize)// 超過橫向邊界
                        {
                            x = 0;// 放到最右邊
                        }
                        if (y == Nsize)// 超過直行邊界
                        {
                            y = 0;// 放到最上方
                        }
                    }
                    if (NXN[x][y] != 0) {
                        x = x - 2; //右下有東西，往原位子上方擺
                        y = y - 1; //右下有東西，往原位子上方擺
                    }

                    NXN[x][y] = num;
                    num += 1;
                }

                for (int i = 0; i < Nsize; i++) {
                    count = count + NXN[i][1];// 每行總和

                }
                System.out.println(count);// 印出加總

                for (int i = 0; i < Nsize; i++) {
                    for (int j = 0; j < Nsize; j++) {
                        System.out.printf("%5d", NXN[i][j]); // 印出方陣
                    }
                    System.out.println(); // 換行
                }

            }
            else {
                System.out.println("It is not an odd number.");
            }


        }
    }

    }