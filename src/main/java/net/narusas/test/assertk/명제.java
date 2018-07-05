package net.narusas.test.assertk;

public class 명제 {

	public static 명제 는 = new 명제();

	public static 명제 은 = new 명제();

	public static 명제 의_실행결과는 = new 명제();

	public static 명제 의_상태는 = new 명제();

	public static 명제 의_결과는 = new 명제();

	public static 조건 참 = 조건.참;
	public static 조건 TRUE = 조건.참;
	public static 조건 YES = 조건.참;

	public static 조건 거짓 = 조건.거짓;
	public static 조건 FALSE = 조건.거짓;
	public static 조건 NO = 조건.거짓;

	public 조건 참() {
		return 조건.참;
	}

	public 조건 거짓() {
		return 조건.거짓;
	}

	public 조건 TRUE() {
		return 조건.참;
	}

	public 조건 FALSE() {
		return 조건.거짓;
	}

	public 조건 의_결과는(Object 요구사항) {
		return 조건.일치(요구사항);
	}

	public 조건 의_결과도(Object 요구사항) {
		return 조건.일치(요구사항);
	}

	public 명제 의_결과는() {
		return 의_결과는;
	}

	public 명제 의_결과도() {
		return 의_결과는;
	}

}
