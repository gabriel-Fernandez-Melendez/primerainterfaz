package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana {

	private JFrame frame;
	//esto hace falta declararlo como una instancia (con el new )
	public JPanel panelcentro = new JPanel();
	
	public JLabel texto_1 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		JPanel panelnorte = new JPanel();
		frame.getContentPane().add(panelnorte, BorderLayout.NORTH);
		
		JButton botonnorte_1 = new JButton("Mostrar form botones");
		panelcentro.setVisible(false);
		botonnorte_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelcentro.setVisible(true);
			   panelcentro.removeAll();
			   panelcentro.add(texto_1);
			   panelcentro.repaint();
			   panelcentro.revalidate();
			}
		});
		panelnorte.add(botonnorte_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panelnorte.add(btnNewButton_1);
		
		//removeall() y repaint() son posibles metodos que se pueden  usar para que no sea visible el 
		
		frame.getContentPane().add(panelcentro, BorderLayout.CENTER);
		panelcentro.setLayout(new CardLayout(0, 0));
		
		JPanel panel_centro_botones = new JPanel();
		panelcentro.add(panel_centro_botones, "name_2298343432700");
		panel_centro_botones.setVisible(false);
		
		JButton boton_centro_1 = new JButton("New button");
		panel_centro_botones.add(boton_centro_1);
		
		JButton boton_centro_2 = new JButton("New button");
		panel_centro_botones.add(boton_centro_2);
		
		JPanel panel_centro_texto = new JPanel();
		panelcentro.add(panel_centro_texto, "name_2302225057300");
		
		 texto_1 = new JLabel("Soy el texto del form texto");
		panel_centro_texto.add(texto_1);
		
	
	}

}
