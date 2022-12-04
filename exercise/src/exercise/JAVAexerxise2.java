package exercise;

import java.util.Arrays;

public class JAVAexerxise2 { // 클래스의 주요 메서드

	public static void main(String[] args) {
		// 문자열 길이
		String str1 = "Hello Java!";
		String str2 = "hihi! hello!";
		System.out.println(str1.length());
		System.out.println(str2.length()); // 영문, 한문 구분없이 한 문자당 1개의 크기를 가짐, 띄어쓰기도 포함됨
		System.out.println();

		// 문자열 검색
		// @charAt()
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();

		// @indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a')); // 첫번째 a가 위치한 인덱스
		System.out.println(str1.lastIndexOf('a')); // 뒤에서부터 a가 위치한 인덱스
		System.out.println(str1.indexOf('a', 8));
		System.out.println(str1.lastIndexOf('a', 8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str2.indexOf("hello"));
		System.out.println(str1.indexOf("Jaaa")); // 해당 문자열이 없는 경우 -1 리턴
		System.out.println();

		// 문자열 변관 및 연결
		// @String.valueOf(기본자료형) : 기본자료형 -> 문자열 변환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();

		// @concat():문자열 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);
		System.out.println();

		// String.valueOf() + concat()
//		String str6 = "안녕" + 3;
//		String str7 = "안녕".concat(String.valueOf(3));

		// 문자열을 byte[] 또는 char[]로 변환
		String str8 = "Hello Java!";
		String str9 = "hihi! hello!";

		// @getBytes():문자열 ->byte[]변환
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println();

		// @toCharArray(): 문자열 -> char[]변환 (char :문자 자료형)
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		System.out.println();
	}

}
