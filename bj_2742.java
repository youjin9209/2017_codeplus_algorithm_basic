package algorithm_basic;

import java.util.Scanner;

public class bj_2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int i;
		
		for (i = N; i > 0; i--)
			sb.append(i+"\n");
		System.out.println(sb);
	}
}