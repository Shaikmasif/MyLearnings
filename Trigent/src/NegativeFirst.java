import java.util.Arrays;

public class NegativeFirst {
	public static void main(String[] args) {
		int arr[] = {-12, -10, 11, -3, -4, 0,5, -2, -7, 6, -8};
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
//		int n = arr.length;
//		int index = 0;
//		int outputArr[] = new int[n];
//		for(int i=0;i<=arr.length-1;i++) {
//			if(arr[i]<0) {
//				outputArr[index] = arr[i];
//				index++;
//			}
//		}
//		
//			for(int x : arr) {
//				if(x>0) {
//					outputArr[index] = x;
//					index++;
//				}
//			}
//		
//		for(int x : outputArr) {
//			System.out.print(x+" ");
//		}
	}
}
