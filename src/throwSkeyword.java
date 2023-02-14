public class throwSkeyword {
    public static void main(String[] args) {
        try{
            fun();
        }catch (Exception e){ //i can catch error here
            System.out.println(" error in fun() and type is " + e);
        }
    }
    public static void fun() throws ArithmeticException , IndexOutOfBoundsException ,Exception{ //we can write multipal exception
        int a = 5/2;
        int arr[] = {1,2,3};
        System.out.println(arr[5]);
    }
}
