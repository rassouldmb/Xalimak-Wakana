import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


@SuppressWarnings("serial")
public class Menu_dessin extends JMenuBar{
	public JLabel menulabel;
	public JMenu apropos;
	
	public JMenu fichier;
	public JMenuItem nouveau;
	public JMenuItem ouvrir;
	public JMenuItem save;
	public JMenuItem quit;
	
	public JMenu outil;
	public JMenuItem crayon;
	public JMenuItem gomme;
	public JMenuItem peinture;
	public JMenuItem pinceau;
	
	public JMenu couleur;
	public JMenuItem vert;
	public JMenuItem jaune;
	public JMenuItem rouge;
	public JMenuItem bleu;	
	public JMenuItem noir;
	public JMenuItem marron;	
	public JMenuItem gris;
	
	public JMenu oforme;
	public JMenuItem orectangle;
	public JMenuItem ocercle;
	public JMenuItem ocarre;
	public JMenuItem oligne;	
	public JMenuItem opolygone;
	public JMenuItem onormal;
	
	public Menu_dessin(){
		super();
		menulabel = new JLabel(new ImageIcon("logo1.png"));
		fichier = new JMenu("Fichier");
		nouveau = new JMenuItem("Nouveau");
		ouvrir = new JMenuItem("Ouvrir");
		save = new JMenuItem("Enregistrer");
		quit = new JMenuItem("Quitter");
		//nouveau.setIcon(new ImageIcon("nouveau.png"));
		ouvrir.setIcon(new ImageIcon("creer.png"));
		save.setIcon(new ImageIcon("icon-save.png"));
		//quit.setIcon(new ImageIcon("quit.png"));
		fichier.add(nouveau);
		fichier.add(ouvrir);
		fichier.add(save);
		fichier.add(quit);
		
		apropos = new JMenu("A Propos");
		
		outil = new JMenu("Outils");
		crayon = new JMenuItem("Crayon");
		gomme = new JMenuItem("Gomme");
		pinceau = new JMenuItem("Pinceau");
		peinture = new JMenuItem("Peinture");
		crayon.setIcon(new ImageIcon("pencil.png"));
		gomme.setIcon(new ImageIcon("eraser.png"));
		pinceau.setIcon(new ImageIcon("paint-brush.png"));
		peinture.setIcon(new ImageIcon("paint-bucket.png"));
		outil.add(crayon);
		outil.add(gomme);
		outil.add(pinceau);
		outil.add(peinture);
		
		couleur = new JMenu("Couleurs");
		vert = new JMenuItem("Vert");
		jaune = new JMenuItem("Jaune");
		rouge = new JMenuItem("Rouge");
		bleu = new JMenuItem("Bleu");
		noir = new JMenuItem("Noir");
		marron = new JMenuItem("Marron");
		gris = new JMenuItem("Gris");
		vert.setIcon(new ImageIcon("vert.png"));
		jaune.setIcon(new ImageIcon("jaune.png"));
		rouge.setIcon(new ImageIcon("rouge.png"));
		bleu.setIcon(new ImageIcon("bleu.png"));
		noir.setIcon(new ImageIcon("noir.png"));
		marron.setIcon(new ImageIcon("marron.png"));
		gris.setIcon(new ImageIcon("gris.png"));
		couleur.add(vert);
		couleur.add(jaune);
		couleur.add(rouge);
		couleur.add(bleu);
		couleur.add(noir);
		couleur.add(marron);
		couleur.add(gris);
		
		oforme = new JMenu("Formes");
		ocercle = new JMenuItem("Cercle");
		orectangle = new JMenuItem("Rectangle");
		ocarre = new JMenuItem("Carre");
		oligne = new JMenuItem("Ligne");
		opolygone = new JMenuItem("Polygone");
		onormal = new JMenuItem("Normal");
		ocercle.setIcon(new ImageIcon("oval.png"));
		orectangle.setIcon(new ImageIcon("rectangle.png"));
		ocarre.setIcon(new ImageIcon("rectangle.png"));
		oligne.setIcon(new ImageIcon("line-tool.png"));
		opolygone.setIcon(new ImageIcon("polygon.png"));
		onormal.setIcon(new ImageIcon("line.png"));
		oforme.add(ocercle);
		oforme.add(orectangle);
		oforme.add(ocarre);
		oforme.add(oligne);
		oforme.add(opolygone);
		oforme.add(onormal);
		
		Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
		Cursor c2 = new Cursor(Cursor.DEFAULT_CURSOR);
		
		pinceau.setCursor(c1);
		crayon.setCursor(c1);
		gomme.setCursor(c1);
		peinture.setCursor(c1);
		
		vert.setCursor(c1);
		jaune.setCursor(c1);
		rouge.setCursor(c1);
		bleu.setCursor(c1);
		noir.setCursor(c1);
	    marron.setCursor(c1);
		gris.setCursor(c1);
		
		ocercle.setCursor(c1);
		orectangle.setCursor(c1);
		ocarre.setCursor(c1);
		oligne.setCursor(c1);
		opolygone.setCursor(c1);
	    onormal.setCursor(c1);
	    
	    menulabel.setCursor(c1);
		
		this.setCursor(c2);
		this.add(menulabel);
		this.add(fichier);
		this.add(apropos);
		this.add(outil);
		this.add(couleur);
		//this.add(oforme);
	}
}
