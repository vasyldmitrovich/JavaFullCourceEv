package homework__03;

public class Application {
    public static void main(String[] args) {
        Person firstperson = new Person("Ivan", "Petrov");
        Person secondperson = new Person();
        Person thirdperson = new Person();
        Person fourthperson = new Person("Zahar", "Berkyt");
        Person fifthperson = new Person();
        firstperson.setBirthYear(1998);
        firstperson.output();
        secondperson.input("Petro", "Ivanov", 1990);
        secondperson.output();
        thirdperson.setFirstName("Roman");
        thirdperson.setLastName("Putera");
        thirdperson.setBirthYear(1997);
        thirdperson.output();
        fourthperson.setBirthYear(1965);
        fourthperson.ChangeName("Berkyt", "Zahar");
        fourthperson.output();
        fifthperson.input("Vitalii", "Starko", 1995);
        fifthperson.ChangeName("Volodymyr", "Starko");
        fifthperson.output();
        fifthperson.getCounter();
    }
}