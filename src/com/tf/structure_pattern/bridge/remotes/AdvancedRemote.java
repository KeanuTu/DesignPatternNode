package com.tf.structure_pattern.bridge.remotes;

import com.tf.structure_pattern.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
