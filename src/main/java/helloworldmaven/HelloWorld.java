package helloworldmaven;

import javax.swing.*;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secim = JOptionPane.showConfirmDialog(null, "Syý tahmin oyunun çalýþmasýný istiyor musunuz");
		if (secim == JOptionPane.YES_OPTION)
		{
			
		int tahmn_sayisi = 50;

		
		String sayi = JOptionPane.showInputDialog("bir sayý giriniz");
		int sayi1 = Integer.parseInt(sayi);
		do{
		if(tahmn_sayisi<sayi1)
		{
			JOptionPane.showMessageDialog(null, "girdiðiniz sayýyý küçültün");
		}
			else{ 
			JOptionPane.showMessageDialog(null, "girdiðiniz sayýyý büyültün ");
			}
		sayi = JOptionPane.showInputDialog("bir sayý giriniz");
		sayi1  = Integer.parseInt(sayi);
	
		}
		while (tahmn_sayisi != sayi1);
	JOptionPane.showMessageDialog(null, "doðru tahmin =" +tahmn_sayisi);
		}
		}
}
	
	


