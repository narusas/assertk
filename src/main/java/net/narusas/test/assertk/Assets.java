package net.narusas.test.assertk;

class Assets {
    static AssertFunctions functions = new JunitJupiterFunctions();

    public static void assertTrue(boolean expected, String description) {
        functions.assertTrue(expected, description);
    }

    public static void assertFalse(boolean expected, String description) {
        functions.assertFalse(expected, description);
    }

    public static void assertEquals(Object expected, Object actual, String description) {
        functions.assertEquals(expected, actual, description);
    }

    public static void assertNotEquals(Object expected, Object actual, String description) {
        functions.assertNotEquals(expected, actual, description);
    }

}
