package net.narusas.test.assertk;

import lombok.Data;

@Data
public class AssertContext {
	String 설명;

	Object 값;

	static ThreadLocal<AssertContext> threadLocal = new ThreadLocal<>();

	public static AssertContext getContext() {
		return threadLocal.get();
	}

	public static void clear() {
		threadLocal.remove();
	}

	public static void createContext() {
		threadLocal.set(new AssertContext());
	}

}
