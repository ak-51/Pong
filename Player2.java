import greenfoot.*;

public class Player2 extends Paddle
{
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 10);
        }
        
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+10);
        }
    }
}
