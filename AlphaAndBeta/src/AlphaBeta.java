import java.util.Scanner;

public class AlphaBeta {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		String str = scan.nextLine();
		int n = str.length();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = str.charAt(i)-'0';
		}
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.print("Alpha : ");
		int count=0;
		for(int i=0;i<n;i+=count) {
			int elem = arr[i];
			if(check(arr,arr[i],(i))){
				System.out.print(arr[i]+" ");
				count = elem-0;
			}else {
				count=1;
			}
			
		}
		System.out.println();
		System.out.print("Beta : ");
		count=0;
		for(int i=0;i<n;i+=count) {
			int elem = arr[i];
			if(checkBeta(arr,arr[i],(i))){
				System.out.print(arr[i]+" ");
				count = elem-0;
			}else {
				count=1;
			}
		}
	}
	private static boolean checkBeta(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(check(arr, i, j)) {
			if(i==(j+1)) {
				return true;
			}
		}
		return false;
	}
	private static boolean check(int[] arr, int num, int j) {
		// TODO Auto-generated method stub
		int index = j;
		int count=0;
		for(int i=1;(i<=num && j<=arr.length-1);i++) {
			if(arr[j] == num) {
				count++;
			}
			j++;
		}
		
		if(count==num) {
			return true;
		}else {
			return false;
		}
	}

}
