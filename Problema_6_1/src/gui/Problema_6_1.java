package gui;

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

public class Problema_6_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JButton btnAdicionar;
	private JButton btnEliminarAlFinal;
	private JButton btnEliminarTodo;
	private JButton btnIncrementarPrimeraEdadAdulta;
	private JButton btnRemplazarPrimeraEdadAdulta;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_6_1 frame = new Problema_6_1();
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
	public Problema_6_1() {
		setTitle("Problema_6_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 10, 46, 23);
		contentPane.add(lblEdad);

		txtEdad = new JTextField();
		txtEdad.setBounds(66, 10, 86, 23);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(300, 40, 225, 23);
		contentPane.add(btnAdicionar);

		btnEliminarAlFinal = new JButton("Eliminar al final");
		btnEliminarAlFinal.addActionListener(this);
		btnEliminarAlFinal.setBounds(300, 70, 225, 23);
		contentPane.add(btnEliminarAlFinal);

		btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(300, 100, 225, 23);
		contentPane.add(btnEliminarTodo);
		
		btnIncrementarPrimeraEdadAdulta = new JButton("Incrementar primera edad adulta");
		btnIncrementarPrimeraEdadAdulta.addActionListener(this);
		btnIncrementarPrimeraEdadAdulta.setBounds(300, 130, 225, 23);
		contentPane.add(btnIncrementarPrimeraEdadAdulta);

		btnRemplazarPrimeraEdadAdulta = new JButton("Remplazar primera edad adulta");
		btnRemplazarPrimeraEdadAdulta.addActionListener(this);
		btnRemplazarPrimeraEdadAdulta.setBounds(300, 160, 225, 23);
		contentPane.add(btnRemplazarPrimeraEdadAdulta);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 280, 412);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRemplazarPrimeraEdadAdulta) {
			actionPerformedBtnRemplazarPrimeraEdadAdulta(arg0);
		}
		if (arg0.getSource() == btnIncrementarPrimeraEdadAdulta) {
			actionPerformedBtnIncrementarPrimeraEdadAdulta(arg0);
		}
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

	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		
	}
	protected void actionPerformedBtnEliminarAlFinal(ActionEvent arg0) {
		
	}
	protected void actionPerformedBtnEliminarTodo(ActionEvent arg0) {
		
	}
	protected void actionPerformedBtnIncrementarPrimeraEdadAdulta(ActionEvent arg0) {
		
	}
	protected void actionPerformedBtnRemplazarPrimeraEdadAdulta(ActionEvent arg0) {
		
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtEdad.setText("");
		txtEdad.requestFocus();
	}
	void listar() {

	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//  M�todos que retornan valor (sin par�metros)
	int leerEdad()  {
		return Integer.parseInt(txtEdad.getText().trim());
	}
	
}