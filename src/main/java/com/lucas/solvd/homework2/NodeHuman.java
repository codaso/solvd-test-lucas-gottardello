package com.lucas.solvd.homework2;

public class NodeHuman<Human> {
    public com.lucas.solvd.homework2.human.Human human;
    public double id;
    public NodeHuman<Human> next;
    private static int indexStatic = 0;
    public int index = 0;


    public NodeHuman() {
        this.next = null;
        indexStatic++;
    }

    public NodeHuman(com.lucas.solvd.homework2.human.Human human) {
        this.human = human;
        this.id = (Math.random() * 50000);
        this.next = null;
        indexStatic++;
        this.index = indexStatic;
    }

    public int getIndex() {
        return index;
    }


}


