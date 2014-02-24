/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.staniscia.rca.example.component;

import net.staniscia.rca.AbstractContent;
import net.staniscia.rca.example.component.dummy.JCalcolatrice;
import net.staniscia.rca.icons.IconFactory;

import javax.swing.*;
import java.awt.*;

/**
 *
 * Example Of Content
 */
public class CalcContent extends AbstractContent {
    
    private static final String CALC_JPEG = "/net/staniscia/rca/example/calc.jpeg";
    private static  final Icon icon=IconFactory.getIconByUrl(CalcContent.class.getResource(CALC_JPEG), IconFactory.DIM_32X32);
    

    private final JCalcolatrice calc;

    public CalcContent() {
        calc = new JCalcolatrice();
    }

    public Component getContentPane() {
        return calc;
    }

    @Override
    public Icon getIcon() {
        return icon;
    }

    @Override
    public String getTitle() {
        return "Calcolatrice";
    }

    @Override
    public String getToolTip() {
        return "Fatevi 2 conti!";
    }
    
    
    
    
    
    
}
