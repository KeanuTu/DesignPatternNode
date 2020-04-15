package com.tf.create_pattern.abstract_factory;

import com.tf.create_pattern.abstract_factory.color.Color;
import com.tf.create_pattern.abstract_factory.shape.Circle;
import com.tf.create_pattern.abstract_factory.shape.Rectangle;
import com.tf.create_pattern.abstract_factory.shape.Shape;
import com.tf.create_pattern.abstract_factory.shape.Square;

/**
 * 获取形状的工厂
 */
public class ShapeFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}