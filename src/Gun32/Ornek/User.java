package Gun32.Ornek;

public class User {
    String name;
    Role role;
    Status status;

    public User(String name, Role role, Status status) {
        this.name = name;
        this.role = role;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", status=" + status +
                '}';
    }
}
