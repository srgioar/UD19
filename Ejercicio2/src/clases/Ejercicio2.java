package clases;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio2 extends JFrame {
	
	public Ejercicio2() {
		setTitle("SALUDADOR");
		setBounds(500, 200, 550, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Escribe nombre");
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(100, 200, 140, 20);
		contentPane.add(comboBox);
		
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
				comboBox.addItem(textField.getText());
			}});
		
	}

}
