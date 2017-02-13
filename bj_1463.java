package algorithm_basic;

import java.util.Scanner;

public class bj_1463 {
	public static int d[];
	public static int makeone(int n) {
		if (n == 1) return 0;
		if (d[n] > 0) return d[n];
		d[n] = makeone(n-1) + 1;
		
		if (n%2 == 0) {
			int temp = makeone(n/2) + 1;
			if (d[n] > temp)
				d[n] = temp;
		}
		if (n%3 == 0) {
			int temp = makeone(n/3) + 1;
			if (d[n] > temp)
				d[n] = temp;
		}
		return d[n];
	}
	
	public static void main(String[] args) {
		//top down
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		d = new int[N+1]; 
		d[1] = 0;
		/* bottom up
		for (int i = 2; i <= N; i++) {
			d[i] = d[i-1] + 1;
			if ((i%2 == 0) && (d[i] > d[i/2] + 1)) {
				d[i] = d[i/2] + 1;
			}
			if ((i%3 == 0) && (d[i] > d[i/3] + 1)) {
				d[i] = d[i/3] + 1;
			}
		}
		*/
		makeone(N);
		System.out.println(d[N]);
	}
}