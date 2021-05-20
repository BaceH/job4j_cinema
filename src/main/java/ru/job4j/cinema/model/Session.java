package ru.job4j.cinema.model;

import java.util.Objects;

public class Session {
    private int id;
    private String name;
    private String time;
    private int hallId;

    public Session(int id, String name, String time, int hallId) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.hallId = hallId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Session session = (Session) obj;
        return id == session.id && hallId == session.hallId && Objects.equals(name, session.name) && Objects.equals(time, session.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, time, hallId);
    }
}
