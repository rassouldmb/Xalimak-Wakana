import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel{
	
    private Color pointerColor = Color.black;	//Color of pointer
    private String pointerType = "CIRCLE";		//Form of pointer
    @SuppressWarnings("unused")
	private int posX = -10, oldX = -10;			//Position X of pointer
    @SuppressWarnings("unused")
	private int posY = -10, oldY = -10;			//Position Y of pointer
    private boolean erasing = true;				//Pour savoir si on doit dessiner ou non
    private int pointerSize = 2;				//Taille du pointeur
    private ArrayList<Points> points = new ArrayList<Points>();		//Collection de points !
    
    
    public DrawPanel(){	
       this.addMouseListener(new MouseAdapter(){
    	   
          public void mousePressed(MouseEvent e){
             points.add(new Points(e.getX() - (pointerSize / 2), e.getY() - (pointerSize / 2), pointerSize, pointerColor, pointerType));
             repaint(); 
          }
          
       });
         
       this.addMouseMotionListener(new MouseMotionListener(){
          public void mouseDragged(MouseEvent e) { 
        	  //On récupère les coordonnées de la souris et on enlève la moitié de la taille du pointeur pour centrer le trace
        	 points.add(new Points(e.getX() - (pointerSize / 2), e.getY() -(pointerSize / 2), pointerSize, pointerColor,  pointerType));
             repaint();
          }
          public void mouseMoved(MouseEvent e) {  
          }
          
        });
   }
    
    
   public void paintComponent(Graphics g) {
       g.setColor(Color.white);
       g.fillRect(0, 0, this.getWidth(), this.getHeight());
       //Si on doit effacer, on ne passe pas dans le else => pas de dessin
       if(this.erasing){
          this.erasing = false;
       }
       else{
          //On parcourt notre collection de points
          for(Points p : this.points){
             //On récupère la couleur
             g.setColor(p.getColor());
             //Selon le type de point
             if(p.getType().equals("SQUARE")){
            	 g.fillRect(p.getX(), p.getY(), p.getSize(), p.getSize());
             }
             else{
                g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
             } 
          }
       } 
    }
   
    //Efface le contenu
    public void erase(){
    	
       this.erasing = true;
       this.points = new ArrayList<Points>();
       repaint();
    }
    
    //Définit la couleur du pointeur
    public void setPointerColor(Color c){
       this.pointerColor = c;
    }
    
    public void setPointerSize(int n){
        this.pointerSize = n;
    }
    
    public void setPCursor(Cursor c){
        this.setCursor(c);
     }
    
    
    //Définit la forme du pointeur
    public void setPointerType(String str){
       this.pointerType = str;
    }
}

