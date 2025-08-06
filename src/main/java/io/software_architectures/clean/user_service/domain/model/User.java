package io.software_architectures.clean.user_service.domain.model;

public class User {
    private Long id;
    private String name;
    private String email;

    public User() {}

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters only (immutability recommended)
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}

