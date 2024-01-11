package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class Login extends JPanel {

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		setBounds(20, 46, 564, 234);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 569, 165);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAGE DE LOGIN");
		lblNewLabel.setBounds(125, 36, 365, 49);
		panel.add(lblNewLabel);

	}
}
