import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LabExample extends JFrame{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("Сложить");
    JButton button2 = new JButton("Вычесть");
    JButton button3 = new JButton("Поделить");
    JButton button4 = new JButton("Умножить");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    //начало конструктора класса LabExample
    LabExample(){
        super("Задание №1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400,200);
        setLocationRelativeTo(null);
// создаем надпись 1
        add(new JLabel("1st Number"));
// добавляем текстовое поле jta1
        add(jta1);
// создаем надпись 2
        add(new JLabel("2nd Number"));
// добавляем текстовое поле jta2
        add(jta2);
// добавляем кнопку
        add(button);
        add(button2);
        add(button3);
        add(button4);
//добавляем слушателя к кнопке
        button.addActionListener(new ActionListener(){
            // добавляем реализацию actionPerformed
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
//переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Сумма = "+(x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()

        button2.addActionListener(new ActionListener(){
            // добавляем реализацию actionPerformed
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
//переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Вычитание = "+(x1-x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()

        button3.addActionListener(new ActionListener(){
            // добавляем реализацию actionPerformed
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
//переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Деление = "+(x1/x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()

        button4.addActionListener(new ActionListener(){
            // добавляем реализацию actionPerformed
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
//переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Умножение = "+(x1*x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()

        setVisible(true);
    } // конец конструктора
    public static void main(String[]args) {
        new LabExample();
    } // конец main()
} // конец класса LabExample