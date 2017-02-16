package algorithm_basic;

import java.util.Scanner;

public class bj_11055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			d[i] = a[i];
			for (int j = 0; j < i; j++) {
				if ((a[j] < a[i]) && (d[i] < d[j] + a[i])) {
					d[i] = d[j] + a[i];
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