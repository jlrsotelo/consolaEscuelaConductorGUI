package form;

import clases.Establishment;
import persistence.EstablishmentDB;
import persistence.EstablishmentDBImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEstablishment{
    private JPanel ContentPane;
    private JLabel lblCode;
    private JTextField txtCode;
    private JLabel lblUbigeo;
    private JTextField txtUbigeo;
    private JTextField txtRuc;
    private JTextField txtName;
    private JLabel lblRuc;
    private JComboBox cmbType;
    private JLabel lblType;
    private JLabel lblName;
    private JTextField txtAddress;
    private JLabel lblAddress;
    private JComboBox cmbState;
    private JLabel lblState;
    private JTextField txtEmail;
    private JLabel lblEmail;
    private JTextField txtPhone;
    private JLabel lblPhone;
    private JButton btnSave;

    public AddEstablishment() {
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                this.register();
            }

            private void register() {
                EstablishmentDB establishmentDB=new EstablishmentDBImpl();
                Establishment establishment=new Establishment();
                establishment.setcEstablishment(Long.valueOf(txtCode.getText()));
                establishment.setcUbigeo(txtUbigeo.getText());
                establishment.setnRuc(txtRuc.getText());
                establishment.setType(cmbType.getModel().getSelectedItem().toString());
                establishment.setName(txtName.getText());
                establishment.setAddress(txtAddress.getText());
                establishment.setState(cmbState.getSelectedItem().toString());
                establishment.setEmail(txtEmail.getText());
                establishment.setPhone(txtPhone.getText());

                try{
                    if (establishmentDB.add(establishment)){
                        System.out.println("Establecimiento creada con exito");
                    }else{
                        System.out.println("Establecimiento con error");
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public JPanel getContentPane() {
        return ContentPane;
    }
}