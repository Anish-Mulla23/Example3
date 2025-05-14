public class DivisionOperation {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        try{
            int div = a / b;
            System.out.println("devision: "+div);
        }catch(ArithmeticException e){
            System.out.println("Error: cannot divide by zero");
        }
    }
}
