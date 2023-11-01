package net.narusas.test.assertk;

public interface AssertFunctions {
    void assertTrue(boolean expected, String description);
    void assertFalse(boolean expected, String description);

    void assertEquals(Object expected, Object actual, String description);
    void assertNotEquals(Object expected, Object actual, String description);
}
