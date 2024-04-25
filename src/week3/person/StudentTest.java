package week3.person;

public class StudentTest {
    public static void main(String[] args) {
        Student max = new Student("I like numbers in Java - aren't they int-eresting?!");
        Student harry = new Student("I like numbers in Java - aren't they int-eresting?!");

        max.setName("Max");
        max.setAge(17);
        max.setAddress("Wall street 22");

        max.introduce();

        harry.setName("Harry");
        harry.setAge(15);
        harry.setAddress("Wall street 22");

        harry.introduce();



    }
}
