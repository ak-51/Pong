import greenfoot.*;

public class PongWorld extends World
{
    public PongWorld()
    {    
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
