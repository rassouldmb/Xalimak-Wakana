import java.awt.Cursor;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class Palette_outil extends JPanel{
	
	public ButtonGroup group1;
	public JRadioButton opinceau;
	public JRadioButton opcrayon;
	public JRadioButton opeinture;
	public JRadioButton opgomme;

	public ButtonGroup group2;
	public JRadioButton opvert;
	public JRadioButton opjaune;
	public JRadioButton oprouge;
	public JRadioButton opbleu;
	public JRadioButton opnoir;
	public JRadioButton opmarron;
	public JRadioButton opgris;
	
	public ButtonGroup group3;
	public JRadioButton rectangle;
	public JRadioButton cercle;
	public JRadioButton polygone;
	public JRadioButton carre;
	public JRadioButton ligne;
	public JRadioButton normal;
	
	public Palette_outil(){
		// Debut de la Gestion du panneau outils
		super();
		group1 = new ButtonGroup();
		opinceau = new JRadioButton("Pinceau");
		opcrayon = new JRadioButton("Crayon");
		opeinture = new JRadioButton("Peinture");
		opgomme = new JRadioButton("Gomme");
		opcrayon.setIcon(new ImageIcon("pencil.png"));
		opgomme.setIcon(new ImageIcon("eraser.png"));
		opinceau.setIcon(new ImageIcon("paint-brush.png"));
		opeinture.setIcon(new ImageIcon("paint-bucket.png"));
		group1.add(opinceau);
		group1.add(opcrayon);
		group1.add(opeinture);
		group1.add(opgomme);
		
		Box westboxa = Box.createVerticalBox();
		JPanel pan1 = new JPanel();
		pan1.setBorder(BorderFactory.createTitledBorder("Palette des Outils"));
		pan1.setLayout(new GridLayout(2,2));
		pan1.add(opcrayon);
		pan1.add(opinceau);
		pan1.add(opeinture);
		pan1.add(opgomme);
		westboxa.add(pan1);
		
					// Fin de la Gestion du panneau outils
		
					// Debut de la Gestion du panneau couleur

		group2 = new ButtonGroup();
		opvert = new JRadioButton("Vert");
		opjaune = new JRadioButton("Jaune");
		oprouge = new JRadioButton("Rouge");
		opbleu = new JRadioButton("Bleu");
		opnoir = new JRadioButton("Noir");
		opmarron = new JRadioButton("Marron");
		opgris = new JRadioButton("Gris");
		opvert.setIcon(new ImageIcon("vert.png"));
		opjaune.setIcon(new ImageIcon("jaune.png"));
		oprouge.setIcon(new ImageIcon("rouge.png"));
		opbleu.setIcon(new ImageIcon("bleu.png"));
		opnoir.setIcon(new ImageIcon("noir.png"));
		opmarron.setIcon(new ImageIcon("marron.png"));
		opgris.setIcon(new ImageIcon("gris.png"));
		group2.add(opvert);
		group2.add(opjaune);
		group2.add(oprouge);
		group2.add(opbleu);
		group2.add(opnoir);
		group2.add(opmarron);
		group2.add(opgris);
		
		Box westboxb = Box.createVerticalBox();
		JPanel pan2 = new JPanel();
		pan2.setBorder(BorderFactory.createTitledBorder("Palette des Couleurs"));
		pan2.setLayout(new GridLayout(3,2));
		pan2.add(opvert);
		pan2.add(opjaune);
		pan2.add(oprouge);
		pan2.add(opbleu);
		pan2.add(opnoir);
		pan2.add(opmarron);
		pan2.add(opgris);
		westboxb.add(pan2);
		
				// Fin de la Gestion du panneau couleur
		
					// Debut de la Gestion du panneau forme
		
		group3 = new ButtonGroup();
		cercle = new JRadioButton("Cercle");
		rectangle = new JRadioButton("Rectangle");
		carre = new JRadioButton("Carre");
		ligne = new JRadioButton("Ligne");
		polygone = new JRadioButton("Polygone");
		normal = new JRadioButton("Normal");
		cercle.setIcon(new ImageIcon("oval.png"));
		rectangle.setIcon(new ImageIcon("rectangle.png"));
		carre.setIcon(new ImageIcon("rectangle.png"));
		ligne.setIcon(new ImageIcon("line-tool.png"));
		polygone.setIcon(new ImageIcon("polygon.png"));
		normal.setIcon(new ImageIcon("line.png"));
		group3.add(cercle);
		group3.add(rectangle);
		group3.add(carre);
		group3.add(ligne);
		group3.add(polygone);
		group3.add(normal);
		
		Box westboxc = Box.createVerticalBox();
		JPanel pan3 = new JPanel();
		pan3.setBorder(BorderFactory.createTitledBorder("Formes"));
		pan3.setLayout(new GridLayout(3,2));
		pan3.add(cercle);
		pan3.add(rectangle);
		pan3.add(carre);
		pan3.add(polygone);
		pan3.add(ligne);
		pan3.add(normal);
		westboxc.add(pan3);	
							// Fin de la Gestion du panneau forme
		
		Box westbox = Box.createVerticalBox();
		westbox.add(westboxa);
		westbox.add(westboxb);
		//westbox.add(westboxc);
		JPanel pan = new JPanel();
		pan.add(new JLabel(new ImageIcon("logo.png")));
		westbox.add(pan);
		Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
		Cursor c2 = new Cursor(Cursor.DEFAULT_CURSOR);
		
		opinceau.setCursor(c1);
		opcrayon.setCursor(c1);
		opgomme.setCursor(c1);
		opeinture.setCursor(c1);
		
		opvert.setCursor(c1);
		opjaune.setCursor(c1);
		oprouge.setCursor(c1);
		opbleu.setCursor(c1);
		opnoir.setCursor(c1);
		opmarron.setCursor(c1);
		opgris.setCursor(c1);
		
		cercle.setCursor(c1);
		rectangle.setCursor(c1);
		carre.setCursor(c1);
		polygone.setCursor(c1);
		ligne.setCursor(c1);
		normal.setCursor(c1);
		
		this.add(westbox);
		this.setBorder(BorderFactory.createTitledBorder(""));
		this.setCursor(c2);
	}
}
