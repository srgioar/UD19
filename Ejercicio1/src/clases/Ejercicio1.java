package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio1 extends JFrame {
	
	private JPanel contentPane;
	
	public Ejercicio1() {
		setTitle("SALUDADOR");
		setBounds(500, 200, 550, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Escribe nombre");
		
		etiqueta.setBounds(60, 20, 100, 20);
		
		contentPane.add(etiqueta);
		
		final JTextField textField = new JTextField();
		textField.setBounds(43, 67, 86, 26);
		contentPane.add(textField);
		JButton btn = new JButton("Pulsame");
		btn.setBounds(160, 220, 80, 20);
		contentPane.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(null, textField.getText());
			}});
	
		
	}
	
}
		

	

