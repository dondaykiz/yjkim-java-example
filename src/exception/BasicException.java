package exception;

public class BasicException {
    public static void main(String[] args) throws Exception {
        System.out.println("EXCEPTION_STARTED1");
        testException2();
        System.out.println("EXCEPTION_FINISHED1");
        System.out.println("EXCEPTION_STARTED2");
        testException1();
        System.out.println("EXCEPTION_FINISHED2");
    }

    public static void testException1() throws Exception {
        System.out.println("THROW_NEW_EXCEPTION1");
        throw new Exception("EXCEPTION1!!!");

    }

    public static void testException2() throws Exception {
        try {
            System.out.println("THROW_NEW_EXCEPTION2");
            throw new Exception("testException2-1!!!");
        } catch (Exception e) {
            throw new Exception("testException2-2!!!");
        }
    }
}
