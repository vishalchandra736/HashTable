package com.blz.hashtable;

public class HashMap<K, V> {

    LinkedLists<K> list;


    public HashMap() {
        this.list = new LinkedLists<>();
    }


    public V get(K key) {
        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) this.list.search(key);

        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) this.list.search(key);

        if (mapNode == null) {
            mapNode = new MyMapNode<>(key, value);
            this.list.append(mapNode);
        } else
            mapNode.setValue(value);
    }

    @Override
    public String toString() {
        return "HashMapNodes { " + list + " } ";
    }
}