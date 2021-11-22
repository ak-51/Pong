import greenfoot.*;

public class Player1 extends Paddle
{   
    public void act()
    {
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 10);
        }
        
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+ 10);
        }
    }
}
