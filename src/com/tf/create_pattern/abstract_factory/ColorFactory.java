package com.tf.create_pattern.abstract_factory;

import com.tf.create_pattern.abstract_factory.color.Blue;
import com.tf.create_pattern.abstract_factory.color.Color;
import com.tf.create_pattern.abstract_factory.color.Green;
import com.tf.create_pattern.abstract_factory.color.Red;
import com.tf.create_pattern.abstract_factory.shape.Shape;

/**
 * ColorFactory只实现获取颜色的方法
 */
public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}