package com.lucas.solvd.homework2;

public class LinkedList<T> {
    public Node<T> root;

    public LinkedList() {
        this.root = null;
    }

    public void add(T val) {
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

    void addNode(Node node) {
        if (this.root == null) {
            this.root = node;
            return;
        }
        this._addNode(this.root, node);
    }

    void _addNode(Node curr, Node node) {
        if (curr.next == null) {
            curr.next = node;
            return;
        }
        this._addNode(curr.next, node);

    }

    public void addObject(Object obj) {
        Node aux = new Node(obj.toString());
        aux.pointer = obj;
        this.addNode(aux);
    }


    public void printAllValues(Node list) {
        if (list != null) {
            printAllValues(list.next);
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


    int size(Node list) {
        int siz = 0;
        while (list != null) {
            siz++;
            list = list.next;
        }
        return siz;
    }

    public Node retrieveNode(Node t) {
        if (this.root == null) {
            return null;
        } else return _retrieveNode(this.root, t);
    }

    Node _retrieveNode(Node curr, Node t) {

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
        } else if (root.pointer == obj) {
            return root.pointer;
        }
        return this._retrieveObject(obj, this.root.next);

    }

    Object _retrieveObject(Object obj, Node curr) {
        if (curr == null) return null;
        if (curr.pointer == obj) return curr.pointer;
        return this._retrieveObject(obj, curr.next);
    }


    /*
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");

        list.add("g");
        list.printAllValues(list.root);

        list.removeNode("f");
        System.out.println("-----removing value 'f': ");
        list.printAllValues(list.root);
        list.isEmpty(list.root);
        System.out.println("-----size of list: ");
        System.out.println(list.size(list.root));


        System.out.println("---------retrieving Node");
        Node test = new Node("some String value");
        list.addNode(test);
        list.retrieveNode(test);
        list.printAllValues(list.root);

        Clinician cl = new Clinician("Hugo", "Morales");
        list.addObject(cl);
        System.out.println(list.retrieveObject(cl));


    }



     */

}


