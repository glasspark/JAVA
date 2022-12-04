package exercise;

public class JavaExercise {

	public static void main(String[] args) {
		// for 문에서 break 사용
		// 구하고 싶은것 : 0부터 시작해 숫자를 1씩 늘리면서 몇 까지 더해야지 100이 넘는가

		int num = 0;
		int sum = 0;

		for (num = 0; sum < 100; num++) {// 합한 값이 100보다 크면 종료
			sum += num; // sum = sum + num 과 동일 두항의 값을 더해서 왼족 항에 대입.
			if (sum >= 100)
				break; // 만약에 sum의 값이 100과 같거나 넘기면 중단.
		}

		System.out.println(sum);
		System.out.println(num);

		// 아래 결과를 보면 1부서 14까지 더하니 105하는 값이 나옴.

	}

}
