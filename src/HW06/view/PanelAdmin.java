package HW06.view;

import HW06.service.HotDrinksVendingMachine;
import HW06.model.Tea;
import HW06.model.TeaBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PanelAdmin extends JFrame {
    JTextArea info;
    JTextField name_field, price_field;
    JButton addProduct_button;

    public PanelAdmin() throws FileNotFoundException {
        super("PanelAdmin");
        super.setBounds(600, 400, 1024, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(4,2,2,10));

        JLabel list = new JLabel("listDrink: ");
        String dfsd = "dfdfgdfgdfgddfgdfg";
        info = new JTextArea(HotDrinksVendingMachine.getDrinks);
        info.setBounds(10,30,200,200);

        JLabel name = new JLabel("drink name: ");
        name_field = new JTextField("", 2);
        JLabel price = new JLabel("drink price: ");
        price_field = new JTextField("", 2);

        addProduct_button = new JButton("addProduct");

        container.add(list);
        container.add(info);
        container.add(new JScrollPane(info));
        container.add(name);
        container.add(name_field);
        container.add(price);
        container.add(price_field);
        container.add(addProduct_button);


        addProduct_button.addActionListener(new PanelAdmin.ButtonEventManager());
    }

    class ButtonEventManager implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            int price = Integer.parseInt(price_field.getText());
            Tea tea = TeaBuilder.getInstance().setName(name).setPrice(price).build();

            HotDrinksVendingMachine obobchenie = new HotDrinksVendingMachine();
            obobchenie.saveDrink(tea);
            name_field.setText("");
            price_field.setText("");
            info.setText("");
            try {
                info = new JTextArea(obobchenie.getDrink());
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}