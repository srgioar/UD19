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
		setTitle("Insertor de películas");
		setBounds(500, 200, 550, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Escribe nombre de la peli: ");
		etiqueta.setBounds(100, 110, 180, 30);
		contentPane.add(etiqueta);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(100, 200, 180, 30);
		contentPane.add(comboBox);
		
		final JTextField textField = new JTextField();
		textField.setBounds(100, 140, 180, 30);
		contentPane.add(textField);
		JButton btn = new JButton("AÑADIR");
		btn.setBounds(160, 260, 100, 20);
		contentPane.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				comboBox.addItem(textField.getText());
			}});
		
	}

}
