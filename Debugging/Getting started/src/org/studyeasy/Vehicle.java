package org.studyeasy;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private static final long serialVersionUID = -8948432491824001606L;
    private String type;
    private int number;

    public Vehicle(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
