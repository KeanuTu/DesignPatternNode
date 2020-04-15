package com.tf.create_pattern.abstract_factory;

/**
 * 通过静态方法获取相应的产品族，完成产品族的控制。
 * 使得只生成一个产品族的商品。
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
}