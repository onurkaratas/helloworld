package helloworldmaven;

import javax.swing.*;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(null, "programýn çalýþmasýný istiyor musunuz");
		int tahmn_sayisi = 50;

		JOptionPane.showMessageDialog(null,"Merhaba Dünya");
		String sayi = JOptionPane.showInputDialog("bir sayý giriniz");
		int sayi1 = Integer.parseInt(sayi);
		JOptionPane.showMessageDialog(null, "girdiðiniz sayý =  "  +sayi1);
	do{
		if(tahmn_sayisi<sayi1)
		{
			JOptionPane.showMessageDialog(null, "girdiðiniz sayýyý küçültün");
		}
			else{ 
			JOptionPane.showMessageDialog(null, "girdiðiniz sayýyý büyültün ");
			}
		sayi = JOptionPane.showInputDialog("bir sayý giriniz");
		sayi1 = Integer.parseInt(sayi);
	}while (tahmn_sayisi != sayi1);
	JOptionPane.showMessageDialog(null, "doðru tahmin" +tahmn_sayisi);
		}
	
	}


