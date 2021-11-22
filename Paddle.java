import greenfoot.*;

public class Paddle extends Actor
{
    public Paddle(){
        GreenfootImage img = new GreenfootImage(10,100);
        img.setColor(Color.YELLOW);
        img.fillRect(0,0,10,100);
        setImage(img);
    }
    
    public void act()
    {
    }
}
