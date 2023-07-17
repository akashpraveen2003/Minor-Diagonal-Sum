package minor_diagonal_sum;

import java.util.Scanner;

/*
   You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
	Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
 */

public class Minor_diagonal_Sum {
	
	private static int minor_diagonal_sum(int[][] array) {
		int sum=0;
		int i=0;
		int j=array.length-1;
		for(i=0;i<array.length;i++)
		{
			sum+=array[i][j--];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int array[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		System.out.println(minor_diagonal_sum(array));
	}
}

/*
  	Input
	[
    [1, -2, -3],
    [-4, 5, -6],
    [-7, -8, 9] 
    ]

	Output
	-5
	
	Input
	[
    [3, 2],
    [2, 3] 
    ]

	Output
	4
*/
