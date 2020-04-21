package com.tf.structure_pattern.proxy;

//on System B
class ProxyImage implements Image {
    private String filename;
    private Image image;
 
    public ProxyImage(String filename) { 
        this.filename = filename; 
    }

    public void displayImage() {
        if(image == null)
              image = new RealImage(filename);
        image.displayImage();
    }
}