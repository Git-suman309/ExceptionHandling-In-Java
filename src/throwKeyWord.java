public class throwKeyWord {
    public static void main(String[] args) {
        System.out.println("A");
        try {
            fun(10);
        } catch (Exception e) {
            System.out.println("*********Execption caught *****" + e);
        }
        System.out.println("B");
    }

    public static int fun(int age) {
        if (age < 18) {
            throw new RuntimeException("-------Type of exception----------");
        }
        return 0;
    }
}
