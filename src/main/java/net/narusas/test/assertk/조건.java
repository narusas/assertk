package net.narusas.test.assertk;

import static org.junit.Assert.*;

public abstract class 조건 {
	public abstract void 이여야한다();

	public abstract void 이_아니여야한다();

	public static 조건 참 = new 조건() {

		@Override
		public void 이여야한다() {
			try {
				assertTrue(AssertContext.getContext().get설명(), Boolean.TRUE.equals(AssertContext.getContext().get값()));
			} finally {
				AssertContext.clear();
			}
		}

		@Override
		public void 이_아니여야한다() {
			try {
				assertFalse(AssertContext.getContext().get설명(), Boolean.FALSE.equals(AssertContext.getContext().get값()));
			} finally {
				AssertContext.clear();
			}
		}
	};

	public static 조건 거짓 = new 조건() {

		@Override
		public void 이여야한다() {
			try {
				assertTrue(AssertContext.getContext().get설명(), Boolean.FALSE.equals(AssertContext.getContext().get값()));
			} finally {
				AssertContext.clear();
			}
		}

		@Override
		public void 이_아니여야한다() {
			try {
				assertFalse(AssertContext.getContext().get설명(),
						Boolean.TRUE.equals(AssertContext.getContext().get값()));
			} finally {
				AssertContext.clear();
			}

		}
	};

	public static 조건 일치(final Object 요구사항) {
		return new 조건() {

			@Override
			public void 이여야한다() {
				try {
					assertEquals(AssertContext.getContext().get설명(), 요구사항,AssertContext.getContext().get값());
				} finally {
					AssertContext.clear();
				}
			}

			@Override
			public void 이_아니여야한다() {
				try {
					assertNotEquals(AssertContext.getContext().get설명(), 요구사항, AssertContext.getContext().get값());
				} finally {
					AssertContext.clear();
				}

			}
		};

	}

}
