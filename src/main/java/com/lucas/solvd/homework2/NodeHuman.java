package com.lucas.solvd.homework2;

public class NodeHuman<Human> {
    public com.lucas.solvd.homework2.human.Human human;
    public double id;
    public NodeHuman<Human> next;


    public NodeHuman() {
        this.next = null;
    }

    public NodeHuman(com.lucas.solvd.homework2.human.Human human) {
        this.human = human;
        this.id = (Math.random() * 50000);
        this.next = null;
    }


}


