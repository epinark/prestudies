package week3.person;

public class Student extends Person {
    private String joke;

    public Student(String joke) {
        this.joke = joke;
    }

     // Method to tell a joke
    public void tellJoke() {
        System.out.println(joke);
    }

    // Overriding the introduce method to include telling a joke
    @Override
    public void introduce() {
        super.introduce();
        tellJoke();
    }
}
