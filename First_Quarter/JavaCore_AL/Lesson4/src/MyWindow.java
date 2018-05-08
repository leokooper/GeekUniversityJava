import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MyWindow extends JFrame {

    JTextField textField;
    JTextArea jta;
    class MyHintTextField extends JTextField{
        String hint;


        public MyHintTextField(String hint){
            this.hint = hint;
        }
    }

    public MyWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Windows");
        setBounds(900, 500, 400, 400);
//        setLayout(new FlowLayout());
        JButton jb1 = new JButton("Button #1");
        JButton jb2 = new JButton("Button #2");
        //jb1.setPreferredSize(new Dimension(40, 40));
//        add(jb1);
//        add(jb2);
        jb1.setBounds(10, 10, 50,50);
        jb2.setBounds(30, 30, 100,20);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("CLICKED!!!!");
            }
        });

        textField = new JTextField(20);
        jta = new JTextArea(10, 20);
        JScrollPane jsp = new JScrollPane(jta);
        jta.setLineWrap(true);
        jta.setEditable(false);
        add(jsp, BorderLayout.CENTER);

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }

        });



        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        JPanel upperPanel = new JPanel(new BorderLayout());
        upperPanel.add(jb1, BorderLayout.WEST);
        upperPanel.add(jb2, BorderLayout.EAST);
        upperPanel.add(textField, BorderLayout.CENTER);
        add(upperPanel, BorderLayout.NORTH);
        JButton jbWarning = new JButton("Warning");
        jbWarning.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"WARNING!!!!");
                //!!!!JOptionPane.showOptionDialog(null, "msg", "title", JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"A", "B", "C", "D"}, "A");
            }
        });
        jbWarning.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                        jbWarning.setBackground(new Color((int)((float)e.getX()/(float)jbWarning.getWidth() * 240f), 100, 0));
            }
        });
        add(jbWarning, BorderLayout.SOUTH);
        JList<String> jls = new JList<>(new DefaultListModel<>());
        add(jls, BorderLayout.EAST);
        jls.setPreferredSize(new Dimension(100,1));
        ((DefaultListModel<String>)jls.getModel()).addElement("A");
        ((DefaultListModel<String>)jls.getModel()).addElement("B");
        ((DefaultListModel<String>)jls.getModel()).addElement("C");
        JLabel jLabel = new JLabel("Java Lesson 4");
        jLabel.setPreferredSize(new Dimension(100,1));
        add(jLabel, BorderLayout.WEST);
        //add(textField);

/*        for (int i = 0; i < 50; i++) {
            JButton jb = new JButton("B# " + i);
            add(jb);
            jb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("X");
                }

            });

        }*/
        setVisible(true);
    }

    public void sendMsg (){
        jta.append(textField.getText() + "\n");
        //System.out.println(textField.getText());
        textField.setText("");
        textField.grabFocus();
    }
}
