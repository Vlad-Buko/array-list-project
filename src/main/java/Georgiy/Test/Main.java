package Georgiy.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Matrix[][] = new int[3][3];
        int i, j, determinant, a, b, c;


        System.out.println("Enter matrix 3x3: ");

        for(i = 0; i < Matrix.length; i++)
        {
            for(j = 0; j < Matrix[0].length; j++)
            {
                String str = br.readLine();
                Matrix[i][j] = Integer.parseInt(str);
            }
        }

        System.out.println("Matrix 3x3: ");

        for(i = 0; i < Matrix.length; i++)
        {
            for(j = 0; j < Matrix[0].length; j++)
            {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        a = (Matrix[0][0] * (Matrix[1][1] * Matrix[2][2] - Matrix[1][2] * Matrix[2][1]));
        b = (Matrix[0][1] * (Matrix[1][0] * Matrix[2][2] - Matrix[1][2] * Matrix[2][0]));
        c = (Matrix[0][2] * (Matrix[1][0] * Matrix[2][1] - Matrix[1][1] * Matrix[2][0]));

        determinant = a - b + c;

        System.out.println("Determinant of matrix 3x3: " + determinant);
    }
}
