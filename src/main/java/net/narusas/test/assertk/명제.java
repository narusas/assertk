package net.narusas.test.assertk;

public class 명제 {

    public static 명제 는 = new 명제();

    public static 명제 은 = new 명제();

    public static 명제 의_실행결과는 = new 명제();

    public static 명제 의_상태는 = new 명제();

    public static 명제 의_결과는 = new 명제();

    /**
     * True 구문
     */

    public static 조건 참 = 조건.참;
    public static 조건 TRUE = 조건.참;
    public static 조건 YES = 조건.참;

    public static 조건 성공 = 조건.참;

    public static 조건 허용 = 조건.참;
    public static 조건 허가 = 조건.참;
    public static 조건 가능 = 조건.참;
    public static 조건 사용 = 조건.참;
    public static 조건 사용_가능 = 조건.참;
    public static 조건 승락 = 조건.참;
    public static 조건 허락 = 조건.참;
    public static 조건 수락 = 조건.참;
    public static 조건 승인 = 조건.참;
    public static 조건 인정 = 조건.참;
    public static 조건 만족 = 조건.참;
    public static 조건 진행 = 조건.참;
    public static 조건 실행 = 조건.참;
    public static 조건 활성 = 조건.참;
    public static 조건 활성화 = 조건.참;
    public static 조건 긍정 = 조건.참;
    public static 조건 동의 = 조건.참;
    public static 조건 수긍 = 조건.참;


    /**
     * False 구문
     */
    public static 조건 거짓 = 조건.거짓;
    public static 조건 FALSE = 조건.거짓;
    public static 조건 NO = 조건.거짓;
    public static 조건 실패 = 조건.거짓;
    public static 조건 그름 = 조건.거짓;
    public static 조건 불허 = 조건.거짓;
    public static 조건 불허용 = 조건.거짓;
    public static 조건 금지 = 조건.거짓;
    public static 조건 사용_불가 = 조건.거짓;
    public static 조건 불가 = 조건.거짓;
    public static 조건 불가능 = 조건.거짓;
    public static 조건 비사용 = 조건.거짓;
    public static 조건 불락 = 조건.거짓;
    public static 조건 거절 = 조건.거짓;
    public static 조건 부인 = 조건.거짓;
    public static 조건 거부 = 조건.거짓;
    public static 조건 불만족 = 조건.거짓;
    public static 조건 중지 = 조건.거짓;
    public static 조건 부정 = 조건.거짓;
    public static 조건 불승인 = 조건.거짓;
    public static 조건 정지 = 조건.거짓;
    public static 조건 비활성화 = 조건.거짓;
    public static 조건 비활성 = 조건.거짓;
    public static 조건 이의 = 조건.거짓;


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

