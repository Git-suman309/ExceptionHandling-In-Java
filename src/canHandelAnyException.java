public class canHandelAnyException {
    public static void main(String[] args) {
        //-----------------------------------------------
        System.out.println("A");
        int arr[]= {1,2,3,4};
        try {
            int a =5/0;
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("FoundFirst " +e);
        }
        catch (Exception e){ //first catch wont excute coz its Arthematic ex and here Execption can handel any type of ex
            System.out.println("FoundException : The King Exception "+e);
        }
        System.out.println("last line");
    }
}
