package ru.Rush12250.homework;

public class AutoTester extends SoftwareTester {

    public AutoTester(String name, int age, Gender gender) {
        super(name, age, gender);
    }


    public AutoTester(String name, int age, Gender gender, int experience, Education education) {
        super(name, age, gender, experience, education);
    }

    /**
     * @return информацию о классе
     */
    @Override
    public String toString() {
        return "AutoTester{" +
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
        return super.run() + "на автотестирование";
    }


    public void usingTool() {
        super.usingTool("автотестирования", "Rational Robot");
    }

    /**
     * уникальный класс которого нет в softwareTester
     *
     * Проверка стажа
     */
    public void verificationOfExperience() {
        try {
            if (getExperience() - getAge() < 18) throw new Exception();
        } catch (Exception e) {
            System.out.println(getName() + " работать можно только с 18!");
        }
    }

    /**
     * @param array из которого получается сумма
     * @return сумма массива
     */
    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
