import java.awt.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {
        Frame f=new Frame("ActionListener Example");
        TextField tf=new TextField();
        tf.setBounds(50,50, 250,20);
        TextField tf2=new TextField();
        tf2.setBounds(50,70, 250,20);
        Button b=new Button("Нажмите здесь");
        b.setBounds(50,100,60,30);
        b.setSize(100,50);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Добро пожаловать в мир Джава.");
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}