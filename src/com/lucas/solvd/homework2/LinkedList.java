package com.lucas.solvd.homework2;

public class LinkedList<T> {
    public Node<T> root;

    public LinkedList() {
        this.root = null;
    }

    void add(T val) {
        if (this.root == null) {
            this.root = new Node(val);
            return;
        }

        this._add(val, this.root);
    }

    void _add(T val, Node curr) {
        if (curr.next == null) {
            curr.next = new Node(val);
            return;
        }

        this._add(val, curr.next);
    }

    void printAll(Node list) {
        if (list != null) {
            printAll(list.next);
            System.out.println(list.value);
        }
    }

    boolean isEmpty(Node list) {
        return list == null;
    }

    void removeNode(T val) {
        if (this.root.value == val) {
            Node toDelete = new Node(val);
            toDelete = this.root;
            this.root = root.next;
            toDelete = null;
            return;
        }
        this._removeNode(this.root, val);
    }

    void _removeNode(Node curr, T val) {
        if (curr.next == null) {
            System.out.println("value doesn't exist");
            return;
        } else if (curr.next.value == val) {
            Node toDelete = new Node(val);
            toDelete = curr.next;
            curr.next = toDelete.next;
            toDelete = null;
            return;
        }
        this._removeNode(curr.next, val);
    }

    void removeAll(Node list) {
        //not working
        if (this.root == null) {
            System.out.println("List is empty");
        }
        if (list.next != null) {
            this.removeAll(list.next);
        } else if (list.next == null) {
            list = null;
        }
    }

    int size(Node list) {
        int siz = 0;
        while (list != null) {
            siz++;
            list = list.next;
        }
        return siz;
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");
        list.add("g");
        list.printAll(list.root);
        list.removeNode("f");
        System.out.println("-----removing value 'f': ");
        list.printAll(list.root);
        list.isEmpty(list.root);
        list.removeAll(list.root);
        //System.out.println("-----removing all nodes: ");
        //list.printAll(list.root);
        System.out.println("-----size of list: ");
        System.out.println(list.size(list.root));


    }

}


