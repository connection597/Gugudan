package gugudan;

import java.util.Scanner;

public class Tset2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(!(1 <= a && a <= 9)) {
			System.exit(0);
		}
		for(int i =1; i<10; i++) {
			System.out.println(a +"*"+ i + "=" + a *1);
		}

	}

}
