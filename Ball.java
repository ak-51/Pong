import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    public int velX = Greenfoot.getRandomNumber(5)+3;
    public int velY = Greenfoot.getRandomNumber(5)+3;
    public int deltaT = 1;
    
    private int player1Count;
    private int player2Count;
    
    private Scoreboard score;
    
    public Ball(Scoreboard scoreboard){
        GreenfootImage img = new GreenfootImage(40,40);
        img.drawOval(0,0,38,38);
        img.setColor(Color.RED);
        img.fillOval(0,0,38,38);
        setImage(img);
        
        score = scoreboard;
    }
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+(velX*deltaT),getY()+(velY*deltaT));
        wallCollision();
        paddleCollision();
        scorePoints();
    }
    
    public void wallCollision(){
        if(getX() < 10 || getX() > 590){
            velX = -velX;
        }
        
        if(getY() < 10 || getY() > 390){
            velY = -velY;
        }
    }
    
    public void paddleCollision(){
        if(getOneIntersectingObject(Paddle.class) != null){
            velX = -velX;
        }
    }
    
    public void scorePoints(){
        if(getX() < 10){
            player2Count++;
            if(player2Count > 4){
                setLocation(300,200);
                score.setText("Player1: " + player1Count, "Player2: " + player2Count);
                GreenfootImage img = new GreenfootImage(250, 50);
                img.setColor(Color.WHITE);
                Font font = new Font("Helvetica", true, false, 25);
                img.setFont(font);
                img.drawString("Player 2 Wins!", 30, 45);
                setImage(img);
                
                Greenfoot.stop();
            }
            else{
                setLocation(300,200);
                score.setText("Player1: " + player1Count, "Player2: " + player2Count);
                Greenfoot.delay(25);
            }
        }
        
        if(getX() > 590){
            player1Count++;
            if(player1Count > 4){
                setLocation(300,200);
                score.setText("Player1: " + player1Count, "Player2: " + player2Count);
                GreenfootImage img = new GreenfootImage(250, 50);
                img.setColor(Color.WHITE);
                Font font = new Font("Helvetica", true, false, 25);
                img.setFont(font);
                img.drawString("Player 1 Wins!", 30, 45);
                setImage(img);
                
                Greenfoot.stop();
            }
            else{
                setLocation(300,200);
                score.setText("Player1: " + player1Count, "Player2: " + player2Count);
                Greenfoot.delay(25);
            }
        }
    }
}
