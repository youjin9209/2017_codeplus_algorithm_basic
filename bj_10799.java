package algorithm_basic;
import java.io.*;
import java.util.*;

public class bj_10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		String[] line = bf.readLine().split("");
		int i = 0;
		int count = 0;
		
		while (i < line.length) {
			if (line[i].equals("("))
				stack.push(i);
			else  {
				if (stack.peek() + 1 == i) { // index가 1 차이가 나는지 
					stack.pop();
					count += stack.size();
				} else {
					count += 1;
					stack.pop();
				}
			}
			i++;
		}
		System.out.println(count);
	}
}