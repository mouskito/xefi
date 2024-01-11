package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Acceuil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil frame = new Acceuil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Acceuil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 560, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 560, 35);
		panel.add(menuBar);
		
		JMenu home = new JMenu("Home");
		JPanel panel_1 = new JPanel();
		JTextPane txtpnContraryToPopular = new JTextPane();
		
		//Quand je clique sur Home
		home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(txtpnContraryToPopular);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		menuBar.add(home);
		
		JMenu mnNewMenu_1 = new JMenu("Login");
		//Quand je clique sur Login
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(new Login());
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu = new JMenu("Register");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(new Register());
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		menuBar.add(mnNewMenu);
		
		panel_1.setBounds(20, 46, 564, 325);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtpnContraryToPopular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnContraryToPopular.setText("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\r\n\r\nThe standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham");
		txtpnContraryToPopular.setBounds(10, 11, 531, 310);
		panel_1.add(txtpnContraryToPopular);
	}
}
