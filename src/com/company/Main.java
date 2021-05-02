package com.company;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        double[] Number;
        while (count < number)
        {
            int[] arr = new int[6];
            for (int arrayN = 0; arrayN < 6; arrayN++)
            {
                arr[arrayN] = scanner.nextInt(); //輸入座標點
            }

            Triangle Tri = new Triangle(arr);


            if (Tri.mathcalulating() > 0.0)
            {
                Number = Tri.newLine();
                System.out.printf("%.3f %.3f %.3f %.3f\n", Number[0], Number[1], Number[2], Tri.mathcalulating());
            }
            else
            {
                System.out.print("Just Line!");
                System.out.print("\n");
            }
            count++;
        }
    }

    public static class Triangle {
        Point2D A_Line = new Point(); //Point2D 類別定義表示 (x,y) 坐標空間中位置的點
        Point2D B_Line = new Point();
        Point2D C_Line = new Point();
        double[] Line = new double[3];

        public Triangle(int[] arr) {
            A_Line.setLocation(arr[0], arr[1]); //setLocation(int x, int y)：将组件移到新位置，用x 和 y 参数来指定新位置的左上角
            B_Line.setLocation(arr[2], arr[3]);
            C_Line.setLocation(arr[4], arr[5]);
        }

        public double mathcalulating() {
            double A_LineB_Line = this.A_Line.distance(this.B_Line); //定義三邊長
            double B_LineC_Line = this.B_Line.distance(this.C_Line);
            double A_LineC_Line = this.A_Line.distance(this.C_Line);
            this.Line[0] = A_LineB_Line;
            this.Line[1] = B_LineC_Line;
            this.Line[2] = A_LineC_Line;
            double S_number;
            double S_math;
            S_number = (A_LineB_Line + B_LineC_Line + A_LineC_Line) / 2.0;
            S_math = Math.sqrt(S_number * (S_number - A_LineB_Line) * (S_number - B_LineC_Line) * (S_number - A_LineC_Line));
            return S_math;
        }

        public double[] newLine() {
            Arrays.sort(this.Line); //排序小到大
            return this.Line;
        }
    }
}