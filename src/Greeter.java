public class Greeter {
    // Overloaded: greet by name
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded: greet by User object
    public void greet(User user) {
        System.out.println("Hello, " + user.getName() + "! You are " + user.getAge() + " years old.");
    }

    // Overloaded: greet by name and age
    public void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    // Overloaded: greet without parameters
    public void greet() {
        System.out.println("Hello, Guest!");
    }

    // Overloaded: greet by array of names
    public void greet(String[] names) {
        System.out.print("Hello");
        for (String name : names) {
            System.out.print(" " + name);
        }
        System.out.println("!");
    }
}