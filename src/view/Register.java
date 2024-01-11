package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.UserDao;
import model.User;

public class Register extends JPanel {
	private JTextField prenom;
	private JTextField nom;
	private JTextField mail;
	private JPasswordField pwd;

	/**
	 * Create the panel.
	 */
	public Register() {
		setLayout(null);
		setBounds(20, 46, 564, 234);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(10, 11, 554, 223);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrez votre prénom");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel.setBounds(28, 39, 188, 25);
		panel.add(lblNewLabel);
		
		prenom = new JTextField();
		prenom.setBounds(255, 43, 228, 20);
		panel.add(prenom);
		prenom.setColumns(10);
		
		JLabel lNom = new JLabel("Entrez votre nom");
		lNom.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lNom.setBounds(28, 85, 188, 25);
		panel.add(lNom);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(255, 89, 228, 20);
		panel.add(nom);
		
		JLabel lblEntrezVotreEmail = new JLabel("Entrez votre email");
		lblEntrezVotreEmail.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblEntrezVotreEmail.setBounds(28, 127, 188, 25);
		panel.add(lblEntrezVotreEmail);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(255, 131, 228, 20);
		panel.add(mail);
		
		JLabel lblEntrezVotreMot = new JLabel("Entrez votre mot de passe");
		lblEntrezVotreMot.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblEntrezVotreMot.setBounds(28, 163, 188, 25);
		panel.add(lblEntrezVotreMot);
		
		JButton btnNewButton = new JButton("S'inscrire");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = mail.getText();
				String prenomSaisi = prenom.getText();
				String nomSaisi = nom.getText();
				String pwdSaisi = String.valueOf(pwd.getPassword());
				
				UserDao userDao = new UserDao();
				
				
				User user = new User(prenomSaisi,nomSaisi,email,pwdSaisi);
				System.out.println(email);
				//if (email == null || email == "") {
				String regex = "^[A-Za-z0-9][A-Za-z0-9.-]+[A-Za-z0-9][@][A-Za-z0-9][A-Za-z0-9.-]+[A-Za-z0-9][.][A-Za-z0-9]{2,3}$";
				Pattern patternAVerif = Pattern.compile(regex);
				
				/*
				 * Check si le regex(Ligne 148) a le mm FORMAT que le mail saisi par le user 
				 * Exmple: format@mail.com --- chaine@chaine.com/fr
				 */
				Matcher matcher = patternAVerif.matcher(email);
				
				/*
				 * Check le format du mail saisi 
				 */
				// Si le format match avec chaine@chaine.fr/com
				if (matcher.matches()) {
				//} else {
					/*
					 * Verification si le mail exite deja
					 */
					if (userDao.isExist(email)) {
						JOptionPane.showMessageDialog(null,"Oups ! \n Mail existe deja","Inscription",JOptionPane.ERROR_MESSAGE);	
					} 
					
					else {
						/*
						 * Si le mail n'existe pas dans la BDD
						 */
						if (userDao.create(user)) {
							JOptionPane.showMessageDialog(null,"Bravo " +user.getPrenom()+ " \n"
									+ "ton compte a été bien créé !" ,"Inscription",JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null,"Oups ! \n Compte pas créer","Inscription",JOptionPane.ERROR_MESSAGE);
						}
					}
				}else {
					JOptionPane.showMessageDialog(null,"Oups ! \n Format non valide","Inscription",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton.setBounds(164, 200, 188, 23);
		panel.add(btnNewButton);
		
		pwd = new JPasswordField();
		pwd.setBounds(265, 167, 218, 20);
		panel.add(pwd);

	}
}
