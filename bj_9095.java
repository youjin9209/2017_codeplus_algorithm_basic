package algorithm_basic;

import java.util.Scanner;

public class bj_9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] d = new int[11];
		d[0] = d[1] = 1;
		d[2] = 2;
		
		for (int i = 3; i <= 10; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		} 
			
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
		
	}
}