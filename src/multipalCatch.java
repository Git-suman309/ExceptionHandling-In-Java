public class multipalCatch {
    public static void main(String[] args) {
        System.out.println("A");
        int arr[]= {1,2,3,4};
        try {
            int a =5/0;
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println("FoundFirst " +e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("FoundSecondCatch "+e);
        }
        System.out.println("last line");

        //-----------------------------------------------
        System.out.println("A");
        int arrx[]= {1,2,3,4};
        try {
            int a =5/0;
            System.out.println(arrx[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("FoundFirst " +e);
        }
        catch (ArithmeticException e){ //this catch will be excuted coz its arthematic ex it try all catch
            System.out.println("FoundSecondCatch "+e);
        }
        System.out.println("last line");
    }
}
