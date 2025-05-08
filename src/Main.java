import form.AddEstablishment;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AddEstablishment form = new AddEstablishment();
        JFrame frame = new JFrame("Registro de Establecimiento");
        frame.setContentPane(new AddEstablishment().getContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}