package com.tf.behavior_pattern.observer;

import java.io.File;

/**
 * 通用观察者接口
 */
public interface EventListener {
    void update(String eventType, File file);
}