package entities;

public class Room {
    private String name;
    private String email;

    public Room(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
