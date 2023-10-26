public class Cahier extends EmployeeOfCinema{
    private String name;
    private int age;
    private final String position= "Кассир";
    public Cahier(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Кассир{" +
                "Имя='" + name + '\'' +
                ", возраст=" + age +
                ", должность='" + position + '\'' +
                '}';
    }
}
