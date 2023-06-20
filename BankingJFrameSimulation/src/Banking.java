import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Banking {

    public Banking(){
        run();
    }

    private static void run(){
        JFrame frame = new JFrame("Banking Application");

        String[] items = {"A", "B", "C"};

        JTextField welcome = new JTextField("Welcome to the Banking Application!");
        welcome.setBounds(10,10,300,20);

        JComboBox<String> dropdown = new JComboBox<>(items);


        frame.setLayout(null);
        frame.setSize(1000, 1000);
        frame.setVisible(true);

        frame.add(welcome);

//        b2.addActionListener(e -> {
//            double d = Double.parseDouble(t2.getText());
//            t1.setText(String.valueOf(d*80));
//        });



    }
}
