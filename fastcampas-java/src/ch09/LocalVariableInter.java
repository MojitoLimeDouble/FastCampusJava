package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "Hello";
		// str = 3; -> 위에 str을 문자열로 선언했기에 int로 전환 불가능
		System.out.println(str);
	}

}
