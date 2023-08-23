package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		String place = "금정구, 동래구, 사하구, 강서구";
		
		/*
		 * StringBuilder를 활용하여
		 * 금정/동래/사하/사상/강서
		 * 가 출력되도록 하시오
		 */
		
		System.out.println(stringBuilder);
		
		StringBuilder stringBuilder2 = new StringBuilder();
		
		int index = place.indexOf("구");
		stringBuilder2.append(place.substring(index-2, index) + "/");
		
		index = place.indexOf("구", index + 1);
		stringBuilder2.append(place.substring(index-2, index) + "/");

		index = place.indexOf("구", index + 1);
		stringBuilder2.append(place.substring(index-2, index) + "/사상/");

		index = place.indexOf("구", index + 1);
		stringBuilder2.append(place.substring(index-2, index));
		
		System.out.println(stringBuilder2);
		
		StringBuilder stringBuilder3 = new StringBuilder();
		stringBuilder3.append(place);
		
		int index2;
		index2 = stringBuilder3.indexOf("구");
		stringBuilder3.delete(index2, index2 + 3);
		index2 = stringBuilder3.indexOf("구");
		stringBuilder3.delete(index2, index2 + 3);
		index2 = stringBuilder3.indexOf("구");
		stringBuilder3.delete(index2, index2 + 3);
		index2 = stringBuilder3.indexOf("구");
		stringBuilder3.delete(index2, index2 + 3);
		
		System.out.println(stringBuilder3);
		
	}

}
