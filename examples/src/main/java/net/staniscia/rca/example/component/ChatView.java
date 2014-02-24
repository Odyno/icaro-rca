/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.staniscia.rca.example.component;

import net.staniscia.rca.example.component.dummy.JChat;
import net.staniscia.rca.AbstractView;
import net.staniscia.rca.icons.IconFactory;

import javax.swing.*;
import java.awt.*;

/**
 * Example Of View
 */
public class ChatView extends AbstractView {

    private static final String CALC_JPEG = "/net/staniscia/rca/example/chat.jpeg";
    private final JChat jatUI;

    public ChatView() {
        jatUI = new JChat();
    }

    public Component getContentPane() {
        return jatUI;
    }

    @Override
    public Icon getIcon() {
        return IconFactory.getIconByUrl(CalcContent.class.getResource(CALC_JPEG), IconFactory.DIM_32X32);
    }

    @Override
    public String getTitle() {
        return "Chat";
    }

    @Override
    public String getToolTip() {
        return "Chat with Me";
    }

    @Override
    public VIEW_ANCHOR getDefaultPosition() {
        return VIEW_ANCHOR.RIGHT;
    }

    @Override
    public VIEW_TYPE getDefaultType() {
        return VIEW_TYPE.SLIDING;
    }

    @Override
    public boolean isOpen() {
        return true;
    }
    
    
    
    
    
}
