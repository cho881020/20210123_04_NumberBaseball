package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		컴퓨터가 3자리 숫자를 출제.
//		객체지향을 배운후에는 랜덤 3자리 문제로 변경.
		
		int[] cpuNumbers = {7, 4, 1};
		
//		스캐너는 한번만 만들어 두면 되니, while 앞에서 만들자.
		Scanner scan = new Scanner(System.in);
		
//		몇번 시도했는지 기록할 변수
		int inputCount = 0;
		
//		3S를 맞출때 까지 반복해서 입력받자.
		while(true) {
			
			System.out.print("3자리 숫자 입력 : ");
			int input = scan.nextInt();
			
//			한번 더 입력했다고 기록.
			inputCount++;
			
//			배열 {7,4,1} Vs. 입력값 741 => {7,4,1} 로 분해 작업 필요.
			
			int[] myNumbers = new int[3];
			
//			myNumbers의 0번칸 : 입력값의 100의자리.
			myNumbers[0] = input / 100;
			
//			myNumbers의 1번칸 : 입력값의 10의자리. => 741 / 10 % 10
			myNumbers[1] = input / 10 % 10;
			
//			myNumbers의 2번칸 : 입력값의 1의자리.
			myNumbers[2] = input % 10;
			
//			얻어내고 싶은것 : 스트라이크 ?개, 볼 ?개
			int strikeCount = 0;
			int ballCount = 0;
			
//			?S ?B인지 판단하는 로직 => 내 숫자 들고 (i) / 컴퓨터숫자 (j)와 대조 for문 중첩.
			
			for (int i=0 ; i < myNumbers.length ; i++) {
				
				for (int j=0 ; j < cpuNumbers.length ; j++) {
					
//					내번호의 i번째 와 컴퓨터숫자의 j번째가 같은가?
//					같은 숫자인가?
					if (myNumbers[i] == cpuNumbers[j]) {
						
//						숫자가 같다는건 OK. => 위치도 같은가?
						if (i==j) {
//							숫자도 같고, 위치도 같다. => S 찾았다!
							strikeCount++;
						}
						else {
//							숫자는 같지만, 위치가 다르다. => B 찾았다!
							ballCount++;
						}
						
					}
					
				}
				
			}
			
			
//			구해진 S/B 갯수를 알려주자.
			System.out.println(strikeCount+"S "+ ballCount + "B 입니다.");
			
//			S/B 갯수 판단이 끝나고 나면 => 3S인지 확인.
			if (strikeCount == 3) {
//				정답 맞춤.
				System.out.println("축하합니다.! 정답을 맞췄습니다.");
				
//				몇번만에 맞췄는지?
				System.out.println(inputCount+"회 만에 맞췄습니다.");
				
//				이제 그만 입력하도록 => while문을 종료.
				break;
			}
			
			
		}
		
	}

}









