package algorithm_basic;
import java.util.*;

public class bj_1260 {
	static ArrayList<Integer>[] a;
	static boolean[] visited;
	
	public static void dfs(int x) {
		if (visited[x])  //backtrack
			return;
		
		visited[x] = true;
		System.out.print(x +" ");
		
		for (int y : a[x]) {
			if (visited[y] == false)
				dfs(y);
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int x = queue.remove();
			System.out.print(x + " ");
			
			for (int y : a[x]) {
				if (visited[y] == false) {
					visited[y] = true;
					queue.add(y);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int start = sc.nextInt();
		
		a = (ArrayList<Integer>[]) new ArrayList[N+1];
		
		for (int i = 1; i <= N; i++)
			a[i] = new ArrayList<Integer>();
		
		for (int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a[u].add(v);
			a[v].add(u);
		}
		
		for (int i = 1; i <= N; i++)
			Collections.sort(a[i]);
		
		visited = new boolean[N+1];
		dfs(start);
		System.out.println();
		
		visited = new boolean[N+1];
		bfs(start);
		System.out.println();
	}
}