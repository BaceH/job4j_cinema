package ru.job4j.cinema.model;

import java.util.Objects;

public class Hall {
    private int id;
    private int row;
    private int cell;

    public Hall(int id, int row, int cell) {
        this.id = id;
        this.row = row;
        this.cell = cell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Hall hall = (Hall) o;
        return id == hall.id && row == hall.row && cell == hall.cell;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, row, cell);
    }

    @Override
    public String toString() {
        return "Hall{"
                + "id=" + id
                + ", row=" + row
                + ", cell=" + cell
                + '}';
    }
}
