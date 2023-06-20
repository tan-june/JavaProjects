import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class USDtoINR {

    public USDtoINR(){
        converter();
    }

    public static void converter()
    {
        JFrame f = new JFrame("Converter");
        f.getContentPane().setBackground(Color.white);

        JLabel l1, l2, l3;
        JTextField t1, t2;
        JButton b1, b2, b3;


        l3 = new JLabel("Welcome to Converter");
        l3.setBounds(130,5,200,30);
        l1 = new JLabel("Rupees:");
        l1.setBounds(20, 40, 50, 30);
        l2 = new JLabel("Dollars:");
        l2.setBounds(20, 80, 50, 30);

        t1 = new JTextField("0");
        t1.setBounds(80, 40, 60, 30);
        t2 = new JTextField("0");
        t2.setBounds(80, 80, 60, 30);

        b1 = new JButton("To $");
        b1.setBounds(150, 40, 80, 30);
        b2 = new JButton("To ₹");
        b2.setBounds(150, 80, 80, 30);

        b3 = new JButton("Exit");
        b3.setBounds(450, 900, 100, 30);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l3);

        f.setLayout(null);
        f.setSize(1000, 1000);
        f.setVisible(true);

        b1.addActionListener(e -> {
            double d = Double.parseDouble(t1.getText());
            t2.setText(String.valueOf(d/80));
        });

        b2.addActionListener(e -> {
            double d = Double.parseDouble(t2.getText());
            t1.setText(String.valueOf(d*80));
        });

        b3.addActionListener(e -> System.exit(10));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private static void openJarFile(String jarFilePath) throws IOException {
        Desktop.getDesktop().open(new File(jarFilePath));
    }
}