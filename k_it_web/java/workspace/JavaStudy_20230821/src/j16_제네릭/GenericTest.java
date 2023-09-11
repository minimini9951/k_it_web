package j16_제네릭;

import lombok.Data;

@Data

public class GenericTest<T, E> {
	private T userCode;
	private E name;
}
