package com.tf.create_pattern.prototype;

import java.io.*;

public abstract class Book implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    //对于深浅拷贝，必须是引用对象类型，即Object或Array等；
    private SerializableObject obj;


    public Book(String name, SerializableObject obj) {
        this.name = name;
        this.obj = obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }


    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        return book;
    }

    /*深复制*/
    public Object deepClone() throws IOException, ClassNotFoundException {
        /*写入当前对象的二进制流*/
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        /*以字节流的形式读取数据*/
        oos.writeObject(this);


        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String author;
    private int price;

    public SerializableObject(String author, int price) {
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
