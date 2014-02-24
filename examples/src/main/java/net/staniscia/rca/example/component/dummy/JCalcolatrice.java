/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.staniscia.rca.example.component.dummy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCalcolatrice extends JPanel
{
  private JButton jButton1;
  private JButton jButton10;
  private JButton jButton11;
  private JButton jButton12;
  private JButton jButton13;
  private JButton jButton14;
  private JButton jButton15;
  private JButton jButton16;
  private JButton jButton17;
  private JButton jButton19;
  private JButton jButton2;
  private JButton jButton20;
  private JButton jButton3;
  private JButton jButton4;
  private JButton jButton5;
  private JButton jButton6;
  private JButton jButton7;
  private JButton jButton8;
  private JButton jButton9;
  private JButton jButton21;
  private JTextField jTextField1;
  double[] formula = new double[2];
  String b = "";

  public JCalcolatrice()
  {
    initComponents();
  }

  private void initComponents()
  {
    this.jTextField1 = new JTextField();
    this.jButton1 = new JButton();
    this.jButton2 = new JButton();
    this.jButton3 = new JButton();
    this.jButton4 = new JButton();
    this.jButton5 = new JButton();
    this.jButton6 = new JButton();
    this.jButton7 = new JButton();
    this.jButton8 = new JButton();
    this.jButton9 = new JButton();
    this.jButton10 = new JButton();
    this.jButton11 = new JButton();
    this.jButton12 = new JButton();
    this.jButton13 = new JButton();
    this.jButton15 = new JButton();
    this.jButton16 = new JButton();
    this.jButton17 = new JButton();
    this.jButton19 = new JButton();
    this.jButton14 = new JButton();
    this.jButton20 = new JButton();
    this.jButton21 = new JButton();



    this.jTextField1.setEditable(false);

    this.jButton1.setText("7");
    this.jButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton1ActionPerformed(evt);
      }
    });
    this.jButton2.setText("4");
    this.jButton2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton2ActionPerformed(evt);
      }
    });
    this.jButton3.setText("1");
    this.jButton3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton3ActionPerformed(evt);
      }
    });
    this.jButton4.setText("8");
    this.jButton4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton4ActionPerformed(evt);
      }
    });
    this.jButton5.setText("5");
    this.jButton5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton5ActionPerformed(evt);
      }
    });
    this.jButton6.setText("2");
    this.jButton6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton6ActionPerformed(evt);
      }
    });
    this.jButton7.setText("9");
    this.jButton7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton7ActionPerformed(evt);
      }
    });
    this.jButton8.setText("6");
    this.jButton8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton8ActionPerformed(evt);
      }
    });
    this.jButton9.setText("3");
    this.jButton9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton9ActionPerformed(evt);
      }
    });
    this.jButton10.setText("+");
    this.jButton10.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton10ActionPerformed(evt);
      }
    });
    this.jButton11.setText("-");
    this.jButton11.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton11ActionPerformed(evt);
      }
    });
    this.jButton12.setText("×");
    this.jButton12.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton12ActionPerformed(evt);
      }
    });
    this.jButton13.setText("Cancella");
    this.jButton13.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton13ActionPerformed(evt);
      }
    });
    this.jButton15.setText("=");
    this.jButton15.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton15ActionPerformed(evt);
      }
    });
    this.jButton16.setText("√");
    this.jButton16.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton16ActionPerformed(evt);
      }
    });
    this.jButton17.setText("×²");
    this.jButton17.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton17ActionPerformed(evt);
      }
    });
    //this.jButton19.setIcon(new ImageIcon(getClass().getResource("/Exit.png")));
    this.jButton19.setText("esci");
    this.jButton19.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton19ActionPerformed(evt);
      }
    });
    this.jButton14.setText("÷");
    this.jButton14.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton14ActionPerformed(evt);
      }
    });
    this.jButton20.setText("+/-");
    this.jButton20.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton20ActionPerformed(evt);
      }
    });
    this.jButton21.setText("0");
    this.jButton21.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        JCalcolatrice.this.jButton21ActionPerformed(evt);
      }
    });



    GroupLayout layout = new GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jButton2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton5).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton8).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton11)).addGroup(layout.createSequentialGroup().addComponent(this.jButton3).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton6).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton9).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton12))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton16, -1, -1, 32767).addComponent(this.jButton14)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton15, -1, -1, 32767).addComponent(this.jButton17, -1, 44, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton19, -1, 49, 32767).addComponent(this.jButton20, -1, 49, 32767))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jTextField1, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.jButton1).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton4).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton7).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton10).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton21).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton13, -1, 105, 32767)))).addContainerGap()));

    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 28, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton4).addComponent(this.jButton7).addComponent(this.jButton10).addComponent(this.jButton13, -2, 30, -2).addComponent(this.jButton21)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton2).addComponent(this.jButton5).addComponent(this.jButton8).addComponent(this.jButton11).addComponent(this.jButton17, -1, 30, 32767).addComponent(this.jButton14).addComponent(this.jButton20)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton19, -1, 30, 32767).addComponent(this.jButton15, GroupLayout.Alignment.LEADING, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton3, -1, -1, 32767).addComponent(this.jButton9, -1, -1, 32767).addComponent(this.jButton16, -1, 30, 32767).addComponent(this.jButton6, -1, -1, 32767).addComponent(this.jButton12, -2, 30, -2))).addContainerGap()));

    
  }

  

  private void jButton13ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText("");
  }

  private void jButton3ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "1");
  }

  private void jButton6ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "2");
  }

  private void jButton9ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "3");
  }

  private void jButton2ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "4");
  }

  private void jButton5ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "5");
  }

  private void jButton8ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "6");
  }

  private void jButton7ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "9");
  }

  private void jButton1ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "7");
  }

  private void jButton4ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "8");
  }

  private void jButton21ActionPerformed(ActionEvent evt)
  {
    this.jTextField1.setText(this.jTextField1.getText() + "0");
  }

  private void jButton10ActionPerformed(ActionEvent evt) {
    this.formula[0] = Double.parseDouble(this.jTextField1.getText());
    this.b = "+";
    this.jTextField1.setText("");
  }

  private void jButton11ActionPerformed(ActionEvent evt)
  {
    this.formula[0] = Double.parseDouble(this.jTextField1.getText());
    this.b = "-";
    this.jTextField1.setText("");
  }

  private void jButton12ActionPerformed(ActionEvent evt)
  {
    this.formula[0] = Double.parseDouble(this.jTextField1.getText());
    this.b = "*";
    this.jTextField1.setText("");
  }

  private void jButton14ActionPerformed(ActionEvent evt)
  {
    this.formula[0] = Double.parseDouble(this.jTextField1.getText());
    this.b = "/";
    this.jTextField1.setText("");
  }

  private void jButton15ActionPerformed(ActionEvent evt)
  {
    this.formula[1] = Double.parseDouble(this.jTextField1.getText());
    double x = 0.0D;
    if (this.b == "+") {
      x = this.formula[0] + this.formula[1];
    }
    if (this.b == "-") {
      x = this.formula[0] - this.formula[1];
    }
    if (this.b == "*") {
      x = this.formula[0] * this.formula[1];
    }
    if (this.b == "/") {
      x = this.formula[0] / this.formula[1];
    }
    if (this.b == "altro")
    {
      this.jTextField1.setText(this.jTextField1.getText());
    }
    else
    {
      this.jTextField1.setText("" + x);
    }
  }

  private void jButton19ActionPerformed(ActionEvent evt)
  {
    System.exit(0);
  }

  private void jButton16ActionPerformed(ActionEvent evt)
  {
    double v = Math.sqrt(Double.parseDouble(this.jTextField1.getText()));
    this.b = "altro";
    this.jTextField1.setText("" + v);
  }

  private void jButton17ActionPerformed(ActionEvent evt)
  {
    double v = Math.pow(Double.parseDouble(this.jTextField1.getText()), 2.0D);
    this.b = "altro";
    this.jTextField1.setText("" + v);
  }

  private void jButton20ActionPerformed(ActionEvent evt)
  {
    double v = -Double.parseDouble(this.jTextField1.getText());
    this.b = "altro";
    this.jTextField1.setText("" + v);
  }

 
}
