import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatClientWindow extends JFrame{
    JTextArea jta;
    JTextField jtf;

    //Конструктор клиентского окна
    public ChatClientWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Client");
        setBounds(900, 500, 400, 400);
        jta = new JTextArea(10, 20); //Создали текстовое окно jta и задали параметы
        JScrollPane jsp = new JScrollPane(jta); //Передали jta в JScrollPane
        jta.setLineWrap(true); //Разрешили перенос строки
        jta.setEditable(false); //Запретили редактирование поля
        Font fnt = new Font("Arial", Font.PLAIN, 18); //Задали шрифт текстового поля
        jta.setFont(fnt); //Передали шрифт объекту поля
        add(jsp, BorderLayout.CENTER); //Разместили объект текстового поля по цетру, метода компоновки BorderLayout
        jtf = new JTextField(20); //Создали поле для ввода сообщений jtf, задали размер и определили ему метод отправки сообщения sendMsg();
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        JButton jb = new JButton("Send");//Создали кнопку Send для ввода сообщений jb, определили ему метод отправки сообщения sendMsg();
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        JPanel panelSouth = new JPanel(new BorderLayout()); //Создали панель panelSouth для размещения элементов jtf и jb, разместили ее внизу
        panelSouth.add(jtf, BorderLayout.CENTER);
        panelSouth.add(jb, BorderLayout.WEST);
        add(panelSouth, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void sendMsg (){ //Метод отправки сообщений
        jta.append(jtf.getText() + "\n");
        jtf.setText("");
        jtf.grabFocus();
    }
}
