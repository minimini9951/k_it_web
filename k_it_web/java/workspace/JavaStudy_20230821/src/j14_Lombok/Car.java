package j14_Lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

class Car {
	
	private String company;
	private String model;
	private String color;
}
