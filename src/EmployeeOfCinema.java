public abstract class EmployeeOfCinema {
    private String name;
    private int age;
    private final String position = "Сотрудник кинотеатра";

    public EmployeeOfCinema(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Сотрудник кинотетра{" +
                "Имя='" + name + '\'' +
                ", возраст=" + age +
                ", должность='" + position + '\'' +
                '}';
    }
}
