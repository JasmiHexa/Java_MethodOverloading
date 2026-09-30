public class Main {
    public static void main(String[] args) {
        ApplicationConfig config = new ApplicationConfig();
        Logger.log("App started with greeting: " + config.getGreetingMessage());

        UserService userService = new UserService();
        User user = userService.createUser("Alice", 25);

        Greeter greeter = new Greeter();          //greet(string)

        greeter.greet(user.getName());           // greet(String)
        greeter.greet(user);                     // greet(User)
        greeter.greet(user.getName(), user.getAge()); // greet(String, int)
        greeter.greet();                         // greet()
        greeter.greet(new String[] {"Bob", "Carol"}); // greet(String[])

        Logger.log("App finished.");
    }
}
