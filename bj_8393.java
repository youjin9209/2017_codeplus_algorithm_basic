package algorithm_basic;
import java.util.*;
import java.math.*;

public class bj_8393 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 int sum = 0;
		 for (int i = 1; i <= N; i++)
			 sum += i;
		 
		 System.out.println(sum);
	}
}