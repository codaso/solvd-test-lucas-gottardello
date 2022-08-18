package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.human.doctor.specialty.Clinician;
import com.lucas.solvd.homework2.human.doctor.specialty.Pediatrician;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedListHuman<Human> {

    private static Logger logger = LogManager.getLogger(LinkedListHuman.class);
    public NodeHuman<Human> root;

    public LinkedListHuman() {
        this.root = null;
    }

    void addNode(NodeHuman node) {
        if (this.root == null) {
            this.root = node;
            this.root.next = null;
            return;
        }
        this._addNode(this.root, node);
    }

    void _addNode(NodeHuman curr, NodeHuman node) {
        if (curr.next == null) {
            curr.next = node;
            curr.next.next = null;
            return;
        }
        this._addNode(curr.next, node);

    }

    public void addHuman(com.lucas.solvd.homework2.human.Human human) {
        NodeHuman aux = new NodeHuman(human);
        this.addNode(aux);
    }

    public void deleteNode(com.lucas.solvd.homework2.human.Human human) {
        if (this.root.human.hashCode() == human.hashCode()) {
            NodeHuman toDelete = new NodeHuman(human);
            toDelete = this.root;
            this.root = root.next;
            toDelete = null;
            return;
        }
        this._deleteNode(this.root, human);
    }

    void _deleteNode(NodeHuman curr, com.lucas.solvd.homework2.human.Human human) {
        if (curr.next == null) {
            return;
        } else if (curr.next.human.hashCode() == human.hashCode()) {
            NodeHuman toDelete = new NodeHuman(human);
            toDelete = curr.next;
            curr.next = toDelete.next;
            toDelete = null;
            return;
        }
        this._deleteNode(curr.next, human);
    }

    void deleteHuman(com.lucas.solvd.homework2.human.Human human) {
        this.deleteNode(human);
    }


    boolean isEmpty() {
        return this.root == null;
    }


    public int size() {
        int siz = 0;
        while (this.root != null) {
            siz++;
            this.root = this.root.next;
        }
        return siz;
    }

    public void printHumans(NodeHuman list) {
        if (list != null) {
            printHumans(list.next);
            System.out.println(list.human);

        }
    }

    NodeHuman retrieveNode(NodeHuman node) {
        if (this.root == null) {
            return null;
        } else return _retrieveNode(this.root, node);
    }

    NodeHuman _retrieveNode(NodeHuman curr, NodeHuman t) {
        if (curr.id == t.id) {
            return curr;
        }
        if (curr.next == null) {
            return null;
        }
        return _retrieveNode(curr.next, t);
    }


    public Object retrieveObject(Object obj) {
        if (root == null) {
            return null;
        } else if (root.human == obj) {
            return root.human;
        }
        return this._retrieveObject(obj, this.root.next);

    }

    Object _retrieveObject(Object obj, NodeHuman curr) {
        if (curr == null) return null;
        if (curr.human == obj) return curr.human;
        return this._retrieveObject(obj, curr.next);
    }

    public Object retrieveDoctor(String doctorString) {
        if (root == null) {
            return null;
        } else if (root.human.getClass().getSimpleName() == doctorString) {
            System.out.println("root.human was equal to doctorstring");
            return root.human;
        }
        System.out.println(root.human.getClass().getSimpleName());
        System.out.println(doctorString);
        String b = root.human.getClass().getSimpleName();

        boolean a = (b == doctorString);
        System.out.println(a);


        return this._retrieveDoctor(doctorString, this.root.next);
    }

    Object _retrieveDoctor(String doctorString, NodeHuman curr) {
        System.out.println("Entering _retrieveDoctor");
        if (curr == null) return null;
        if (curr.human.getClass().getSimpleName() == doctorString) return curr.human;
        return this._retrieveDoctor(doctorString, curr.next);
    }


    public static void main(String[] args) {
        LinkedListHuman ll = new LinkedListHuman();
        com.lucas.solvd.homework2.human.Human lucas = new com.lucas.solvd.homework2.human.Human("Lucas",
                "Gottardello", "male", 27);

        com.lucas.solvd.homework2.human.Human juan = new com.lucas.solvd.homework2.human.Human("Juan",
                "GQWE", "male", 16);

        com.lucas.solvd.homework2.human.Human lucia = new com.lucas.solvd.homework2.human.Human("Lucia",
                "dasdwe", "female", 35);
        com.lucas.solvd.homework2.human.Human belen = new com.lucas.solvd.homework2.human.Human("Belen",
                "jghjhgj", "female", 22);


        ll.addHuman(lucas);
        ll.addHuman(juan);
        ll.addHuman(lucia);
        ll.addHuman(belen);

        System.out.println("-----------");
        ll.printHumans(ll.root);
        com.lucas.solvd.homework2.human.Human pedro = (com.lucas.solvd.homework2.human.Human) ll.retrieveObject(lucas);
        ll.addHuman(pedro);

        //com.lucas.solvd.homework2.human.Human mariana = (com.lucas.solvd.homework2.human.Human) ll.retrieveDoctor("Human");
        //System.out.println(mariana);
        ll.deleteHuman(belen);
        System.out.println("-----------");


        LinkedListHuman doctorli = new LinkedListHuman();
        Clinician cl = new Clinician("laura", "perez");
        Pediatrician pe = new Pediatrician("jorge", "jorgito");
        doctorli.addHuman(cl);
        doctorli.addHuman(pe);
        //doctorli.printHumans(doctorli.root);
        //System.out.println(cl.getClass().getSimpleName());

        //com.lucas.solvd.homework2.human.Human h = (com.lucas.solvd.homework2.human.Human) doctorli.retrieveDoctor("Clinician");
        //System.out.println(h.getClass().getSimpleName());


    }
}

