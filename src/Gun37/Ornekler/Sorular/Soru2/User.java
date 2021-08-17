package Gun37.Ornekler.Sorular.Soru2;

public class User {

    //id, username, password, active (boolean), signedIn (boolean)

    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    private static int num=1;

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
        setActive(true);
        setSignedIn(false);
        setId();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = num++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (password.length()<6) throw new RuntimeException("Password can not be less than 6 character");
        else this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
