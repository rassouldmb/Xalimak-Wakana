import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.*;

@SuppressWarnings("serial")
public class Dessin extends JFrame implements ActionListener, MouseMotionListener {
	
							// Attributes
	
	public Menu_dessin menubar;
	public final JPanel drawpan;
	public Palette_outil outilpan;
	public Sauvegarde save;
	public Toolkit tk = Toolkit.getDefaultToolkit();
	public Cursor cr;
	public int outilselect = 1;
	public int colorselect = 4;
	public int formeselect = 0;
	
	public Dessin(String string){
		super(string);
						// Ajout de Nimbus sur l'interface
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
	    } catch (ClassNotFoundException ex) {
	    	java.util.logging.Logger.getLogger(Dessin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	    	java.util.logging.Logger.getLogger(Dessin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	    	java.util.logging.Logger.getLogger(Dessin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    	java.util.logging.Logger.getLogger(Dessin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
		
					// Debut initialisation des attributs de la classe

		Container contenu = this.getContentPane();
		
		menubar = new Menu_dessin();
		drawpan = new JPanel();
		outilpan = new Palette_outil();
		JPanel pan = new JPanel();
		save = new Sauvegarde();
		
					// Fin initialisation des attributs de la classe
		
		Box drawbox = Box.createVerticalBox();
		drawbox.setBorder(BorderFactory.createLoweredBevelBorder());
		drawbox.add(drawpan);
		drawpan.setBackground(Color.WHITE);
		
					// Bas de l'interface
		
		pan.setLayout(new FlowLayout());
		pan.add(new JLabel("@ Copyright 2015 Khadim DIOP DIC2 Informatique DGI-ESP-UCAD Dakar"));
		pan.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		
					// BorderLayout sur le conteneur
		
		contenu.add(menubar, BorderLayout.NORTH);
		contenu.add(outilpan, BorderLayout.WEST);
		contenu.add(drawbox, BorderLayout.CENTER);
		contenu.add(pan, BorderLayout.SOUTH);
		
					// Ajout de l'event souris sur l'interface
		
		contenu.addMouseMotionListener(this);
		drawpan.addMouseMotionListener(this);
		
					// Ajout des ActionEvent sur les outils
		
		outilpan.opinceau.addActionListener(this);
		outilpan.opcrayon.addActionListener(this);
		outilpan.opgomme.addActionListener(this);
		outilpan.opeinture.addActionListener(this);
		
		outilpan.opvert.addActionListener(this);
		outilpan.opjaune.addActionListener(this);
		outilpan.oprouge.addActionListener(this);
		outilpan.opbleu.addActionListener(this);
		outilpan.opnoir.addActionListener(this);
		outilpan.opmarron.addActionListener(this);
		outilpan.opgris.addActionListener(this);
		
		menubar.pinceau.addActionListener(this);
		menubar.crayon.addActionListener(this);
		menubar.gomme.addActionListener(this);
		menubar.peinture.addActionListener(this);
		
		menubar.nouveau.addActionListener(this);
		menubar.ouvrir.addActionListener(this);
		menubar.save.addActionListener(this);
		menubar.quit.addActionListener(this);
		
		menubar.vert.addActionListener(this);
		menubar.jaune.addActionListener(this);
		menubar.rouge.addActionListener(this);
		menubar.bleu.addActionListener(this);
		menubar.noir.addActionListener(this);
		menubar.marron.addActionListener(this);
		menubar.gris.addActionListener(this);
		
	}
	
	   				// Fonction qui permet de dessiner
	/*
	public void paint(Graphics g, MouseEvent e, Color c, int x){
		g.setColor(c);
		for(int i=0; i<=x; i++){
			g.drawRect(e.getX(), e.getY(), i, i);
		}
	}*/
	
	public void paintCompenents(Graphics g, MouseEvent e, Color c, int x){
		g.setColor(c);
		for(int i=0; i<=x; i++){
			g.drawRect(e.getX(), e.getY(), i, i);
		}
	}
	
					// Fonction qui permet d'effacer
/*	
	public void raise(Graphics g, MouseEvent e, Color c, int x){
		g.setColor(c);
		for(int i=0; i<=x; i++){
			g.drawRect(e.getX(), e.getY(), i, i);
			g.drawOval(e.getX(), e.getY(), i, i);
		}
	}
*/	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		 
					// Gestion des events au niveau des outils boutons et menuItem
		
		if(source == menubar.quit){
			System.exit(0);
		}
		if(source == menubar.save){
			try {
				save.sauverJPanelDansFichier(drawpan, this);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.print("impossible d'enregistrer");
				e1.printStackTrace();
			}
		}
		if((source == outilpan.opinceau)||(source == menubar.pinceau)){
			outilselect = 0;
			if(source == menubar.pinceau){
				outilpan.opinceau.setSelected(true);
			}
		}
		if((source == outilpan.opcrayon)||(source == menubar.crayon)){
			outilselect = 1;
			if(source == menubar.crayon){
				outilpan.opcrayon.setSelected(true);
			}
		}
		if((source == outilpan.opgomme)||(source == menubar.gomme)){
			outilselect = 2;
			if(source == menubar.gomme){
				outilpan.opgomme.setSelected(true);
			}
		}
		if((source == outilpan.opeinture)||(source == menubar.peinture)){
			outilselect = 3;
			if(source == menubar.peinture){
				outilpan.opeinture.setSelected(true); 
			}
		}
		
					// Gestion des events au niveau des couleurs boutons et menuItem
		
		if((source == outilpan.opvert)||(source == menubar.vert)){
			colorselect = 0;
			if(source == menubar.vert){
				outilpan.opvert.setSelected(true);
			}
		}
		if((source == outilpan.opjaune)||(source == menubar.jaune)){
			colorselect = 1;
			if(source == menubar.jaune){
				outilpan.opjaune.setSelected(true);
			}
		}
		if((source == outilpan.oprouge)||(source == menubar.rouge)){
			colorselect = 3;
			if(source == menubar.rouge){
				outilpan.oprouge.setSelected(true);
			}
		}
		if((source == outilpan.opbleu)||(source == menubar.bleu)){
			colorselect = 2;
			if(source == menubar.bleu){
				outilpan.opbleu.setSelected(true);
			}
		}
		if((source == outilpan.opnoir)||(source == menubar.noir)){
			colorselect = 4;
			if(source == menubar.noir){
				outilpan.opnoir.setSelected(true);
			}
		}
		if((source == outilpan.opmarron)||(source == menubar.marron)){
			colorselect = 5;
			if(source == menubar.marron){
				outilpan.opmarron.setSelected(true);
			}
		}
		if((source == outilpan.opgris)||(source == menubar.gris)){
			colorselect = 6;
			if(source == menubar.gris){
				outilpan.opgris.setSelected(true);
			}
		}
		
}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getComponent();
		Graphics g = drawpan.getGraphics();
		if(source == drawpan){
			  		// Selection de la couleur de l'outil
			
			if(colorselect == 0){
				g.setColor(Color.GREEN);
			}
			if(colorselect == 1){
				g.setColor(Color.YELLOW);
			}
			if(colorselect == 2){
				g.setColor(Color.BLUE);
			}
			if(colorselect == 3){
				g.setColor(Color.RED);
			}
			if(colorselect == 4){
				g.setColor(Color.BLACK);
			}
			if(colorselect == 5){
				g.setColor(new Color(88, 41, 0));
			}
			if(colorselect == 6){
				g.setColor(Color.GRAY);
			}
			
					// Dessin avec les outils
			
			if(outilselect == 0){
				this.paintCompenents(g, e, g.getColor(), 4);
			}
			if(outilselect == 1){
				this.paintCompenents(g, e, g.getColor(), 1);
			}
			if(outilselect == 3){
				drawpan.paintComponents(g);
				this.paintCompenents(g, e, g.getColor(), 12);
			}
			if(outilselect == 2){
				this.paintCompenents(g, e, drawpan.getBackground(), 2);
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getComponent();
		if(source == drawpan){
			if(outilselect == 0){
				cr = tk.createCustomCursor(tk.getImage("paint-brush.png"), new Point(0,14), "Pinceau");
				this.setCursor(cr);
			}
			if(outilselect == 1){
				cr = tk.createCustomCursor(tk.getImage("pencil.png"), new Point(0,14), "Crayon");
				this.setCursor(cr);		
			}
			if(outilselect == 3){
				cr = tk.createCustomCursor(tk.getImage("paint-bucket.png"), new Point(0,14), "Peinture");
				this.setCursor(cr);
			}
			if(outilselect == 2){
				cr = tk.createCustomCursor(tk.getImage("eraser.png"), new Point(0,20), "Gomme");
				this.setCursor(cr);
			}	
		}
	}

	public static void main(String [] args){
		Dessin t = new Dessin("Xalimak Wakana");
		t.setSize(700, 450);
		t.setLocation(340, 200);
		t.setVisible(true);
	}
	

}
