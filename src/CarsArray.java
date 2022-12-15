import java.util.ArrayList;

public class CarsArray {
    public static void main(String[] args) {

        String[] cars = {"Subaru", "BMW", "Suzuki"};
        System.out.println("Second item of array");
        System.out.println(cars[1]);

        System.out.println("Loop through the initial items in the cars array");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //change Suzuki to Honda
        for (int i = 0; i < cars.length; i++) {
            if (cars[i]=="Suzuki"){
                cars[i]="Honda";
            //System.out.println(cars[i]);
            }
        }

        System.out.println("Array length " + cars.length);



        System.out.println("Loop through the items after change in the cars array");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
