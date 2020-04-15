package com.tf.create_pattern.abstract_factory;

import com.tf.create_pattern.abstract_factory.color.Color;
import com.tf.create_pattern.abstract_factory.shape.Shape;

/**
 * 为Color和Shape对象创建抽象类获取工厂，统一管理两个产品族
 */
public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;
}