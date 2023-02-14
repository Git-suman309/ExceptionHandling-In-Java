public class Main {
    public static void main(String[] args) {
        System.out.println("A");
        try {
            int i = 5 / 0;
            System.out.println("abc");
        }catch (IndexOutOfBoundsException e){  //not able to catch the it will throw error from try block coz its arr error
            System.out.println("error type : "+e);
        }
        System.out.println("B");
    }
}
