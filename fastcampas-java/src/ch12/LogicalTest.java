package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		// i의 값은 변하지 않음 왜? 앞의 항이 이미 false이기 때문에 뒤에 항을 볼 일이 없음	
		System.out.println(i);
		
		boolean value2 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		
		System.out.println(value2);
		System.out.println(num1);
		// i의 값은 변함 왜? 논리 합(||)이기 때문이고 앞의 값이 false이기 때문에 뒤의 항을 봐야한다.
		System.out.println(i);
	}

}
