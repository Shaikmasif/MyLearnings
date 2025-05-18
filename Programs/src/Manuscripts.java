import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Manuscripts {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String manuscripts[] = new String[n];
		for(int i=0;i<=manuscripts.length-1;i++) {
			manuscripts[i] = scan.next();
		}
		String pattern = scan.next();
		List<String> output = checkPattern(manuscripts,pattern);
		System.out.println("Filtered Manuscripts: "+output);

	}

	public static List<String> checkPattern(String[] manuscripts, String pattern) {
		boolean match = false;
		List<String> list = new ArrayList<String>();
		if(pattern!=null) {
			for(int i=0;i<=manuscripts.length-1;i++) {
				if(verify(manuscripts[i],pattern)) {
					match = true;
				}
			}
			
			if(match == true) {
				for(int i=0;i<=manuscripts.length-1;i++) {
					if(verify(manuscripts[i],pattern)) {
						list.add(manuscripts[i]);
					}
				}
			}else {
				for(int i=0;i<=manuscripts.length-1;i++) {
					list.add(manuscripts[i]);
				}
			}
		}else {
			for(int i=0;i<=manuscripts.length-1;i++) {
				list.add(manuscripts[i]);
			}
		}
		Collections.sort(list);

		return list;
	}
	public static boolean verify(String string,String pattern) {
		boolean flag = false;
		for(int i=0;i<=string.length()-1;i++) {
			for(int j=i+1;j<=string.length();j++) {
				if(string.substring(i, j).equals(pattern)) {
					flag = true;
				}
			}
		}
		return flag;
	}
}
