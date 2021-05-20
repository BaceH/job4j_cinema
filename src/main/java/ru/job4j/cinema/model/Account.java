package ru.job4j.cinema.model;

import java.util.Objects;

public class Account {
    private int id;
    private String username;
    private String email;
    private int phone;

    public Account(int id, String username, String email, int phone) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, phone);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return id == account.id
                && Objects.equals(username, account.username)
                && Objects.equals(email, account.email)
                && phone == account.phone;
    }

    @Override
    public String toString() {
        return "Account {"
                + "id=" + id
                + ", username=" + username
                + ", email=" + email
                + "phone=" + phone
                + "}";
    }
}
