package ecosysteme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import affichageGraphique.ZDialog;

public class JPanelPersonnalise extends JPanel {
	private int x;
	private int y;

	ImageIcon bouquetin = new ImageIcon("ecosysteme/ressources/bouquetin.png");
	ImageIcon chacal = new ImageIcon("ecosysteme/ressources/chacal.png");
	ImageIcon cheval = new ImageIcon("ecosysteme/ressources/cheval.png");
	ImageIcon crocodile = new ImageIcon("ecosysteme/ressources/crocodile.png");
	ImageIcon girafe = new ImageIcon("ecosysteme/ressources/girafe.png");
	ImageIcon hyene = new ImageIcon("ecosysteme/ressources/hyene.png");
	ImageIcon loup = new ImageIcon("ecosysteme/ressources/loup.png");
	ImageIcon mammouth = new ImageIcon("ecosysteme/ressources/mammouth.png");
	ImageIcon mouche = new ImageIcon("ecosysteme/ressources/mouche.png");
	ImageIcon ours = new ImageIcon("ecosysteme/ressources/ours.png");
	ImageIcon renard = new ImageIcon("ecosysteme/ressources/renard.png");
	ImageIcon singe = new ImageIcon("ecosysteme/ressources/singe.png");
	ImageIcon tigre = new ImageIcon("ecosysteme/ressources/tigre.png");
	ImageIcon vautour = new ImageIcon("ecosysteme/ressources/vautour.png");
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		int tailleCaseEnPixel = 1200 / ZDialog.getTaille();
		if(Grille.getCase(x, y).getEstVide() == false) {
			ImageIcon bouquetin = new ImageIcon("ecosysteme/ressources/bouquetin.png");
			Image bouquetinImaged = bouquetin.getImage();
			g2d.drawImage(bouquetinImaged, 0, 0, tailleCaseEnPixel, tailleCaseEnPixel, null);
		}
	}

}
