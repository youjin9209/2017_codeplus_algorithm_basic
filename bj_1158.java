package algorithm_basic;
import java.util.*;

public class bj_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<Integer>();
		sb.append("<");
		
		//initialize queue
		for(int i = 1; i <= N; i++)
			queue.offer(i);
		
		// 1,2 살리고 3 죽이고 - 맨 마지막꺼는 굳이 처리안해도 되니까 N-1번 
		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j < M-1; j++) {
				queue.offer(queue.poll()); // 1, 2
			}
			sb.append(queue.poll()+", "); //3
		}
		
		sb.append(queue.poll() + ">"); //the last one
		System.out.println(sb);
	}
}