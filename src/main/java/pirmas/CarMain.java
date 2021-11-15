package pirmas;

import java.util.Arrays;

public class CarMain {

    public static void main(String[] args) {

        Car audi = new Car();
        audi.yearCreated = 2021;
        audi.brand = "Audi";
        audi.price = 15000;
        audi.weight = 1500.00;
        audi.isElectric = true;

        System.out.println(audi);

        audi.turnOnEngine();
        audi.move();
        audi.playSong("Juoda orhideja");

        Car BMW = new Car(1998, 1400.5, 300, "BMW", false);
        System.out.println(BMW);

        int[] numbers = {5, 3, 6};
        String[] vardai = {"Rasa", "Paulina", "Audrius"};
        Car[] cars = new Car[3];

        cars[0] = audi;
        cars[2] = BMW;
        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.toString(vardai));

        for (int indeksas = 0; indeksas < numbers.length; indeksas++) {
            System.out.print(numbers[indeksas] + " ");
        }

        cars[1] = new Car(1979,1000.0, 20000,"Ford",false);
        for (Car car : cars) {
            //System.out.println(car.brand);
            car.turnOnEngine();
            car.playSong(car.brand);

        }

    }
}
