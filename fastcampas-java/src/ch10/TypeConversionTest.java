package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		byte bNum = 125;
		int iNum = bNum;
		// �ݴ� byte bNum = iNum ���δ� �ȵ�. byte�� ǥ���� �� �ִ� ������ -128 ~ 127�̱� ������
		
		System.out.println(iNum);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		
		double DNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)DNum + (int)fNum;
		int iNum2 = (int)(DNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
