public class whatHappen {
    public static void main(String[] args) {
        System.out.println("A");
        int d = 5/0; //at this line it will throw error so i should handle in try catch
        System.out.println(d);
        System.out.println("B");
    }
}
