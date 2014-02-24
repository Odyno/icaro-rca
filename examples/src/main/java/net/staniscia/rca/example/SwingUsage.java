/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.staniscia.rca.example;

import net.staniscia.rca.example.component.AboutActions;
import net.staniscia.rca.example.component.CalcContent;
import net.staniscia.rca.example.component.ChatView;
import net.staniscia.rca.swing.RCA;

/**
 *
 */
public class SwingUsage {


    private final RCA rca;

    public SwingUsage() {
        this.rca= new RCA();
    }

    public void start() throws Exception {
        rca.show("Example");
        contentInjection();
        viewInjection();
        actionInjection();
    }


    private void contentInjection() {
        rca.getContentService().add(new CalcContent());
    }


    private void actionInjection() {
        rca.getActionService().add(new AboutActions());
    }

    private void viewInjection() {
        rca.getViewService().add(new ChatView());
    }


    public static void main(String[] args) throws Exception {
        SwingUsage su= new SwingUsage();
        su.start();
    }
}
