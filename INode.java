package com.blz.hashtable;

public interface INode <K>{

    K getKey();
    void setKey(K key);
    INode<K> getnext();
    void setnext(INode<K> next);
}
