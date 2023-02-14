public class typeOfException {
    public static void main(String[] args) {
        System.out.println("a");
        int arr[]={1,2,3,4};
        try{
            System.out.println(arr[4]); //4 is oob
        }catch(Exception e){ //e is just obj & Exception is a class
            System.out.println("Type of Exception "+ e);
        }
        System.out.println("after try n catch");
    }
}
