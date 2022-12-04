package exercise;

public class Gugudan {

	public static void main(String[] args) {
		// 중첩된 반복문 구구단

		int dan;
		int times;

		for (dan = 2; dan <= 9; dan++) { // 단이 먼저 실행되야 해서 단 부터 넣음
			for (times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();// 한줄 띄워서 내보내기 위해 넣음

		}

	}
}

// 반복 횟수가 정해진 경우에는 for문을 사용한다. 수행문을 반드시 한 번이상 수행해야 하면 do - while문
// 이 두 경우 외에 참, 거짓에 따라 반복문이 수행하는 경우에는 while문을 사용한다.
