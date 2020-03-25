package ru.ifmo.base.myGarden;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple (2, "Желтый", 3, false, false);
        Apple apple1 = new Apple(3, "Белый", 2, false, false);
        Apple apple2 = new Apple(1, "Зеленый", 4, false, false);
        Apple apple3 = new Apple(4, "Красный", 1, false, false);

        Tree tree = new Tree();
        Tree tree1 = new Tree();

        tree.addApple(apple);
        tree.addApple(apple1);

        tree1.addApple(apple2);
        tree1.addApple(apple3);

        Garden garden = new Garden();

        garden.addTree(tree);
        garden.addTree(tree1);

        garden.addInfo();

    }
}
