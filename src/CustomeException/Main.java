package CustomeException;

public class Main {
    public static void main(String[] args) {
        try{
            fun(10);
        }catch (CustomeException e){ //i can catch error here
            System.out.println(" Custome Exception class " + e);
        }
    }
        public static int  fun(int age) throws CustomeException{ //we can write multipal exception
        if(age<18){
            throw new CustomeException(" custome ex class ");
        }
        return 0;
    }
}
