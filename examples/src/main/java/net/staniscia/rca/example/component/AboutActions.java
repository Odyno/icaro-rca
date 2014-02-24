/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.staniscia.rca.example.component;

import net.staniscia.rca.AbstractAction;
import net.staniscia.rca.icons.IconFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Example of ActionRCA
 */
public class AboutActions extends AbstractAction {

       
    private static final String ICON_NAME = "/net/staniscia/rca/example/about.jpeg";
    private static  final Icon icon=IconFactory.getIconByUrl(AboutActions.class.getResource(ICON_NAME), IconFactory.DIM_32X32);
    
    
    public AboutActions() {
        super("AboutMe-Id");
        setBarGroup("Help");
        setBarItem(true);
        setMenuGroup("Help");
        setMenuItem(true);
        setName("About");
        setIcon(icon);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, "Medea Action Example");
    }
}
