package com.tf.behavior_pattern.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 具体组件相互之间不通信，它们只和中介者打交道
 */
public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}