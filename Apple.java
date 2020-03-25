package ru.ifmo.base.myGarden;

public class Apple {
    protected int age;                    // возраст
    protected String colour = "Красный";  // цвет
    protected int size;                   // размер
    protected boolean spoiled = false;    // флаг - испортилось
    protected boolean broken = false;     // флаг - упало

    public Apple(int age, String colour, int size, boolean spoiled, boolean broken) {
        this.age = age;
        this.colour = colour;
        this.size = size;
        this.spoiled = spoiled;
        this.broken = broken;
    }

    public void canBroke() {              // метод - упасть
        broken = true;
        System.out.println("Яблоко упало");
    }

    public void canSpoil() {              // метод - испортиться
        spoiled = true;
        System.out.println("Яблоко испортилось");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size >0)
        this.size = size;
    }

    public boolean isSpoiled() {
        return spoiled;
    }

    public void setSpoiled(boolean spoiled) {
        this.spoiled = spoiled;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }
}
