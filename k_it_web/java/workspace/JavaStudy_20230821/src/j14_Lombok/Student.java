package j14_Lombok;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.NonFinal;

@NoArgsConstructor // 기본생성자
@RequiredArgsConstructor
@AllArgsConstructor // 전체생성자
//@Setter // 세터
//@Getter // 게터
//@EqualsAndHashCode // 해쉬코드 이퀄
//@ToString // 투스트링
@Data //세터, 게터, 해쉬코드, 위퀄, 투스트링 전체 포함
// 하지만 private한 환경에는 사용하면 안됨

public class Student {
	
	@NonFinal
	private int studentCode;
	@NonNull
	private String name;
	private int studentYear;
	private int age;
	
	/*
	 * 만들어야 할 것
	 * 1. 기본생성자
	 * 2. 전체생성자
	 * 3. 게터 세터
	 * 4. toString
	 * 5. hashcode and Equals
	 */
	
	
}