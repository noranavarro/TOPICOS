import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

  JLabel Label1, label2;//Reserva el espacio en memoria
  JButton btnSuma, btnResta, btnMulti, btnDivi ,btnSalir,btnCE;
  JTextField txtTexto1, txtTexto2, txtRe;
  JPanel panel;
  private Object objTextField;
 
  private void initComponents() {
    
  
    setSize(310, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    txtTexto1 = new JTextField(10);//instanciación del objeto
    txtTexto1.setEditable(true);
    txtTexto2 = new JTextField(12);//instanciación del objeto
    txtTexto2.setEditable(true);
    txtRe = new JTextField(12);//instanciación del objeto
    txtRe.setEditable(false);

    btnSuma= new JButton("+");
    btnResta = new JButton("-");
    btnMulti= new JButton("X");
    btnDivi = new JButton("/");
    btnCE = new JButton("CE");
    btnSuma.addActionListener(this); 
    btnResta.addActionListener(this); 
    btnMulti.addActionListener(this); 
    btnDivi.addActionListener(this);
    btnCE.addActionListener(this);
    btnCE.setBackground(Color.red);
    panel = new JPanel();
    panel.add(txtTexto1);
    txtTexto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    txtTexto1.setBounds(500,35,200,30);
    txtTexto2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    txtTexto2.setBounds(400,30,144,20);
    panel.add(txtTexto2);
    panel.add(btnCE);
    panel.add(btnResta);
    panel.add(btnMulti);
    panel.add(btnDivi);
    panel.add(btnSuma);
    panel.add(txtRe);
    txtRe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    txtRe.setBounds(500,80,144,10);
    
        
    
    
    setTitle("CALCULADORA");
    setContentPane(panel);
    setVisible(true);
  } 
  
  public Calculadora(){
     super("Calculadora");
    initComponents();
   
  }

   public void actionPerformed(ActionEvent e) {
    
    double num1, num2, resu;
    String resultado;
    
    { 
    if(e.getSource()==btnSuma) {
        if(txtTexto1.getText().equals("") || txtTexto2.getText().equals("")) {
        
        JOptionPane.showMessageDialog(null, "Los datos no están completos",
        "Error", JOptionPane.ERROR_MESSAGE);
         } else {
         num1=Double.parseDouble(txtTexto1.getText());
         num2=Double.parseDouble(txtTexto2.getText());
         resu=num1+num2;
         resultado=String.valueOf(resu);
         txtRe.setText(resultado);
      }
    
     }
     if(e.getSource()==btnResta) {
     if(txtTexto1.getText().equals("") || txtTexto2.getText().equals("")) {
        
        JOptionPane.showMessageDialog(null, "Los datos no están completos",
        "Error", JOptionPane.ERROR_MESSAGE);
         } else {
         num1=Double.parseDouble(txtTexto1.getText());
         num2=Double.parseDouble(txtTexto2.getText());
         resu=num1-num2;
         resultado=String.valueOf(resu);
         txtRe.setText(resultado);
      }
     }
     if(e.getSource()==btnDivi) {
     if(txtTexto1.getText().equals("") || txtTexto2.getText().equals("")) {
        
        JOptionPane.showMessageDialog(null, "Los datos no están completos",
        "Error", JOptionPane.ERROR_MESSAGE);
         } else {
         num1=Double.parseDouble(txtTexto1.getText());
         num2=Double.parseDouble(txtTexto2.getText());
         resu=num1/num2;
         resultado=String.valueOf(resu);
         txtRe.setText(resultado);
         if (num2 == 0){
          JOptionPane.showMessageDialog(null, "no se puede dividir entre 0",
        "Error", JOptionPane.ERROR_MESSAGE);
        }
             
      }
     }

     if(e.getSource()==btnMulti) {
     if(txtTexto1.getText().equals("") || txtTexto2.getText().equals("")) {
        
        JOptionPane.showMessageDialog(null, "Los datos no están completos",
        "Error", JOptionPane.ERROR_MESSAGE);
         } else {
         num1=Double.parseDouble(txtTexto1.getText());
         num2=Double.parseDouble(txtTexto2.getText());
         resu=num1*num2;
         resultado=String.valueOf(resu);
         txtRe.setText(resultado);
      }
     }
    if(e.getSource()==btnCE) {
     txtTexto1.setText("");
     txtTexto2.setText("");
      txtRe.setText("");
          }

     
     
     
     

 }}

    
  
  
  
  
     

 }