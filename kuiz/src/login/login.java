package login;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.EventObject;
class Login extends JFrame implements ActionListener{

    JButton Jbt;
    JLabel ljudul;
    JLabel lawal, luname, lpass;
    JTextField Jtx1;
    JPasswordField Jtx2;

    public Login() {
        setLayout(new BorderLayout());
        ljudul = new JLabel("LOGIN");
        lawal = new JLabel("Masukan Username dan Password Anda!");
        luname = new JLabel("Username : ");
        lpass = new JLabel("Password : ");
        Jtx1 = new JTextField(15);
        Jtx2 = new JPasswordField(15);
        Jbt = new JButton("Login");
        Jbt.addActionListener(this);
        setLayout(null);
        add(ljudul);
        add(lawal);
        add(luname);
        add(lpass);
        add(Jtx1);
        add(Jtx2);
        add(Jbt);
        ljudul.setBounds(115, 10, 150, 25);
        lawal.setBounds(25, 50, 300, 25);
        luname.setBounds(100, 90, 150, 25);
        Jtx1.setBounds(60, 130, 150, 25);
        lpass.setBounds(100, 170, 150, 25);
        Jtx2.setBounds(60, 210, 150, 25);
        Jbt.setBounds(75, 260, 110, 25);
        Jbt.setBackground(Color.orange);
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private String username="",password="";

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Jbt) {
            username = Jtx1.getText();
            password = String.valueOf(Jtx2.getPassword());
            if (username.equals("arief")&& password.equals("arief")){
                setVisible(true);
                new menu();
            }
            else {
                JOptionPane.showMessageDialog(null, "USERNAME/PASSWORD ANDA SALAH", "Hasil", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}