package exam03;

public class ChangeTypeExam {

	public static void main(String[] args) {
		
		int num01 = 15;
		long lyNum01 = 20;
		byte byNum01 = 0;
		
		// 자동 형변환
		lyNum01 = num01;
		
		// 강제 형변환
		byNum01 = (byte)num01;
		
		// 범위가 더 큰 형에서 작은 형으로 변환하면 값이 이상해짐
		int num02 = 130;
		byte byNum02 = 0;
		byNum02 = (byte)num02;
		
		System.out.println("형변환1 int " + num01 + "--> long " + lyNum01);
		System.out.println("형변환1 int " + num01 + "--> byte " + byNum01);
		System.out.println("형변환1 int " + num02 + "--> byte " + byNum02);
	}

}
