/*
 *	Author: Sebastian Blunt
 *  Date: 10/27/24
 *	Collaborator(s): none
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Logan");
        firstDog.setAge(5);
        Dog secondDog = new Dog("Henry", "Shiba Inu");
        if (firstDog.isSleeping()) {
            System.out.println(firstDog.getName() + " is asleep.");
        } else {
            firstDog.bark();
        }
        if (secondDog.isSleeping()) {
            if (!firstDog.isSleeping()) {
                secondDog.bark();
            }
        } else {
            if (!firstDog.isSleeping()) {
                secondDog.bark();
            }
        }
    }
}