import java.util.LinkedList;
import java.util.List;

public class AlphaNumbers {
	public static void main(String []args) {
		String str = "12355555";
		List<Integer> alpha = new LinkedList<>();
		List<Integer> beta = new LinkedList<>();
		int arr[] = new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i)-'0';
		}
		for(int i=0;i<arr.length;) {
			if(arr.length-i>=arr[i]) {
			if(checkAlpha(arr, arr[i], i)) {
				alpha.add(arr[i]);
				if(arr[i]==(i+1)) {
					beta.add(arr[i]);
				}
				i=i+arr[i];
			}else {
				i++;
			}
			}
		}
		System.out.println("Alpha : "+alpha);
		System.out.println("Beta : "+beta);
		
	}
	public static boolean checkAlpha(int[] arr, int elem, int pos) {
		for(int i=1;i<=elem;i++) {
			if(arr[pos]!=elem) {
				return false;
			}
			pos++;
		}
		return true;
	}
}
