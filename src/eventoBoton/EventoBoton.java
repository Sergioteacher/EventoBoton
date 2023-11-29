package eventoBoton;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * La clase pricipal de EventoBoton
 * @author Sergio Teacher
 *
 */
public class EventoBoton {

	private JFrame frmVentanaPrincipal;

	/**
	 * Launch the application.
	 * La  funcion estática que inicia el programa
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("Iniciando programa ...");
					EventoBoton window = new EventoBoton();
					window.frmVentanaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EventoBoton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentanaPrincipal = new JFrame();
		frmVentanaPrincipal.setTitle("Ventana Principal");
		frmVentanaPrincipal.setBounds(100, 100, 300, 140);
		frmVentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton bBoton = new JButton("Di algo !!!");
		bBoton.addActionListener(new ActionListener() {
			/**
			 * Implementación de la acción del botón
			 */
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Hola");
			}
		});
		bBoton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmVentanaPrincipal.getContentPane().add(bBoton, BorderLayout.CENTER);
	}

}
