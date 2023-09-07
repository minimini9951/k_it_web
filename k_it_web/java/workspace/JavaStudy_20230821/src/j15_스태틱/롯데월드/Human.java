package j15_스태틱.롯데월드;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Human {
	
	private int userCode;
	private String name;
	private int gender;

}
