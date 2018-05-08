import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {
/*    static final int APP_START = 0;
    static final int APP_PREPARE = 1;
    static final int APP_WORK = 2;
    static final int APP_SAVE_DATA = 3;*/

    static AppState appState = AppState.INIT;

    public static void main(String[] args) {


        System.out.println(appState.getPriority());
        appState = appState.WORK;
        System.out.println(appState.getPriority());

     Duck d = new Duck();
     Flyable f = new Parrot();
     d.swim();
     d.fly();
        ((Parrot)f).voice();

        Parrot p1 = new Parrot();
        f.defaultFly();
        Cat cat2 = new Cat();

        Flyable f1 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("f1");
            }
        };

        Flyable f2 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("f2");
            }
        };

        f1.fly();
        f2.fly();

        System.out.println(f1.getClass().getName());
        System.out.println(f2.getClass().getName());


        JButton jb2 = new JButton("Button2");

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked Aninin Class!");
            }
        });


        JButton jb3 = new JButton("Button3");

        jb3.addActionListener(e -> System.out.println("Clicked Aninin Class! jb3"));




    }
}
