import java.util.*;
import java.lang.*;
public class magicSqr {
    public static int solution(int [][] A) {
     int n = 1;
    int maxsum = 0;
    int row;
    int number = 1;
    int col = n / 2;
    int colSum = 0, rowSum = 0, dSum = 0;
    for (int i = 0; i < A[0].length; i++ ) {
        for (int j = 0; j < A.length; j++ ) {
              if (i == j) {
                n = i*j;
                for (row = i; 0 <= row; row--) {
                    if (row == -1) {
                        row++;
                        break;
                    }
                 if (col == -1 ) {
                     col++;
                    break;
                }
                         rowSum += A[row][col];
                    for (col = n/2; 0 <= col; col--) {
                        if (col == -1 ) {
                             col++;
                             break;
                        }
                          colSum += A[row][col];
                        if (row == col)
                             dSum += A[row][col];

                             maxsum = rowSum;

                    if (dSum == rowSum) {
                         if (maxsum <= rowSum) {
                             System.out.println(colSum +  " " + rowSum + " " + dSum);
                           maxsum += rowSum;
                           number = n;

                    }


                }


                }

            }

        }
    }

    }
    return (int) Math.sqrt(n);
}
    public static void main(String [] args) {
        int [][] A = {{4, 3, 4, 5, 3},
                      {2, 7, 3, 8, 4},
                      {1, 7, 6, 5, 2},
                      {8, 4, 9, 5, 5}};
     int [][] B = {{2, 2, 1, 1},
                   {2, 2, 2, 2},
                   {1, 2, 2, 2}};
     int [][] C = {{7, 2, 4},
                   {2, 7, 6},
                   {9, 5, 1},
                   {4, 3, 8},
                   {3, 5, 4}};
        System.out.println(solution(C));

    }
}