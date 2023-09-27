package gui;

import semana_06.Arreglo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ejemplo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblNumero;
	private JTextField txtNumero;
	private JButton btnAdicionar;
	private JButton btnEliminarAlFinal;
	private JButton btnEliminarTodo;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo() {
		setTitle("Ejemplo - Semana_06");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNumero = new JLabel("N�mero");
		lblNumero.setBounds(10, 11, 50, 23);
		contentPane.add(lblNumero);

		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtNumero.setBounds(66, 11, 50, 23);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(140, 11, 124, 23);
		contentPane.add(btnAdicionar);

		btnEliminarAlFinal = new JButton("Eliminar al final");
		btnEliminarAlFinal.addActionListener(this);
		btnEliminarAlFinal.setBounds(270, 11, 124, 23);
		contentPane.add(btnEliminarAlFinal);

		btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(400, 11, 124, 23);
		contentPane.add(btnEliminarTodo);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 515, 400);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	
	//  Declaraci�n global
	Arreglo a = new Arreglo();

	/**
				.----.----.----.----.----.----.----.----.----.----.
		n  ==>  |    |    |    |    |    |    |    |    |    |    |   
				'----'----'----'----'----'----'----'----'----'----'
		  		   0    1    2    3    4    5    6    7    8    9
                indice
	 */

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminarTodo) {
			actionPerformedBtnEliminarTodo(arg0);
		}
		if (arg0.getSource() == btnEliminarAlFinal) {
			actionPerformedBtnEliminarAlFinal(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		limpieza();
	}
	/**
	 *  Adiciona un n�mero en el arreglo
	 */	
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		try {
			a.adicionar(leerNumero());
			listar();
		}
		catch (Exception e) {
			mensaje("error de ingreso");
		}
	}
	/**
	 *  Invoca al m�todo eliminarAlFinal para eliminar
	 *  l�gicamente el �ltimo dato ingresado
	 */
	protected void actionPerformedBtnEliminarAlFinal(ActionEvent arg0) {
		if (a.tamanio() > 0) {
			a.eliminarAlFinal();
			listar();
		}
		else
			mensaje("el Arreglo est� vac�o");
	}
	/**
	 *  Invoca al m�todo eliminarTodo para eliminar
	 *  l�gicamente todos los datos ingresados
	 */
	protected void actionPerformedBtnEliminarTodo(ActionEvent arg0) {
		if (a.tamanio() > 0) {
			a.eliminarTodo();
			txtS.setText("");
		}
		else
			mensaje("el Arreglo est� vac�o");
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtNumero.setText("");
		txtNumero.requestFocus();
	}
	void listar() {
		txtS.setText("");
		for (int i=0; i<a.tamanio(); i++)
			imprimir("n[" + i + "] : " + a.obtener(i));
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//  M�todos que retornan valor (sin par�metros)
	int leerNumero()  {
		return Integer.parseInt(txtNumero.getText().trim());
	}
	
}