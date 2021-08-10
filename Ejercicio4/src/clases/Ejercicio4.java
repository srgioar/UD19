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

public class Ejercicio4 extends JFrame {
	
	int op1, op2, res;
	String currentOp;
	int contador = 0;
	
	int calcular(int op1, int op2){
		int res = 0;
		switch (currentOp) {
		case ("+"):
			res = op1 + op2;
		case ("-"):
			res = op1 - op2;
		case ("*"):
			res = op1 * op2;
		case ("/"):
			res = op1 / op2;
			
		}
		return res;
	}
	
	public Ejercicio4() {
		setTitle("CALCULADORA");
		setBounds(500, 200, 550, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		// BOTONES
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(160, 220, 80, 20);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(160, 220, 80, 20);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(160, 220, 80, 20);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(160, 220, 80, 20);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(160, 220, 80, 20);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(160, 220, 80, 20);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(160, 220, 80, 20);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(160, 220, 80, 20);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(160, 220, 80, 20);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(160, 220, 80, 20);
		contentPane.add(btn9);
		
		JButton btnSuma = new JButton("+");
		btnSuma.setBounds(160, 220, 80, 20);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.setBounds(160, 220, 80, 20);
		contentPane.add(btnResta);
		
		JButton btnMulti = new JButton("*");
		btnMulti.setBounds(160, 220, 80, 20);
		contentPane.add(btnMulti);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(160, 220, 80, 20);
		contentPane.add(btnDiv);
		
		JButton btnRes = new JButton("=");
		btnRes.setBounds(160, 220, 80, 20);
		contentPane.add(btnRes);
		
		JButton[] arrayButtons = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSuma, btnResta, btnMulti, btnDiv, btnRes};

		// Textfields para los operandos
		
		JTextField tOp1 = new JTextField();
		JTextField tOp2 = new JTextField();
		JTextField tRes = new JTextField();
		tOp1.setBounds(160, 220, 80, 20);
		tOp2.setBounds(160, 220, 80, 20);
		tRes.setBounds(160, 220, 80, 20);
		contentPane.add(tOp1);
		contentPane.add(tOp2);
		contentPane.add(tRes);
		
		// LLENO TODOS LOS LISTENERS MEDIANTE ARRAY
		

		
	
		for (int i = 0; i < arrayButtons.length; i++) {
			int selected = i;
			arrayButtons[i].addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					if (contador == 0) {
						op1 = selected;
						tOp1.setText(Integer.toString(selected));
						contador++;
					}
					if (contador == 1) {
						op2 = selected;
						tOp2.setText(Integer.toString(selected));
						contador++;
					}
					
					if (contador ==2) {
						int resultado = calcular(op1, op2);
						tRes.setText(Integer.toString(resultado));
					}
					
				}});
		}

		
	}

}

