package week3.person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

       person.setAge(31);
       person.setName("Esra");
       person.setAddress("Rottelsgasse 7.");

       person.introduce();
    }
}
