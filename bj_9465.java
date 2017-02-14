package algorithm_basic;
import java.io.*;
import java.util.*;

public class bj_9465 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		while (T-- > 0) {
			int n = Integer.valueOf(br.readLine());
			long[][] a = new long[n+1][2];
			
			String[] line1 = br.readLine().split(" ");
			for (int i = 1; i <= n; i++) {
				a[i][0] = Long.valueOf(line1[i-1]);
			}
			
			String[] line2 = br.readLine().split(" ");
			for (int i = 1; i <= n; i++) {
				a[i][1] = Long.valueOf(line2[i-1]);
			}
			
			long[][] d = new long[n+1][3];
			for (int i = 1; i <= n; i++) {
				d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
				d[i][1] = Math.max(d[i-1][0], d[i-1][2]) + a[i][0];
				d[i][2] = Math.max(d[i-1][0], d[i-1][1]) + a[i][1];
			}
			
			long ans = 0;
			ans = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
			System.out.println(ans);
		}
	}
}