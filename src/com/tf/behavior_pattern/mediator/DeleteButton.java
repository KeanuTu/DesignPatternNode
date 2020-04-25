package com.tf.behavior_pattern.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 具体组件相互之间不通信，它们只和中介者打交道
 */
public class DeleteButton extends JButton implements Component {
    //每个具体构件持有一个中介者引用用于交流
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}