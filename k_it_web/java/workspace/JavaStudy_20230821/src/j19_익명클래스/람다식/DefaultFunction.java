package j19_익명클래스.람다식;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunction {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println("runnable 인터페이스를 사용한 람다식");
		};
		runnable.run();
		
		Supplier<Integer> supplier = () -> 100;
		Supplier<String> supplier2 = () -> {
			System.out.println("안녕하세요");
			return "hihi";
		};
		
		System.out.println(supplier.get());
		supplier2.get();
		
		Consumer<String> consumer = (name) -> {
			System.out.println("이름 : " + name);
		};
		
		consumer.accept("홍길동");
		
		Function<Integer, Integer> funcion = num -> num * num;
		System.out.println(funcion.apply(10));
		
		Predicate<String> predicate = str -> str == null || str.isBlank();
		
		System.out.println(predicate.test(""));
		System.out.println(predicate.test("홍길동"));
	}

}

