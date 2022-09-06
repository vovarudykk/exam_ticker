package exam_ticket_2;

public class Person extends CustomData {
    String name;
    String surname;

    public Person(String name, String surname, int year, int month, int day) throws CustomException {
        super(year, month, day);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void print() {
        System.out.println("Person:\n" + name + " " + surname +
                "\nBirthday (" + getYear() + "|" +
                getMonth() + "|" +
                getDay() + ")");
    }

}
