import java.util.ArrayList;
import java.util.Arrays;


public class AnotherRunner {
    public static void main(String[] args) {
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("Mustang", 12342);
        Car car2 = new Car("Camry", 3223);
        Car car3 = new Car("Ram", 3465);

        Car[] carArray = {car1, car2, car3};

        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carArray));
        System.out.println(carList);
    }
}
