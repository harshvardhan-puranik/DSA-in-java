package Basics;

import java.util.Random;

public class Random_number {
    static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(10); // (0 to 9)
        System.out.println(random);

        double random2 = rand.nextDouble(); // (0.0 to 1.0)
        System.out.println(random2);

        //Math.random() generates decimal numbers from 0.0 to 1.0
    }
}
