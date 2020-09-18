package exception;

public class BasicException {
    public static void main(String[] args) throws Exception {
        System.out.println("EXCEPTION_STARTED");
        testException2();
        System.out.println("EXCEPTION_FINISHED");
        testException1();
    }

    public static void testException1() throws Exception {
        System.out.println("THROW_NEW_EXCEPTION1");
        throw new Exception("EXCEPTION1!!!");

    }

    public static void testException2() throws Exception {
        try {
            System.out.println("THROW_NEW_EXCEPTION2");
            throw new Exception("EXCEPTION2!!!");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
