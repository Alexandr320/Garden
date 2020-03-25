package ru.ifmo.base.myGarden;

public class Garden {
    Tree[] trees = new Tree[2];   // создали массив по добавлению деревьев

    public void addTree(Tree tree) {   // создали метод по добавлению деревьев
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = tree;
            }
        }
    }

    public void addInfo() {             // метод по получению информации о количестве деревьев и яблок на них
        int a = 0;
        for (int j = 0; j < trees.length; j++) {
            if (trees[j] != null) {
                for (int i = 0; i < trees[j].apples.length; i++) {
                    if (trees[j].apples[i] != null){
                        a += 1;
                    }
                }
            }
        }
        System.out.println("Сумма всех яблок    " + a);
    }
}
