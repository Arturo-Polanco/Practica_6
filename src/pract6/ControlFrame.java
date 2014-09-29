package pract6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ARTURO POLANCO CARRILLO
 * 01200720
 * 3/14/14
 * Practica 6
 */
public class ControlFrame extends JFrame {
	private JPanel panel;
	private JPanel panel2;

	public ControlFrame() {
		this.setSize(400, 200);
		this.setAutoRequestFocus(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(2,0));
		panel2 = new JPanel(new FlowLayout());
		panel.setBackground(Color.DARK_GRAY);
		panel2.setBackground(Color.DARK_GRAY);
		JLabel label1 = new JLabel("text");
		label1.setForeground(Color.WHITE);
		label1.setVerticalAlignment(SwingConstants.CENTER);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label1);
		panel.add(panel2);
		this.setContentPane(panel);
		this.setVisible(true);
	}

	public void showButtonMenu() {
		JButton sumar = new JButton("Sumar");
		/*JButton max = new JButton("Max");
		JButton comparar = new JButton("Comparar");*/
		JButton salir = new JButton("Exit");
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sum = ArrayUtil.suma(ArrayUtil.arreglo);
				JOptionPane.showMessageDialog(panel, "Suma es: \n" + sum, "Suma de Arreglo", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel2.add(sumar);
		panel2.add(salir);
		this.setVisible(true);
	}
}
