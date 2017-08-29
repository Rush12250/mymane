package ru.mymane-master.homework;


public class SoftwareTester implements Human {

    /**
     * Перечисление полов
     */
    public enum Gender {
        MALE,
        FEMININE
    }

    /**
     * Перечисление образования
     */
    public enum Education {
        school,
        university,
        higher
    }

    /**
     * Количество тестировщиков программного обеспечения
     */
    private static int SIZE_TESTER = 0;
    private static int sizeTester;

    /**
     * Имя, возрост, пол
     */
    private String name;
    private int age;
    private Gender gender;

    /**
     * стаж, образование
     */
    private int experience;
    private Education education;

    /**
     * Конструктор с параметрами не получившего опыта
     */
    public SoftwareTester(String name, int age, Gender gender) {
        sizeTester = SIZE_TESTER++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.education = Education.OTHER;
    }

    public SoftwareTester(String name, int age, Gender gender, int experience, Education education) {
        sizeTester = SIZE_TESTER++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experience = experience;
        this.education = education;
    }


    public void raport() {
        this.raport(name, age);
    }

    /**
     * @return информацию о классе
     */
    @Override
    public String toString() {
        return "SoftwareTester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", experience=" + experience +
                ", education=" + education +
                '}';
    }

    /**
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * вывод информации каким инструментом пользуется LoadTester
     * @param name имя
     * @param tool инструммент
     */
    public void usingTool(String name, String tool) {
        System.out.println("Мой инструмент " + name + ": " + tool + "!");
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getExperience() {
        return experience;
    }

    public Education getEducation() {
        return education;
    }

    /**
     * @param experience новый стаж
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * @param education новое образование
     */
    public void setEducation(Education education) {
        this.education = education;
    }

    /**
     * @return количество тестировщиков программного обеспечения
     */
    public static int sizeTester() {
        return sizeTester;
    }
}
