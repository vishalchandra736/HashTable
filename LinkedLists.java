package com.blz.hashtable;

public class LinkedLists<K> {
    public INode<K> head;
    public INode<K> tail;

    public LinkedLists() {
        this.head = null;
        this.tail = null;
    }

    public void append(INode<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }

        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setnext(newNode);
            this.tail = newNode;
        }
    }

    public void add(K element) {
        Node<K> newNode = new Node<K>(element);

        if (this.tail == null) {
            this.tail = newNode;
        }

        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setnext(tempNode);
        }
    }

    public void printNodes() {
        StringBuffer nodes = new StringBuffer("My nodes : ");

        INode<K> tempNode = head;
        while (tempNode.getnext() != null) {
            nodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                nodes.append("->");
            tempNode = tempNode.getnext();
        }
        nodes.append(tempNode.getKey());
        System.out.println(nodes);
    }

    public INode<K> search(K findElement) {
        INode<K> thisNode = head;

        while (thisNode != null) {
            if (thisNode.getKey().equals(findElement)) {
                return thisNode;
            }
            thisNode = thisNode.getnext();
        }
        return null;
    }

    public void insert(INode<K> node, K insertElement) {
        Node<K> newNode = new Node<K>(insertElement);
        INode<K> tempNode = node.getnext();

        node.setnext(newNode);
        newNode.setnext(tempNode);
    }

    public int getSize() {
        INode<K> thisNode = this.head;
        int count = 0;

        if (thisNode == null)
            count = 0;
        else {
            while (thisNode != null) {
                count++;
                thisNode = thisNode.getnext();
            }
        }
        return count;
    }

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = head.getnext();
        return tempNode;
    }

    public void pop(K dataToRemove) {
        INode<K> thisNode = head;

        if (dataToRemove == head.getKey()) {
            thisNode = head.getnext();
            head = thisNode;
        }
        else {
            INode<K> previous = null;
            while (thisNode.getKey() != dataToRemove) {
                previous = thisNode;
                thisNode = thisNode.getnext();
            }
            previous.setnext(thisNode.getnext());
        }
    }

    public INode<K> popLast() {
        INode<K> tempNode = head;

        while (!tempNode.getnext().equals(tail)) {
            tempNode = tempNode.getnext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getnext();
        return tempNode;
    }
}
