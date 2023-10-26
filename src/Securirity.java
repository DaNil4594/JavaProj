public class Securirity extends EmployeeOfCinema{
    private String name;
    private int age;
    private final String position= "Охранник";
    public Securirity(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Охранник{" +
                "Имя='" + name + '\'' +
                ", возраст=" + age +
                ", должность='" + position + '\'' +
                '}';
    }
}
