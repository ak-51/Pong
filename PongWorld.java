import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PongWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLUE);
        background.fill();
        
        Scoreboard scoreboard = new Scoreboard("Player1","Player2");
        addObject(scoreboard, 300, 20);
        
        
        addObject(new Player1(), 10, 200);
        addObject(new Player2(), 590, 200);
        addObject(new Ball(scoreboard), 300, 200);
    }
}
