package com.tf.create_pattern.abstract_factory.shape;

/**
 * 实现接口的具体类
 */
public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}