package algorithm_basic;
import java.util.*;

public class bj_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		sc.nextLine();
		
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]+" "+arr[N-1]);
	}
}