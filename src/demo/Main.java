package demo;

import heritage.Moto;
import poo.Client;

public class Main {
	public static void main(String[] args) {
		Client client = new Client("Test","mot de passe");
		client.setPrenom("XEFi");
		System.out.println( client.getNom()+ " "+client.getPwd());
		
		
		Moto yamaha = new Moto();
		System.out.println(yamaha.rouler());
	}
		
}
