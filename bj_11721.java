package algorithm_basic;

import java.io.*;

public class bj_11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split("");
		
		for(int i = 0; i < line.length; i++) {
			System.out.print(line[i]);
			if((i+1)%10 == 0)
				System.out.println();
		}
	}
}