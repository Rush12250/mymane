package ru.mymane-master.homework;

public class LoadTester extends SoftwareTester {


    public LoadTester(String name, int age, Gender gender) {
        super(name, age, gender);
    }


    public LoadTester(String name, int age, Gender gender, int experience, Education education) {
        super(name, age, gender, experience, education);
    }

    /**
     * @return информацию о классе
     */
    @Override
    public String toString() {
        return "LoadTester{" +
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
        return super.run() + "на тестирование нагрузки";
    }

    /**
     * вывод информации каким инструментом пользуется LoadTester
     */
    public void usingTool() {
        super.usingTool("тестирование нагрузки", "Jmeter");
    }

    /**
     * @param num число для проверки
     * @return истину иначе ислючение
     * @throws Exception максимальное byte
     */
    public boolean isMaxByte(byte num) throws Exception {
        if (num == 127) return true;
        throw new Exception();
    }

    /**
     * @param array для зеркального отражения
     * @return зеркально отражонный массив
     */
    public static int[][] mirrorArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                int save;
                save = array[i][(array[i].length - 1) - j];
                array[i][(array[i].length - 1) - j] = array[i][j];
                array[i][j] = save;
            }
        }

        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int save;
                save = array[(array.length - 1) - i][j];
                array[(array.length - 1) - i][j] = array[i][j];
                array[i][j] = save;
            }
        }
        return array;
    }
}
