package algorithm_basic;
import java.util.*;
import java.io.*;

public class bj_2751 {
	public static int[] arr;
	public static int[] temp = new int[1000000];
	
	public static int partition(int left, int right) {
		int pivot = arr[(left+right)/2];
		
		while (left < right) {
			while ((arr[left] < pivot) && (left < right)) {
				left++;
			}
			
			while ((arr[right] > pivot) && (left < right)) {
				right--;
			}
			
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		return right;
	}
	
	public static void quicksort(int left, int right) {
		if (left < right) {
			int pivotNewIndex = partition(left, right);
			quicksort(left, pivotNewIndex-1);
			quicksort(pivotNewIndex+1, right);
		}
	}
	
	public static void merge (int start, int end) {
		int mid = (start+end)/2;
		
		int i = start;
		int j = mid + 1;
		int k = 0;
		
		while ((i <= mid) && (j <= end)) { //왼, 오 pivot 비교해서 작은거 넣기 
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		
		while (i <= mid) { //왼쪽 남은거 털어넣기
			temp[k++] = arr[i++];
		}
		
		while (j <= end) { //오른쪽 남은 거 털어넣기 
			temp[k++] = arr[j++];
		}
		
		for (int p = start; p <= end; p++) { // 복사 
			arr[p] = temp[p - start];
		}
	}
	
	public static void mergesort(int start, int end) {
		if (start == end) {
			return;
		}
		
		int mid = (start+end)/2;
		mergesort(start, mid);
		mergesort(mid+1, end);
		merge(start, end);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(bf.readLine());
		arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(bf.readLine());
		}
		
		quicksort(0, arr.length-1);
		//mergesort(0, arr.length-1);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + "\n");
		}
		
		System.out.println(sb);
	}
}