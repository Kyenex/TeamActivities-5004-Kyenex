package solution;

public class Student extends Person {
    private int id;

    public Student(String theName, int id) {
        super(theName);
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static void main(String[] args) {
        int value = 10;
        Person e1 = new Student("Alice", 1);
        Person e2 = new Student("Bob", 2);
        Person e3 = new Student("Carol", 3);
        Person arrayOfPeople[] = {e1, e2, e3};

        Person e4 = new Student("Alice", 1); // same as e1?

        System.out.println(e1 == arrayOfPeople[0]); // what is printed here?
        System.out.println(e1 == e4); // what is printed here?
    }
}
