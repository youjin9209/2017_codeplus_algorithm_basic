package algorithm_basic;

import java.util.Scanner;

public class bj_2193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] d = new long[N+1];
		
		d[1] = d[2] = 1;
		
		for (int i = 3; i <= N; i++) 
			d[i] = d[i-1] + d[i-2];
		
		System.out.println(d[N]);
	}
}