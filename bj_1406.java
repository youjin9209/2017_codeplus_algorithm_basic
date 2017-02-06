package algorithm_basic;
import java.util.*;
import java.io.*;

public class bj_1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//cursor를 기준으로 left, right stack 만들기 
		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		
		String[] line = bf.readLine().split("");
		
		for (int i = 0; i < line.length; i++)
			left.push(line[i]);
		
		int N = Integer.valueOf(bf.readLine());
		
		for (int i = 0; i < N; i++) {
			String[] cmd = bf.readLine().split(" ");
			if (cmd[0].equals("L")) {//left pop right push
				if(!left.empty()) {
					right.push(left.peek());
					left.pop();
				} 
			} else if (cmd[0].equals("D")) { //right pop left push
				if(!right.empty()) {
					left.push(right.peek());
					right.pop();
				}
			} else if (cmd[0].equals("B")) { // left pop
				if(!left.empty())
					left.pop();
			} else if (cmd[0].equals("P")) {// left push
				left.push(cmd[1]);
			}
		}
		
		while(!left.empty()) 
			right.push(left.pop());
		
		
		while(!right.empty()) 
			System.out.print(right.pop());
	}
}