package helloworldmaven;

import javax.swing.*;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(null, "program�n �al��mas�n� istiyor musunuz");
		int tahmn_sayisi = 50;

		JOptionPane.showMessageDialog(null,"Merhaba D�nya");
		String sayi = JOptionPane.showInputDialog("bir say� giriniz");
		int sayi1 = Integer.parseInt(sayi);
		JOptionPane.showMessageDialog(null, "girdi�iniz say� =  "  +sayi1);
	do{
		if(tahmn_sayisi<sayi1)
		{
			JOptionPane.showMessageDialog(null, "girdi�iniz say�y� k���lt�n");
		}
			else{ 
			JOptionPane.showMessageDialog(null, "girdi�iniz say�y� b�y�lt�n ");
			}
		sayi = JOptionPane.showInputDialog("bir say� giriniz");
		sayi1 = Integer.parseInt(sayi);
	}while (tahmn_sayisi != sayi1);
	JOptionPane.showMessageDialog(null, "do�ru tahmin" +tahmn_sayisi);
		}
	
	}


