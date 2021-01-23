package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		컴퓨터가 3자리 숫자를 출제.
//		객체지향을 배운후에는 랜덤 3자리 문제로 변경.
		
		int[] cpuNumbers = {7, 4, 1};
		
//		스캐너는 한번만 만들어 두면 되니, while 앞에서 만들자.
		Scanner scan = new Scanner(System.in);
		
//		3S를 맞출때 까지 반복해서 입력받자.
		while(true) {
			
			System.out.print("3자리 숫자 입력 : ");
			int input = scan.nextInt();
			
//			배열 {7,4,1} Vs. 입력값 741 => {7,4,1} 로 분해 작업 필요.
			
			int[] myNumbers = new int[3];
			
//			myNumbers의 0번칸 : 입력값의 100의자리.
			myNumbers[0] = input / 100;
			
//			myNumbers의 1번칸 : 입력값의 10의자리. => 741 / 10 % 10
			myNumbers[1] = input / 10 % 10;
			
//			myNumbers의 2번칸 : 입력값의 1의자리.
			myNumbers[2] = input % 10;
			
			
		}
		
	}

}









