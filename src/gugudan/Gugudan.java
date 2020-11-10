//N을 입력받은 후 구구단 N단 출력
package gugudan;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i =1; i<=9; ++i ) {
			System.out.println(n +"*"+i+"="+(n *i));
		}
	

	}

}
