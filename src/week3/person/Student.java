package week3.person;

public class Student extends Person {
    private String joke;

    public Student(String joke) {
        this.joke = joke;
    }

     // Method to tell a joke
    public void tellJoke() {
        System.out.println("Student " + getName() + " tells a joke: " + joke);
    }
}
