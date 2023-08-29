import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Services.VendingMachine;

public class MainFrame {
    private VendingMachine vendingMachine;
    final private Font mainFont = new Font("Arial", Font.BOLD, 18);

    public MainFrame(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void initialize() {

        JLabel lbShowBalance = new JLabel(vendingMachine.getCoinDispenser().toString());
        lbShowBalance.setFont(mainFont);
        lbShowBalance.setForeground(Color.RED);

        JButton btnProd1 = new JButton(
                vendingMachine.getProduct(0).getName() + ": " + vendingMachine.getProduct(0).getPrice() + " руб.");
        JButton btnProd2 = new JButton(
                vendingMachine.getProduct(1).getName() + ": " + vendingMachine.getProduct(1).getPrice() + " руб.");
        JButton btnProd3 = new JButton(
                vendingMachine.getProduct(2).getName() + ": " + vendingMachine.getProduct(2).getPrice() + " руб.");
        JButton btnProd4 = new JButton(
                vendingMachine.getProduct(3).getName() + ": " + vendingMachine.getProduct(3).getPrice() + " руб.");
        JButton btnProd5 = new JButton(
                vendingMachine.getProduct(4).getName() + ": " + vendingMachine.getProduct(4).getPrice() + " руб.");
        JButton btnProd6 = new JButton(
                vendingMachine.getProduct(5).getName() + ": " + vendingMachine.getProduct(5).getPrice() + " руб.");

        btnProd1.setFont(mainFont);
        btnProd2.setFont(mainFont);
        btnProd3.setFont(mainFont);
        btnProd4.setFont(mainFont);
        btnProd5.setFont(mainFont);
        btnProd6.setFont(mainFont);

        btnProd1.setForeground(Color.BLUE);
        btnProd2.setForeground(Color.BLUE);
        btnProd3.setForeground(Color.BLUE);
        btnProd4.setForeground(Color.BLUE);
        btnProd5.setForeground(Color.BLUE);
        btnProd6.setForeground(Color.BLUE);

        btnProd1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnProd2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnProd3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnProd4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnProd5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnProd6.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnProd1.setEnabled(false);
        btnProd2.setEnabled(false);
        btnProd3.setEnabled(false);
        btnProd4.setEnabled(false);
        btnProd5.setEnabled(false);
        btnProd6.setEnabled(false);

        btnProd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendingMachine.getCoinDispenser().setBalance(
                        vendingMachine.getCoinDispenser().getBalance() - vendingMachine.getProduct(0).getPrice());
                lbShowBalance.setText(vendingMachine.getCoinDispenser().toString());
                purchaseInfo(0);
                Sounds.playSound("VendingMachine\\sounds\\sound.wav").join();

                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(0).getPrice()) {
                    btnProd1.setEnabled(false);
                } else
                    btnProd1.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(1).getPrice()) {
                    btnProd2.setEnabled(false);
                } else
                    btnProd2.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(2).getPrice()) {
                    btnProd3.setEnabled(false);
                } else
                    btnProd3.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(3).getPrice()) {
                    btnProd4.setEnabled(false);
                } else
                    btnProd4.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(4).getPrice()) {
                    btnProd5.setEnabled(false);
                } else
                    btnProd5.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(5).getPrice()) {
                    btnProd6.setEnabled(false);
                } else
                    btnProd6.setEnabled(true);
            }
        });

        btnProd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendingMachine.getCoinDispenser().setBalance(
                        vendingMachine.getCoinDispenser().getBalance() - vendingMachine.getProduct(1).getPrice());
                lbShowBalance.setText(vendingMachine.getCoinDispenser().toString());
                purchaseInfo(1);
                Sounds.playSound("VendingMachine\\sounds\\sound.wav").join();

                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(0).getPrice()) {
                    btnProd1.setEnabled(false);
                } else
                    btnProd1.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(1).getPrice()) {
                    btnProd2.setEnabled(false);
                } else
                    btnProd2.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(2).getPrice()) {
                    btnProd3.setEnabled(false);
                } else
                    btnProd3.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(3).getPrice()) {
                    btnProd4.setEnabled(false);
                } else
                    btnProd4.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(4).getPrice()) {
                    btnProd5.setEnabled(false);
                } else
                    btnProd5.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(5).getPrice()) {
                    btnProd6.setEnabled(false);
                } else
                    btnProd6.setEnabled(true);
            }
        });

        btnProd3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendingMachine.getCoinDispenser().setBalance(
                        vendingMachine.getCoinDispenser().getBalance() - vendingMachine.getProduct(2).getPrice());
                lbShowBalance.setText(vendingMachine.getCoinDispenser().toString());
                purchaseInfo(2);
                Sounds.playSound("VendingMachine\\sounds\\sound.wav").join();

                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(0).getPrice()) {
                    btnProd1.setEnabled(false);
                } else
                    btnProd1.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(1).getPrice()) {
                    btnProd2.setEnabled(false);
                } else
                    btnProd2.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(2).getPrice()) {
                    btnProd3.setEnabled(false);
                } else
                    btnProd3.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(3).getPrice()) {
                    btnProd4.setEnabled(false);
                } else
                    btnProd4.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(4).getPrice()) {
                    btnProd5.setEnabled(false);
                } else
                    btnProd5.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(5).getPrice()) {
                    btnProd6.setEnabled(false);
                } else
                    btnProd6.setEnabled(true);
            }
        });

        btnProd4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendingMachine.getCoinDispenser().setBalance(
                        vendingMachine.getCoinDispenser().getBalance() - vendingMachine.getProduct(3).getPrice());
                lbShowBalance.setText(vendingMachine.getCoinDispenser().toString());
                purchaseInfo(3);
                Sounds.playSound("VendingMachine\\sounds\\sound.wav").join();

                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(0).getPrice()) {
                    btnProd1.setEnabled(false);
                } else
                    btnProd1.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(1).getPrice()) {
                    btnProd2.setEnabled(false);
                } else
                    btnProd2.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(2).getPrice()) {
                    btnProd3.setEnabled(false);
                } else
                    btnProd3.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(3).getPrice()) {
                    btnProd4.setEnabled(false);
                } else
                    btnProd4.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(4).getPrice()) {
                    btnProd5.setEnabled(false);
                } else
                    btnProd5.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(5).getPrice()) {
                    btnProd6.setEnabled(false);
                } else
                    btnProd6.setEnabled(true);
            }
        });

        btnProd5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendingMachine.getCoinDispenser().setBalance(
                        vendingMachine.getCoinDispenser().getBalance() - vendingMachine.getProduct(4).getPrice());
                lbShowBalance.setText(vendingMachine.getCoinDispenser().toString());
                purchaseInfo(4);
                Sounds.playSound("VendingMachine\\sounds\\sound.wav").join();

                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(0).getPrice()) {
                    btnProd1.setEnabled(false);
                } else
                    btnProd1.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(1).getPrice()) {
                    btnProd2.setEnabled(false);
                } else
                    btnProd2.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(2).getPrice()) {
                    btnProd3.setEnabled(false);
                } else
                    btnProd3.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(3).getPrice()) {
                    btnProd4.setEnabled(false);
                } else
                    btnProd4.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(4).getPrice()) {
                    btnProd5.setEnabled(false);
                } else
                    btnProd5.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(5).getPrice()) {
                    btnProd6.setEnabled(false);
                } else
                    btnProd6.setEnabled(true);
            }
        });

        btnProd6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendingMachine.getCoinDispenser().setBalance(
                        vendingMachine.getCoinDispenser().getBalance() - vendingMachine.getProduct(5).getPrice());
                lbShowBalance.setText(vendingMachine.getCoinDispenser().toString());
                purchaseInfo(5);
                Sounds.playSound("VendingMachine\\sounds\\sound.wav").join();

                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(0).getPrice()) {
                    btnProd1.setEnabled(false);
                } else
                    btnProd1.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(1).getPrice()) {
                    btnProd2.setEnabled(false);
                } else
                    btnProd2.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(2).getPrice()) {
                    btnProd3.setEnabled(false);
                } else
                    btnProd3.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(3).getPrice()) {
                    btnProd4.setEnabled(false);
                } else
                    btnProd4.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(4).getPrice()) {
                    btnProd5.setEnabled(false);
                } else
                    btnProd5.setEnabled(true);
                if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(5).getPrice()) {
                    btnProd6.setEnabled(false);
                } else
                    btnProd6.setEnabled(true);
            }
        });

        JPanel productPanel = new JPanel();
        productPanel.setLayout(
                new GridLayout(vendingMachine.getHolder().getRows(), vendingMachine.getHolder().getCols(), 5, 5));
        productPanel.add(btnProd1);
        productPanel.add(btnProd2);
        productPanel.add(btnProd3);
        productPanel.add(btnProd4);
        productPanel.add(btnProd5);
        productPanel.add(btnProd6);

        JLabel lbInputCash = new JLabel("Пополните баланс");
        lbInputCash.setFont(mainFont);

        JTextField tfInputCash = new JTextField();
        tfInputCash.setFont(mainFont);

        JButton btnInsertCoin = new JButton("Ввод");
        btnInsertCoin.setFont(mainFont);
        btnInsertCoin.setForeground(Color.BLUE);
        btnInsertCoin.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnInsertCoin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (isDigit(tfInputCash.getText())) {
                    vendingMachine.getCoinDispenser().setBalance(
                            vendingMachine.getCoinDispenser().getBalance() + Integer.parseInt(tfInputCash.getText()));
                    lbShowBalance.setText(vendingMachine.getCoinDispenser().toString());

                    if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(0).getPrice()) {
                        btnProd1.setEnabled(false);
                    } else
                        btnProd1.setEnabled(true);
                    if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(1).getPrice()) {
                        btnProd2.setEnabled(false);
                    } else
                        btnProd2.setEnabled(true);
                    if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(2).getPrice()) {
                        btnProd3.setEnabled(false);
                    } else
                        btnProd3.setEnabled(true);
                    if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(3).getPrice()) {
                        btnProd4.setEnabled(false);
                    } else
                        btnProd4.setEnabled(true);
                    if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(4).getPrice()) {
                        btnProd5.setEnabled(false);
                    } else
                        btnProd5.setEnabled(true);
                    if (vendingMachine.getCoinDispenser().getBalance() < vendingMachine.getProduct(5).getPrice()) {
                        btnProd6.setEnabled(false);
                    } else
                        btnProd6.setEnabled(true);
                } else
                    JOptionPane.showMessageDialog(new JFrame(), "Кажется вы ввели не деньги", "Ошибка!", JOptionPane.ERROR_MESSAGE);

                tfInputCash.setText("");

            }
        });

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1, 1, 8, 8));
        formPanel.add(lbInputCash);
        formPanel.add(tfInputCash);
        formPanel.add(btnInsertCoin);
        formPanel.add(lbShowBalance);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.lightGray);

        mainPanel.add(productPanel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.SOUTH);

        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        formPanel.setOpaque(false);
        productPanel.setOpaque(false);

        JFrame frame = new JFrame();
        frame.add(mainPanel);

        frame.setTitle("Vending Machine");
        frame.setSize(960, 180);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void purchaseInfo(int productIndex) {
        System.out.println("\nВЫ КУПИЛИ -->   " + vendingMachine.getProduct(productIndex).toString() + "\n"
                + vendingMachine.getCoinDispenser().toString());
    }

    public boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

