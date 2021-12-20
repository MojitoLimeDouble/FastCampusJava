package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 ->
				31;
			case 2 ->
				28;
			case 4, 6, 9, 11 -> 
				30;
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				// 반환값을 나타내는 yield			
				yield 0;
			}
		};
		
		System.out.println(month + "월은 " + day + "일 입니다.");
	}

}
