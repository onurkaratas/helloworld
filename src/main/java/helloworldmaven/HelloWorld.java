package helloworldmaven;

import javax.swing.*;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secim = JOptionPane.showConfirmDialog(null, "Sy� tahmin oyunun �al��mas�n� istiyor musunuz");
		if (secim == JOptionPane.YES_OPTION)
		{
			
		int tahmn_sayisi = 50;

		
		String sayi = JOptionPane.showInputDialog("bir say� giriniz");
		int sayi1 = Integer.parseInt(sayi);
		do{
		if(tahmn_sayisi<sayi1)
		{
			JOptionPane.showMessageDialog(null, "girdi�iniz say�y� k���lt�n");
		}
			else{ 
			JOptionPane.showMessageDialog(null, "girdi�iniz say�y� b�y�lt�n ");
			}
		sayi = JOptionPane.showInputDialog("bir say� giriniz");
		sayi1  = Integer.parseInt(sayi);
	
		}
		while (tahmn_sayisi != sayi1);
	JOptionPane.showMessageDialog(null, "do�ru tahmin =" +tahmn_sayisi);
		}
		}
}
	
	


