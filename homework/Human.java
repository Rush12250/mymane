package ru.mymane-master.homework;

import java.util.Random;


/**
 * @author Павлов Григорий
 * <p>
 */
public interface Human {

    // Метод raport лучше реализовывать не в interface а в abstract class это просто пример

    /**
     * @param name имя человека
     * @param experience  стаж
     */
    default void raport (String name, int experience) {
        int random = (int) (new Random().nextFloat() * 4);
        switch (random) {
            case 0:
                System.out.println("Имя: " + name);
                break;
            case 1:
                System.out.println("Мой стаж: " + experience );
                break;
            case 2:
                System.out.println("Имя: " + name + " Стаж: " + experience + " лет.");
                break;
            default:
                System.out.println("Я новичок");
        }

    }



    default String run() {
        return "Я новичок ";
    }
}
