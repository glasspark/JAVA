package exercise;

public class ForrExercise1 {

	public static void main(String[] args) {
		// 1~10까지 더하면 얼마가 나올까?
		int i;
		int sum = 0;

		for (i = 1; i <= 10; i++) {
			sum += i; // 합계를 뜻하는 sum에서 계속 i가 1+2+3+4..이렇게 더해진다.
		}

		System.out.println("1부터 10까지의 더한 값은" + sum + "입니다.");

	}

}
