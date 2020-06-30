import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Palette_couleur extends JFrame implements ActionListener{

	public Color coul;
	public JButton boutcol; 
	
	public Palette_couleur(int x, int y){
		super("Palette de couleur");
		Container cont = this.getContentPane();
		cont.setLayout(new FlowLayout());
		for(int i=0; i<256; i+=50){
			for(int j=0; j<256; j+=50 ){
				for(int k=0; k<256; k+=50){
					boutcol.addActionListener(this);
					boutcol = new JButton();
					boutcol.setBackground(new Color(k, j, i));
					cont.add(boutcol);
				}
			}
		}
		this.setSize(350, 410);
		this.setLocation(x, y);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		coul = ((JButton)e.getSource()).getBackground();
	}
}
