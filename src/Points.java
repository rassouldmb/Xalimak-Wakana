import java.awt.Color;


public class Points {
    private Color color = Color.red;		//Couleur du point
    private int size = 10;			//Taille
    private int x = -10;		//Position sur l'axe X : initialisé au dehors du conteneur
    private int y = -10;		//Position sur l'axe Y : initialisé au dehors du conteneur
    private String type = "ROND";			//Type de point
   
    // Constructeur par défaut
    public Points(){}
    
    public Points(int x, int y, int size, Color color, String type){
       this.size = size;
       this.x = x;
       this.y = y;
       this.color = color;
       this.type = type;
    }
    
    // Accesseurs
    public Color getColor() {
       return color;
    }
    
    public void setColor(Color color) {
       this.color = color;
    }
    
    public int getSize() {
       return size;
    }
    
    public void setSize(int size) {
       this.size = size;
    }
    
    public int getX() {
       return x;
    }
    
    public void setX(int x) {
       this.x = x; 
    }
    
    public int getY() {
       return y;
    }
    
    public void setY(int y) {
       this.y = y; 
    }
    
    public String getType() {
       return type;
    }
    
    public void setType(String type) {
       this.type = type;
    }
}
