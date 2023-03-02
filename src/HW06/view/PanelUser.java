package HW06.view;

import HW06.model.Tea;
import HW06.model.TeaBuilder;
import HW06.service.HotDrinksVendingMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelUser extends JFrame {
    protected JTextField name_field, price_field;
    protected JButton addProduct_button;

    public PanelUser() {
        super("PanelUser");
        super.setBounds(600, 400, 300, 250);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(3,2,2,10));

        JLabel name = new JLabel("drink name: ");
        name_field = new JTextField("", 2);
        JLabel price = new JLabel("drink price: ");
        price_field = new JTextField("", 2);

        addProduct_button = new JButton("addProduct");

        container.add(name);
        container.add(name_field);
        container.add(price);
        container.add(price_field);
        container.add(addProduct_button);


        addProduct_button.addActionListener(new PanelUser.ButtonEventManager());
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
        }
    }
}
