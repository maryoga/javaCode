package basics;

import javax.swing.*;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean punto=false;
		
		int arroba=0;
		
		String mail=JOptionPane.showInputDialog("�nter your mail");
		
		for(int i=0; i < mail.length(); i++) {
			            
			if(mail.charAt(i) =='@') {
				
				arroba++;
				
			}
			
			if(mail.charAt(i) == '.') {
				
				punto=true;
			}
		}
            
	     if(arroba==1 && punto==true) {
	    	 
	    	 System.out.println("Es correcto");
	    	 
	     }else{
	    	 
	    	 System.out.println("No es correcto");
	    	 
	     }
	}

}
