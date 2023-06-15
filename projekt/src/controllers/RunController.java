package controllers;

import models.Animal;
import models.BasicData;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class RunController
 */
public class RunController extends BasicData {
    /**
     * Class to run program
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz stworzyć zwierzę (wpisz: animal)?");
        String decision = String.valueOf(scanner.nextLine());

        if (decision.equals("animal")) {
            Animal animal = new Animal();
            animal.welcome(decision);
            animal.breakLine();
            System.out.println("Podaj imię dla zwierzaka");
            animal.setName(String.valueOf(scanner.nextLine()));
            System.out.println("Podaj gatunek zwierzęcia");
            animal.setType(String.valueOf(scanner.nextLine()));
            System.out.println("Podaj wiek zwierzęcia");
            animal.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("Podaj masę zwierzęcia");
            animal.setWeight(Double.parseDouble(scanner.nextLine()));
            System.out.println(Arrays.toString(animal.AnimalData()));
        } else {
            System.out.println("Błędny wybór");
            this.run();
        }

        this.breakLine();
        System.out.println("Pa pa");
    }
}
