package AdvJavaPractise.enums;

public enum Role {
    ROLE_ADMIN("admin"),
    ROLE_TEACHER("teacher"),
    ROLE_STUDENT("student");

   private final String name;

    Role( String name ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}