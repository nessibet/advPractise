package AdvJavaPractise.enums;

public class User {

    private String name;

    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, Role role) {
        this.name = name;

        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
