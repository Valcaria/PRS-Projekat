package Package;
import java.util.concurrent.TimeUnit;

public class GhostPink extends Ghosts implements Runnable
{
    GhostPink()
    {
        super();
    }

    @Override
    public void move()
    {
        Game.moveRandom(this);
        this.setGhost_x(this.getGhost_x() + this.getGhost_dx() * this.getGhost_speed());
        this.setGhost_y(this.getGhost_y() + this.getGhost_dy() * this.getGhost_speed());

        this.setWait(true);
    }

    public void movePink()
    {
    	while(true)
        {
            if(!this.getWait())
            {
                move();
            }
            try
            {
            	TimeUnit.SECONDS.wait(50);
                
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
	}
    @Override
    public void run()
    {
        while(true)
        {
            if(!this.getWait())
            {
                move();
            }
            try
            {
            
                Thread.sleep(50);
              
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
