package HW06.view;

import HW06.model.Tea;
import HW06.model.TeaBuilder;
import HW06.service.HotDrinksVendingMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class PanelUser extends JFrame {
    private JTextArea info;
    protected JTextField name_field, price_field;
    protected JButton orderProduct_button;
    protected HotDrinksVendingMachine hdvm = new HotDrinksVendingMachine();

    public PanelUser() throws FileNotFoundException {
        super("PanelAdmin");
        super.setBounds(600, 400, 1024, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(4,2,2,10));

        JLabel list = new JLabel("listDrink: ");
        info = new JTextArea(hdvm.getDrink());
        JLabel name = new JLabel("drink name: ");
        name_field = new JTextField("", 2);
        JLabel price = new JLabel("drink price: ");
        price_field = new JTextField("", 2);

        orderProduct_button = new JButton("addProduct");

        container.add(list);
        container.add(info);
        container.add(new JScrollPane(info));
        container.add(name);
        container.add(name_field);
        container.add(price);
        container.add(price_field);
        container.add(orderProduct_button);


        orderProduct_button.addActionListener(new PanelUser.ButtonEventManager());
    }

    class ButtonEventManager implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            int price = Integer.parseInt(price_field.getText());
            Tea tea = TeaBuilder.getInstance().setName(name).setPrice(price).build();

//            hdvm.saveAddDrink(tea);
            name_field.setText("");
            price_field.setText("");
            try {
                info.setText(hdvm.getDrink());
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
