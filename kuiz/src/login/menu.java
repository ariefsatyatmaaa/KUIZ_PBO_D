package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class menu extends JFrame implements ActionListener {
    JLabel ljudul;
    JButton btnInput, btnHapus, btnEdit, btnTampil, btnExit;
    public menu() {
       ljudul = new JLabel("MENU DATA FILM");
       btnInput = new JButton("1. Input Data Film");
       btnTampil = new JButton("2. Tampilkan Data Film");
       btnHapus = new JButton("3. Hapus Data Film");
       btnEdit = new JButton("4. Edit Data Film");
       btnInput.addActionListener(this);
       btnTampil.addActionListener(this);
       btnHapus.addActionListener(this);
       btnEdit.addActionListener(this);


        setLayout(null);
        add(ljudul);
        add(btnExit);
        add(btnEdit);
        add(btnHapus);
        add(btnTampil);
        add(btnInput);
        ljudul.setBounds(70, 10, 200, 25);
        btnInput.setBounds(70, 60, 200, 25);
        btnTampil.setBounds(70, 90, 200, 25);
        btnHapus.setBounds(70, 120, 200, 25);
        btnEdit.setBounds(70, 150, 200, 25);

        setTitle("MENU DATA FILM");
        setSize(350, 280);
        ljudul.setHorizontalAlignment(SwingConstants.CENTER);
        btnInput.setHorizontalAlignment(SwingConstants.LEFT);
        btnTampil.setHorizontalAlignment(SwingConstants.LEFT);
        btnHapus.setHorizontalAlignment(SwingConstants.LEFT);
        btnEdit.setHorizontalAlignment(SwingConstants.LEFT);
        btnExit.setHorizontalAlignment(SwingConstants.LEFT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

            }
        }