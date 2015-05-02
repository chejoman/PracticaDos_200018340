import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class VentanaPrincipal extends JFrame {

	//declarando variables	 
		private JButton btn_estadisticas;
		private JButton btn_configuracion;
		private JButton btn_demostracion;
		private JButton btn_salir;
		private JLabel lbl_esta;
		private JLabel lbl_config;
		private JLabel lbl_demo;
		private JLabel lbl_sale;
		private JPanel pnl_panel;
	
	
		
		
		
		
	//creando la ventana principal
	
	public VentanaPrincipal(){ 
			
		super("Torres de Hanoi  v 1.0.0");
		this.setSize(670, 670);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		
		
		pnl_panel = new JPanel();
		pnl_panel.setBounds(45, 50, 580, 350);
		pnl_panel.setBackground(null);
		
		try{
			FileReader fr = new FileReader("/TorresHanoi/instrucciones.txt");
			
			
		}
		
		catch(IOException e){
			System.out.println("El error es " +e);
			
		}
		
		add(pnl_panel);
		
		/*JLabel otra = new JLabel("INSTRUCCIONES DEL JUEGO");
		otra.setLocation(55, 60);
		pnl_panel.add(otra);*/
		
		
			
			
		
	
	
		//creando boton para las estadisticas del juego
		btn_estadisticas = new JButton();		
		btn_estadisticas.setIcon(new ImageIcon(getClass().getResource("imagenes/estadisticas.png")));
		btn_estadisticas.setBounds(50, 450, 100, 100);
		add(btn_estadisticas);
		
		//creando boton de configuracion del juego		
		btn_configuracion = new JButton();		
		btn_configuracion.setIcon(new ImageIcon(getClass().getResource("imagenes/configuracion.png")));
		btn_configuracion.setBounds(200, 450, 100, 100);
		add(btn_configuracion);
		
		//creando boton juego nuevo
		btn_demostracion = new JButton();		
		btn_demostracion.setIcon(new ImageIcon(getClass().getResource("imagenes/torre.png")));
		btn_demostracion.setBounds(350, 450, 100, 100);
		add(btn_demostracion);
		
		//creando boton salir del juego
		btn_salir = new JButton();	
		btn_salir.setIcon(new ImageIcon(getClass().getResource("imagenes/salir.png")));
		btn_salir.setBounds(500, 450, 100, 100);
		add(btn_salir);
		
		//creando lblestadistica
		lbl_esta = new JLabel("Estadísticas");
		lbl_esta.setBounds(65, 560, 100, 30);
		add(lbl_esta);
		
		//creando lbl configuracion
		lbl_config = new JLabel("Configuración");
		lbl_config.setBounds(210, 560, 100, 30);
		lbl_config.setVisible(true);
		add(lbl_config);
		
		//creando lbl demo
		lbl_demo = new JLabel("Demostración");
		lbl_demo.setBounds(360, 560, 100, 30);
		add(lbl_demo);
		
		//creando lbl salir
		lbl_sale = new JLabel("Salir");
		lbl_sale.setBounds(535, 560, 100, 30);
		add(lbl_sale);
		
		//creando evento del boton
		btn_estadisticas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Estadisticas es = new Estadisticas();
				es.setLocationRelativeTo(null);
				
			}
		});
		
		//creando evento del boton configuracion
		btn_configuracion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Configuracion config = new Configuracion();
				config.setLocationRelativeTo(null);
				
				
			}
		});
		
		//creando evento del boton demostracion
		btn_demostracion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Demos dem = new Demos();
				dem.setLocationRelativeTo(null);
						
						
					}
				});
		
		
		//creando Accion al boton salir
				btn_salir.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						
							System.exit(0);
					}
				});
		
		
				
	}
	
	
	
	
	
	
	
	
		 
		 
		 		 
		 
	 
	
}
