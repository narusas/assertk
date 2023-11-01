package net.narusas.test.assertk;


public abstract class 조건 {
    public abstract void 이여야_한다();

    public void 이여야_함() {
        이여야_한다();
    }

    public void 이다() {
        이여야_한다();
    }

    public void 임() {
        이여야_한다();
    }

    public void 되다() {
        이여야_한다();
    }

    public void 됨() {
        이여야_한다();
    }

    public void 되어야_한다() {
        이여야_한다();
    }

    public void 되어야_함() {
        이여야_한다();
    }

    public void 해야_한다() {
        이여야_한다();
    }

    public void 해야_함() {
        이여야_한다();
    }

    public abstract void 이_아니여야_한다();

    public void 이_아니여야_함() {
        이_아니여야_한다();
    }

    public void 이_아니다() {
        이_아니여야_한다();
    }

    public void 이_아님() {
        이_아니여야_한다();
    }

    public void 되지_않는다() {
        이_아니여야_한다();
    }

    public void 되지_않음() {
        이_아니여야_한다();
    }

    public void 되지_않아야_한다() {
        이_아니여야_한다();
    }

    public void 되지_않아야_함() {
        이_아니여야_한다();
    }

    public void 하지_말아야_한다() {
        이_아니여야_한다();
    }

    public void 하지_말아야_함() {
        이_아니여야_한다();
    }

    public void 하지_않아야_한다() {
        이_아니여야_한다();
    }

    public void 하지_않아야_함() {
        이_아니여야_한다();
    }


    public static 조건 참 = new 조건() {
        @Override
        public void 이여야_한다() {
            try {
                Assets.assertTrue(Boolean.TRUE.equals(AssertContext.getContext().get값()), AssertContext.getContext().get설명());
            } finally {
                AssertContext.clear();
            }
        }

        @Override
        public void 이_아니여야_한다() {
            try {
                Assets.assertFalse(Boolean.FALSE.equals(AssertContext.getContext().get값()), AssertContext.getContext().get설명());
            } finally {
                AssertContext.clear();
            }
        }
    };

    public static 조건 거짓 = new 조건() {

        @Override
        public void 이여야_한다() {
            try {
                Assets.assertTrue(Boolean.FALSE.equals(AssertContext.getContext().get값()), AssertContext.getContext().get설명());
            } finally {
                AssertContext.clear();
            }
        }

        @Override
        public void 이_아니여야_한다() {
            try {
                Assets.assertFalse(
                        Boolean.TRUE.equals(AssertContext.getContext().get값()), AssertContext.getContext().get설명());
            } finally {
                AssertContext.clear();
            }

        }
    };

    public static 조건 일치(final Object 요구사항) {
        return new 조건() {

            @Override
            public void 이여야_한다() {
                try {
                    Assets.assertEquals(요구사항, AssertContext.getContext().get값(), AssertContext.getContext().get설명());
                } finally {
                    AssertContext.clear();
                }
            }

            @Override
            public void 이_아니여야_한다() {
                try {
                    Assets.assertNotEquals(요구사항, AssertContext.getContext().get값(), AssertContext.getContext().get설명());
                } finally {
                    AssertContext.clear();
                }

            }
        };

    }

}
