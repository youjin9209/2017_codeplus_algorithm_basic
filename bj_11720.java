package algorithm_basic;
import java.io.*;
import java.util.*;

public class bj_11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(bf.readLine());
		
		String[] line = bf.readLine().split("");
		int sum = 0;
		
		for(int i = 0; i < N; i++) 
			sum += Integer.valueOf(line[i]);
		
		System.out.println(sum);
	}
}