package ru.ifmo.base.myGarden;

public class Tree {
    Apple[] apples = new Apple[4]; // создали массив для яблок на дереве

    public void addApple(Apple apple) {     // создали метод по добавлению яблок
        for (int i = 0; i < apples.length; i++) {
            if (apples[i] == null) {
                apples[i] = apple;
            }
        }
    }
}
