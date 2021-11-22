import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

    /**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
    
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void setText(String player1, String player2){
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(player1,100,35);
        img.drawString(player2,450,35);
        setImage(img);
    }
}
