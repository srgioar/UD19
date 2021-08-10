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
	
	String str1, str2, btnText;
	Integer op1, op2, res;
	String currentOp;
	boolean op1free = true;
	JTextField tOp1;
	JTextField tOp2;
	JTextField tRes;
	
	// Textfields para los operandos
	
	String checkContent(JButton btn) {
		
		int btnNum = 0;
		
		
		if ((btnText.equals("+") || btnText.equals("-") || btnText.equals("*") || btnText.equals("/")) && tOp2.getText() != null) { 
			op1free = false;
			currentOp = btnText;
		}
		
		else if (btnText.equals("0") || btnText.equals("1") || btnText.equals("2") || btnText.equals("3") || btnText.equals("4") || btnText.equals("5") || btnText.equals("6") || btnText.equals("7") || btnText.equals("8") || btnText.equals("9")) {
			btnText += btn.getText();
			btnNum = Integer.parseInt(btnText);
			añadir(btnNum);
		}
		
		else if (btnText.equals("=")){
			if ((tOp1.getText() != null && tOp2.getText() != null))
				calcular(op1, op2);
		}
		
		return btnText;
		
	}
	
	void añadir(int valor) {
		
		if (op1free) {
			tOp1.setText(Integer.toString(valor));
			op1 = valor;
		}
		
		else if (!op1free) {
			tOp2.setText(Integer.toString(valor));
			op2 = valor;
		}
	}
	
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
		tRes.setText(Integer.toString(res));
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
		
		tOp1 = new JTextField();
		tOp2 = new JTextField();
		tRes = new JTextField();
		tOp1.setBounds(100, 40, 100, 30);
		tOp2.setBounds(220, 40, 100, 30);
		tRes.setBounds(340, 40, 100, 30);
		contentPane.add(tOp1);
		contentPane.add(tOp2);
		contentPane.add(tRes);
		
		// BOTONES
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(180, 280, 80, 30);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(100, 100, 80, 30);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(180, 100, 80, 30);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(260, 100, 80, 30);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(100, 160, 80, 30);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(180, 160, 80, 30);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(260, 160, 80, 30);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(100, 220, 80, 30);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(180, 220, 80, 30);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(260, 220, 80, 30);
		contentPane.add(btn9);
		
		JButton btnSuma = new JButton("+");
		btnSuma.setBounds(360, 100, 80, 30);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.setBounds(360, 160, 80, 30);
		contentPane.add(btnResta);
		
		JButton btnMulti = new JButton("*");
		btnMulti.setBounds(360, 220, 80, 30);
		contentPane.add(btnMulti);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(360, 280, 80, 30);
		contentPane.add(btnDiv);
		
		JButton btnRes = new JButton("=");
		btnRes.setBounds(360, 380, 80, 30);
		contentPane.add(btnRes);
		
		JButton[] arrayButtons = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSuma, btnResta, btnMulti, btnDiv, btnRes};


		

		
		// LLENO TODOS LOS LISTENERS MEDIANTE ARRAY
	
		for (int i = 0; i < arrayButtons.length; i++) {
			int selected = i;
			JButton btnSelected = arrayButtons[i];

			arrayButtons[i].addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {

					btnText = btnSelected.getText();
					checkContent(btnSelected);

				}});
		}

		
	}

}

