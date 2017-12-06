package org.itstep.service;

import java.io.FileWriter;
import java.io.IOException;

public class CreateOfAccounts {
	private final static String  filePath = "D:\\test2\\CreateAccounts.csv";
	
	public void saveAccount(String NumberAccound ) {	
		if(NumberAccound.isEmpty()) {
			return;
	}
		int numbers = Integer.parseInt(NumberAccound);
		for(int i =1 ; i<=numbers;i++) {
		String[] domeins = {"gmail.com", "mail.ru" , "ukr.net.ua"};
		String password = "psdwd" + getRandomNumber(100000, 999999);
		String email =  getRandomNumber(1000, 9999) + "@" + getRandomDomein(domeins);
		String line =  email + ", " + password   + ";\n" ;
		  appendInfoToFile(line,NumberAccound);
		}
	}
	
	
	private void appendInfoToFile(String line,String NumberAccound) {
		FileWriter writer = null;

		try {
			writer = new FileWriter(filePath , true);
			writer.append(line);
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		}
	
	private int getRandomNumber(int min, int max) {
		int rndNumber =  min + ((int) (Math.random()*(max-min)) + 1 );
		return rndNumber;
	}
	
	private String getRandomDomein(String[] domeins) {
		 int rndIndex = (int)(Math.random()*domeins.length);
		 String rndStr = domeins[rndIndex];
		 return rndStr;
	}
	
}
