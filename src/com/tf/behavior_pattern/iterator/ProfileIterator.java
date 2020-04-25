package com.tf.behavior_pattern.iterator;

/**
 * 声明迭代器接口。
 * 该接口必须提供至少一个方法来获取集合中的下个元素。
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();

}
