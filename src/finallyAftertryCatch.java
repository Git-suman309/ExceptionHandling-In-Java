public class finallyAftertryCatch {
    public static void main(String[] args) {
        /*it work like suppose you to atm and withdraw money suppose light goes off then it should automatically
        close ur account insted of waiting
        or------
        when txn successful it should close ...right
        at that time it should called
         */
        System.out.println("A");
        int arr[]= {1,2,3,4};
        try{
            System.out.println(arr[6]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("B");
        }
        catch (Exception e){
            System.out.println("c");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("end");
        //----------------------------------------------

        System.out.println("");
        System.out.println("A");
        int arr2[]= {1,2,3,4};
        try{
            System.out.println(arr2[6]);

        }
        catch (ArithmeticException e){
            System.out.println("B");
        }
//        catch (Exception e){
//            System.out.println("c");
//        }
        finally {
            System.out.println("Finally will be called if ant catch fail/pass  after finally wont move fwddd ... /it show error");
        }
        System.out.println("end");
    }
}
