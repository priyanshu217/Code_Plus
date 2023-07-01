package Interface_Lambda_Expression_and_Exception_Handling;

public class Exception_Lec5 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        try
        {
            result = num1/num2;
            System.out.println("in try run..");
        }
        catch (Exception e)
        {
            System.out.println(" something went wrong " + e);
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
