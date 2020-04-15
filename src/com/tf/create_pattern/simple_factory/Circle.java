package com.tf.create_pattern.simple_factory;

public class Circle  implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}