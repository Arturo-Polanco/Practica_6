package pract6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * ARTURO POLANCO CARRILLO
 * 01200720
 * 3/5/14
 * Practica4
 */
public class ControlPanel {

	private JFrame mainFrame;
	private JPanel controlPanel;
	private JPanel controlPanel2;
	private JPanel controlPanel3;
	private JPanel controlPanel4;

	public ControlPanel() {
		mainFrame = new JFrame( "Practica 4 -- ARTURO POLANCO CARRILLO --" );
		mainFrame.setSize( 400, 300 );
		mainFrame.setLayout( new GridLayout( 4, 0 ) );
		mainFrame.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent windowEvent ) {
				System.exit( 0 );
			}
		} );

		controlPanel = new JPanel();
		controlPanel2 = new JPanel();
		controlPanel3 = new JPanel();
		controlPanel4 = new JPanel();
		controlPanel.setLayout( new FlowLayout() );
		controlPanel.setBackground( Color.DARK_GRAY );
		controlPanel2.setLayout( new FlowLayout() );
		controlPanel2.setBackground( Color.DARK_GRAY );
		controlPanel4.setLayout( new FlowLayout() );
		controlPanel4.setBackground( Color.DARK_GRAY );

		controlPanel3.setLayout( new GridLayout( 3, 1 ) );
		controlPanel3.setBackground( Color.DARK_GRAY );
		mainFrame.add( controlPanel );
		mainFrame.add( controlPanel2 );
		mainFrame.add( controlPanel4 );
		mainFrame.add( controlPanel3 );
		mainFrame.setVisible( true );
	}

	public void createButtonPanel() {

		JButton cilindroButton = new JButton( "Cilindro" );
		JButton numeroComplejoButton = new JButton( "Numero Complejo" );
		JButton salirButton = new JButton( "Salir" );
		final JTextField input = new JTextField( 5 );
		final JTextField input2 = new JTextField( 5 );
		final JLabel inputField1 = new JLabel( "<HTML><B><H4>Valor 1" );
		final JLabel inputField2 = new JLabel( "<HTML><B><H4>Valor 2" );
		inputField1.setForeground( Color.WHITE );
		inputField2.setForeground( Color.WHITE );
		final JTextField input3 = new JTextField( 5 );
		final JTextField input4 = new JTextField( 5 );
		final JLabel inputField3 = new JLabel( "<HTML><B><H4>Valor 3" );
		final JLabel inputField4 = new JLabel( "<HTML><B><H4>Valor 4" );
		inputField3.setForeground( Color.WHITE );
		inputField4.setForeground( Color.WHITE );
		final JLabel valor = new JLabel();
		final JLabel valor1 = new JLabel();
		final JLabel valor2 = new JLabel();
		valor.setForeground( Color.WHITE );
		valor1.setForeground( Color.WHITE );
		valor2.setForeground( Color.WHITE );

		cilindroButton.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				Cilindro cilindro, cilindro2;
				Scanner scan1 = new Scanner( input.getText() );
				Scanner scan2 = new Scanner( input2.getText() );
				Scanner scan3 = new Scanner( input3.getText() );
				Scanner scan4 = new Scanner( input4.getText() );

				if ( scan1.hasNextFloat() && scan2.hasNextFloat() ) {
					cilindro = new Cilindro( scan1.nextFloat(), scan2.nextFloat() );
				}
				else {
					cilindro = new Cilindro();
				}

				if ( scan3.hasNextFloat() && scan4.hasNextFloat() ) {
					cilindro2 = new Cilindro( scan3.nextFloat(), scan4.nextFloat() );
				}
				else {
					cilindro2 = new Cilindro( cilindro );
				}
				valor.setText( "<html>El Area de la Base es:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <B>A =</B> " + cilindro.getAreaBase() + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>A2 =</B> " + cilindro2.getAreaBase() );
				JOptionPane.showMessageDialog( null, "El volumen del Cilindro 1 es:\n " + cilindro.getVolumen(), "Volumen del Cilindro 1", JOptionPane.INFORMATION_MESSAGE );
				valor1.setText( "<html>El volumen del Cilindro es:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <B>V = </B>" + cilindro.getVolumen() + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <B>V2 = </B>" + cilindro2.getVolumen() );
				JOptionPane.showMessageDialog( null, "El volumen del Cilindro 2 es:\n " + cilindro2.getVolumen(), "Volumen del Cilindro 2", JOptionPane.INFORMATION_MESSAGE );
				valor2.setText( "<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Comparando...&nbsp;&nbsp;&nbsp;<font color=red><B>" + cilindro.determinarCilindroMasGrande( cilindro2 ) );
				JOptionPane.showMessageDialog( null, "\t\t     Comparando: \n" + cilindro.determinarCilindroMasGrande( cilindro2 ), "Comparacion de Cilindros", JOptionPane.INFORMATION_MESSAGE );
			}
		} );

		numeroComplejoButton.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				NumeroComplejo numeroComplejo, numeroComplejo2;
				Scanner scan1 = new Scanner( input.getText() );
				Scanner scan2 = new Scanner( input2.getText() );
				Scanner scan3 = new Scanner( input3.getText() );
				Scanner scan4 = new Scanner( input4.getText() );

				if ( scan1.hasNextFloat() && scan2.hasNextFloat() ) {
					numeroComplejo = new NumeroComplejo( scan1.nextFloat(), scan2.nextFloat() );
				}
				else {
					numeroComplejo = new NumeroComplejo();
				}

				if ( scan3.hasNextFloat() && scan4.hasNextFloat() ) {
					numeroComplejo2 = new NumeroComplejo( scan3.nextFloat(), scan4.nextFloat() );
				}
				else {
					numeroComplejo2 = new NumeroComplejo( numeroComplejo );
				}
				numeroComplejo.multiplicarNumerosComplejos( numeroComplejo2 );
				numeroComplejo.sumarNumerosComplejos( numeroComplejo2 );
				valor.setText( "El valor del numero complejo en Polar es:             " );
				valor1.setText( "\t     r = " + numeroComplejo.getPolarRadius() + "\t\t    ,   \t\t  \u03b8 = " + numeroComplejo.getPolarAngle() + "\u00b0" );
				valor2.setText( "\t   r2 = " + numeroComplejo2.getPolarRadius() + "\t\t    ,   \t\t\u03b82 = " + numeroComplejo2.getPolarAngle() + "\u00b0" );
				JOptionPane.showMessageDialog( null, "El valor del numero complejo en Polar es:\n r = " + numeroComplejo.getPolarRadius() + "  ,  \u03b8 = " + numeroComplejo.getPolarAngle() + "\u00b0", "Valores Polares", JOptionPane.INFORMATION_MESSAGE );
				JOptionPane.showMessageDialog( null, "El valor del 2o numero complejo en Polar es:\n r = " + numeroComplejo2.getPolarRadius() + "  ,  \u03b8 = " + numeroComplejo2.getPolarAngle() + "\u00b0", "Valores Polares", JOptionPane.INFORMATION_MESSAGE );
				JOptionPane.showMessageDialog( null, "El valor de la suma es:\n" + numeroComplejo.getStringNumeroComplejo( numeroComplejo.sumarNumerosComplejos( numeroComplejo2 ) ), "Suma de Numeros Complejos", JOptionPane.INFORMATION_MESSAGE );
				JOptionPane.showMessageDialog( null, "Multiplicacion:\n" + numeroComplejo.getStringNumeroComplejo( numeroComplejo.multiplicarNumerosComplejos( numeroComplejo2 ) ), "Producto de Numeros Complejos", JOptionPane.INFORMATION_MESSAGE );
			}
		} );

		salirButton.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				System.exit( 0 );
			}
		} );

		controlPanel.add( cilindroButton );
		controlPanel.add( numeroComplejoButton );
		controlPanel.add( salirButton );

		controlPanel2.add( inputField1 );
		controlPanel2.add( input );
		controlPanel2.add( input2 );
		controlPanel2.add( inputField2 );

		controlPanel4.add( inputField3 );
		controlPanel4.add( input3 );
		controlPanel4.add( input4 );
		controlPanel4.add( inputField4 );

		controlPanel3.add( valor );
		controlPanel3.add( valor1 );
		controlPanel3.add( valor2 );

		mainFrame.setVisible( true );
	}
}