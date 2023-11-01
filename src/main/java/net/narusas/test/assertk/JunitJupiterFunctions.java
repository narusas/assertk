package net.narusas.test.assertk;

class JunitJupiterFunctions implements AssertFunctions {
    @Override
    public void assertTrue(boolean expected, String description) {
        org.junit.jupiter.api.Assertions.assertTrue(expected, description);
    }

    @Override
    public void assertFalse(boolean expected, String description) {
        org.junit.jupiter.api.Assertions.assertFalse(expected, description);
    }

    @Override
    public void assertEquals(Object expected, Object actual, String description) {
        org.junit.jupiter.api.Assertions.assertEquals(expected,actual, description);
    }

    @Override
    public void assertNotEquals(Object expected, Object actual, String description) {
        org.junit.jupiter.api.Assertions.assertNotEquals(expected,actual,  description);
    }
}
