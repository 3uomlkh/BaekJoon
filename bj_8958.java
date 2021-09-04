package BaekJoon;

import java.util.Scanner;

public class bj_8958 {
	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String a[] = new String[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.next();
			int sum = 0;
			int con = 0;
			for(int j = 0;j < a[i].length(); j++) {
				if(a[i].charAt(j) == 'O') {
					con++;
				}
				else {
					con = 0;
				}
				sum = sum + con;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
