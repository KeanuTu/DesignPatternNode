package com.tf.structure_pattern.bridge.devices;

//所有设备的通用接口
public interface Device {
    boolean isEnable();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
