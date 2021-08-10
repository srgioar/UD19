package clases;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Ejercicio3 extends JFrame {
	
	String especialidad;
	
	public Ejercicio3() {
		especialidad = new String();
		setTitle("Encuesta");
		setBounds(500, 200, 620, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel contentPane = new JPanel();
		JPanel sliderPanel = new JPanel();
		JPanel checksPanel = new JPanel();
		JPanel ticksPanel = new JPanel();
		
		// CARGAMOS TODOS LOS FRAMES HIJO AL PRINCIPAL
		
		setContentPane(contentPane);
		
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(sliderPanel);
		contentPane.add(checksPanel);
		contentPane.add(ticksPanel);
		
		// OPTION
		
		JLabel etiqueta = new JLabel("Elige un sistema operativo: ");
		etiqueta.setBounds(60, 20, 200, 20);
		checksPanel.add(etiqueta);		
		
		JRadioButton rbtnOp1 = new JRadioButton("Windows", true);
		rbtnOp1.setActionCommand("Windows");
		rbtnOp1.setBounds(43, 50, 109, 23);
		checksPanel.add(rbtnOp1);
		
		JRadioButton rbtnOp2 = new JRadioButton("Linux", true);
		rbtnOp2.setActionCommand("Linux");
		checksPanel.setBounds(43, 70, 109, 23);
		contentPane.add(rbtnOp2);
		
		JRadioButton rbtnOp3= new JRadioButton("Mac", true);
		rbtnOp3.setBounds(43, 90, 109, 23);
		rbtnOp3.setActionCommand("Mac");
		contentPane.add(rbtnOp3);
		
		ButtonGroup bgroup = new ButtonGroup();
		
		bgroup.add(rbtnOp1);
		bgroup.add(rbtnOp2);
		bgroup.add(rbtnOp3);
		
		// CHECKBOX
		
		JLabel etiqueta2 = new JLabel("Elige tu especialidad (una o varias): ");
		etiqueta2.setBounds(60, 320, 400, 20);
		ticksPanel.add(etiqueta2);
		
		JCheckBox chk1 = new JCheckBox("Programación", false);
		chk1.setActionCommand("Programación");
		JCheckBox chk2 = new JCheckBox("Diseño gráfico", false);
		chk2.setActionCommand("Diseño gráfico");
		JCheckBox chk3 = new JCheckBox("Administración", false);
		chk3.setActionCommand("Administración");
		
		chk1.setBounds(43, 260, 109, 23);
		chk2.setBounds(43, 280, 109, 23);
		chk3.setBounds(43, 300, 109, 23);
		
		ticksPanel.add(chk1);
		ticksPanel.add(chk2);
		ticksPanel.add(chk3);
	
		
		// SLIDER
		
		JLabel etiqueta3 = new JLabel("¿Horas dedicadas al ordenador?: ");
		etiqueta3.setBounds(60, 120, 400, 20);
		sliderPanel.add(etiqueta3);
		
		JSlider slider = new JSlider(JSlider.VERTICAL, 1, 10, 1);
		slider.setSize(400, 400);
		slider.setInverted(false);
		slider.setPaintTicks(true);
		sliderPanel.add(slider);
		
		JButton btn = new JButton("Resultados");
		btn.setBounds(160, 220, 80, 20);
		contentPane.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				
				if (chk1.isSelected()) {
					especialidad += chk1.getActionCommand() + "\n";
				}
					
				if (chk2.isSelected()) {
					especialidad += chk2.getActionCommand() + "\n";
				} 
				if (chk3.isSelected()) {
					especialidad += chk3.getActionCommand() + "\n";
				}
				
		//JOptionPane.showMessageDialog(null, "Sistema Operativo: " + especialidad);
		JOptionPane.showMessageDialog(null, "Elegido: " + bgroup.getSelection().getActionCommand() +
		"\n Valor del slider: " + slider.getValue() +
		"\n Especialidades: \n" + especialidad);
		//System.out.println("Valor: " + slider.getValue());
	
			}});
		
	}
	
}



