public class Client implements Visitor{
    private String name;
    private int age;
    private String pol;


    public Client(String name, int age, String pol) {
        this.name = name;
        this.age = age;
        this.pol = pol;
    }

    @Override
    public void whoAmI() {
        System.out.println("Я посетитель вашего кинотеатра");
        System.out.println("Имя:"+name);
        System.out.println("Возраст:"+age);
        System.out.println("Пол:"+pol);
        System.out.println();
    }
}
