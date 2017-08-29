package ru.Rush12250.homework;

import java.util.Arrays;

public class FunctionalTester extends SoftwareTester {


    public FunctionalTester(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public FunctionalTester(String name, int age, Gender gender, int experience, Education education) {
        super(name, age, gender, experience, education);
    }

    /**
     * @return информацию о классе
     */
    @Override
    public String toString() {
        return "FunctionalTester{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", experience=" + getExperience() +
                ", education=" + getEducation() +
                '}';
    }

    /**
     * @return override с добавление информации
     */
    @Override
    public String run() {
        return super.run() + "на тестирование функционала";
    }

    /**
     * вывод информации каким инструментом пользуется LoadTester
     */
    public void usingTool() {
        super.usingTool("функионального тестирование", "Intellij IDEA");
    }

    /**
     * @param num число для проверки
     * @return проверенное число
     */
    public byte convertByte(int num) {
        try {
            if (num > 127 || num < -128) throw new Exception();
        } catch (Exception e) {
            System.out.println("Не конвертируется: " + num);
            return 0;
        }
        return (byte) num;
    }

    /**
     * @param array для сортировки
     * @return отсортированный массив(по строчно)
     */
    public static int[][] sortArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        return array;
    }
}
