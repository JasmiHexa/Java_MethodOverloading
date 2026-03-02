public class UserService {
    public User createUser(String name, int age) {
        Logger.log("Creating user: " + name);
        return new User(name, age);
    }
}