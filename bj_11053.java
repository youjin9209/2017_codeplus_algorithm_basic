package algorithm_basic;

import java.util.Scanner;

public class bj_11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] d = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
				}
			}
		}
		
		int max = d[0];
		for (int i = 0; i < n; i++) {
			if (max < d[i]) {
				max = d[i];
			}
		}
		System.out.println(max);
	}
}