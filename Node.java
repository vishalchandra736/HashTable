package com.blz.hashtable;

public class Node <K> implements INode<K>{
    private K key;
    private INode<K> next;

    public Node(K key) {
        this.key = key;
        this.next = null;
    }
    public Node() {

    }
    @Override
    public K getKey() {
        return key;
    }
    @Override
    public void setKey(K key) {
        this.key = key;
    }
    @Override
    public INode<K> getnext() {

        return null;
    }
    @Override
    public void setnext(INode<K> next) {
        this.next = next;
    }
}
