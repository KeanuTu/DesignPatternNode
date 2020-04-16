package com.tf.create_pattern.prototype;

import java.io.IOException;

public class PrototypeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableObject obj = new SerializableObject("zhangsan",100);
        Book book1 = new ConcreateABook("A书",obj);
        System.out.println("以这本为原版，开始复印，书名："+book1.getName());
        for (int i = 0; i < 10; i++) {
            Book book = (Book) book1.deepClone();
            //如果是深拷贝，则内容和地址都等
            if (book == book1){
                System.out.println("深拷贝");
            }else if (book.equals(book1)){
                System.out.println("浅拷贝");
            }
            System.out.println("复印书籍,第"+i+"本，书名："+book.getName());

        }
    }
}
