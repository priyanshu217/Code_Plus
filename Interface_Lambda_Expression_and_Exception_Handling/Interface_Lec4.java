package Interface_Lambda_Expression_and_Exception_Handling;
               // Annonymous inner class
interface Car
               {
                   void drive();
               }

public class Interface_Lec4 {
    public static void main(String[] args) {
        Car obj5 = new Car() {
            @Override
            public void drive() {
                System.out.println("Drive ..");
            }
        };
        obj5.drive();

    }
}
