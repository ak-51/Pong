import greenfoot.*;

public class Scoreboard extends Actor
{
    public Scoreboard(String player1, String player2){
        GreenfootImage img = new GreenfootImage(600,40);
        img.setColor(Color.WHITE);
        Font font = new Font("Helvetica", true, false, 20);
        img.setFont(font);
        img.drawString(player1, 100, 35);
        img.drawString(player2, 450, 35);
        setImage(img);
    }
    
    public void act()
    {
        
    }
    
    public void setText(String player1, String player2){
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(player1,100,35);
        img.drawString(player2,450,35);
        setImage(img);
    }
}
