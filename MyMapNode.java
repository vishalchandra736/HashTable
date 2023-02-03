package com.blz.hashtable;

public class MyMapNode <K, V> implements INode<K>{
    K key;
    V value;
    MyMapNode<K, V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
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
        return next;
    }

    @Override
    public void setnext(INode<K> next) {
        this.next = (MyMapNode<K,V>) next;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder mapNodeString = new StringBuilder();
        mapNodeString.append("MyMapNode{" + "K=").append(key).append("V=").append(value).append('}');
        if(next != null)
            mapNodeString.append("->").append(next);
        return mapNodeString.toString();
    }
}
