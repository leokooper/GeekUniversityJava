import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainClass2 {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setTitle("Report Maker");
        jf.setBounds(800, 400, 900, 500);
        JButton jButton = new JButton("Save Report");
        jf.add(jButton, BorderLayout.SOUTH);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ReportMaker.makeReportPDF("text", "1.txt");
                } catch (IOException e1) {
                    JOptionPane.showMessageDialog(null, "Ошибка при сохранении отчета!");
                }
            }
        });
        jf.setVisible(true);


        System.out.println(strangeThings());

        throw new MyException();
    }

    public static int strangeThings() {
        try{
            return 1;
        } finally {
            return 2;
        }
    }
}
