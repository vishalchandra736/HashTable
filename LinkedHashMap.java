package com.blz.hashtable;

import java.util.ArrayList;

public class LinkedHashMap <K, V> {
    private final int numberOfBuckets;
    ArrayList<LinkedLists<K>> bucketArray;

    public LinkedHashMap() {
        this.numberOfBuckets = 10;
        this.bucketArray = new ArrayList<LinkedLists<K>>(numberOfBuckets);

        for(int index = 0; index < numberOfBuckets; index++)
            this.bucketArray.add(null);
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        LinkedLists<K> linkedList = this.bucketArray.get(index);

        if(linkedList == null) {
            linkedList = new LinkedLists<>();
            this.bucketArray.set(index, linkedList);
        }

        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
        if(mapNode == null) {
            mapNode = new MyMapNode<>(key, value);
            linkedList.append(mapNode);
        }
        else
            mapNode.setValue(value);
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        LinkedLists<K> linkedList = this.bucketArray.get(index);
        if (linkedList == null)
            return null;
        MyMapNode<K,V> mapnode = (MyMapNode<K,V>)linkedList.search(key);
        return (mapnode == null) ? null : mapnode.getValue();
    }

    @Override
    public String toString() {
        return "LinkedHashMap { " + bucketArray + "}";
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numberOfBuckets;
        //System.out.println("Key : \t'" + key + "' \tHashcode : " + hashCode + " \tindex : " + index);
        return index;
    }
}