// public void checkBalance() {
// if (vendingMachine.getCoinDispenser().getBalance() <
// vendingMachine.getProduct(0).getPrice()) {
// btnProd1.setEnabled(false);
// } else
// btnProd1.setEnabled(true);
// if (vendingMachine.getCoinDispenser().getBalance() <
// vendingMachine.getProduct(1).getPrice()) {
// btnProd2.setEnabled(false);
// } else
// btnProd2.setEnabled(true);
// if (vendingMachine.getCoinDispenser().getBalance() <
// vendingMachine.getProduct(2).getPrice()) {
// btnProd3.setEnabled(false);
// } else
// btnProd3.setEnabled(true);
// if (vendingMachine.getCoinDispenser().getBalance() <
// vendingMachine.getProduct(3).getPrice()) {
// btnProd4.setEnabled(false);
// } else
// btnProd4.setEnabled(true);
// if (vendingMachine.getCoinDispenser().getBalance() <
// vendingMachine.getProduct(4).getPrice()) {
// btnProd5.setEnabled(false);
// } else
// btnProd5.setEnabled(true);
// if (vendingMachine.getCoinDispenser().getBalance() <
// vendingMachine.getProduct(5).getPrice()) {
// btnProd6.setEnabled(false);
// } else
// btnProd6.setEnabled(true);
// }