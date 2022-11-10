package Package;

import java.util.concurrent.TimeUnit;

public class GhostYellow extends Ghosts implements Runnable
{
    GhostYellow()
    {
        super();
    }

    @Override
    public void move()
    {
        boolean[] word;
        word = Game.checkProximity(this);

        if (this.getGhost_x() % Board.BLOCK_SIZE == 0 && this.getGhost_y() % Board.BLOCK_SIZE == 0)
        {
            int condition;
            condition = this.automatic(word);

            int pacmanX = Game.getPositionPacman()[0];
            int pacmanY = Game.getPositionPacman()[1];

            if(pacmanX <= this.getGhost_x() && pacmanY <= this.getGhost_y())
            {
                switch(condition)
                {
                    case -1:
                        if((this.getGhost_x()-pacmanX) > (this.getGhost_y()-pacmanY))
                        {
                            this.setGhost_dx(-1);
                            this.setGhost_dy(0);
                        }
                        else
                        {
                            this.setGhost_dx(0);
                            this.setGhost_dy(-1);
                        }
                        break;

                    case 0:
                        this.setGhost_dx(0);
                        this.setGhost_dy(-1);
                        break;

                    case 1:
                        this.setGhost_dx(-1);
                        this.setGhost_dy(0);
                        break;

                    case 2:
                        this.setGhost_dx(1);
                        this.setGhost_dy(0);
                        break;

                    case 3:
                        if((this.getGhost_x()-pacmanX) > (this.getGhost_y()-pacmanY))
                        {
                            this.setGhost_dx(-1);
                            this.setGhost_dy(0);
                        }
                        else
                        {
                            this.setGhost_dx(0);
                            this.setGhost_dy(-1);
                        }
                        break;

                    case 4:
                        this.setGhost_dx(0);
                        this.setGhost_dy(-1);
                        break;

                    case 5:
                        this.setGhost_dx(-1);
                        this.setGhost_dy(0);
                        break;

                    case 6:
                        if((this.getGhost_x()-pacmanX) > (this.getGhost_y()-pacmanY))
                        {
                            this.setGhost_dx(-1);
                            this.setGhost_dy(0);
                        }
                        else
                        {
                            this.setGhost_dx(0);
                            this.setGhost_dy(-1);
                        }
                        break;

                    case 7:
                        this.setGhost_dx(0);
                        this.setGhost_dy(-1);
                        break;

                    case 8:
                        this.setGhost_dx(-1);
                        this.setGhost_dy(0);
                        break;

                    case 9:
                        if((this.getGhost_x()-pacmanX) > (this.getGhost_y()-pacmanY))
                        {
                            this.setGhost_dx(-1);
                            this.setGhost_dy(0);
                        }
                        else
                        {
                            this.setGhost_dx(0);
                            this.setGhost_dy(-1);
                        }
                        break;
                }
            }

            else if(pacmanX <= this.getGhost_x() && pacmanY > this.getGhost_y())
            {
                switch(condition)
                {
                    case -1:
                        if((this.getGhost_x()-pacmanX) > (pacmanY-this.getGhost_y()))
                        {
                            this.setGhost_dx(-1);
                            this.setGhost_dy(0);
                        }
                        else
                        {
                            this.setGhost_dx(0);
                            this.setGhost_dy(1);
                        }
                        break;

                    case 0:
                        this.setGhost_dx(0);
                        this.setGhost_dy(1);
                        break;

                    case 1:
                        if((this.getGhost_x()-pacmanX) > (pacmanY-this.getGhost_y()))
                        {
                            this.setGhost_dx(-1);
                            this.setGhost_dy(0);
                        }
                        else
                        {
                            this.setGhost_dx(0);
                            this.setGhost_dy(1);
                        }
                        break;

                    case 2:
                        this.setGhost_dx(0);
                        this.setGhost_dy(1);
                        break;

                    case 3:
                        if((this.getGhost_x()-pacmanX) > (pacmanY-this.getGhost_y()))
                        {
                            this.setGhost_dx(-1);
                            this.setGhost_dy(0);
                        }
                        else
                        {
                            this.setGhost_dx(0);
                            this.setGhost_dy(1);
                        }
                        break;

                    case 4:
                        this.setGhost_dx(0);
                        this.setGhost_dy(1);
                        break;

                    case 5:
                        if((this.getGhost_x()-pacmanX) > (pacmanY-this.getGhost_y()))
                        {
                            this.setGhost_dx(-1);
                            this.setGhost_dy(0);
                        }
                        else
                        {
                            this.setGhost_dx(0);
                            this.setGhost_dy(1);
                        }
                        break;

                    case 6:
                        this.setGhost_dx(-1);
                        this.setGhost_dy(0);
                        break;

                    case 7:
                        this.setGhost_dx(0);
                        this.setGhost_dy(-1);
                        break;

                    case 8:
                        this.setGhost_dx(-1);
                        this.setGhost_dy(0);
                        break;

                    case 9:
                        this.setGhost_dx(-1);
                        this.setGhost_dy(0);
                        break;
                }
            }

            else
            {
                Game.moveRandom(this);
            }
        }

        this.setGhost_x(this.getGhost_x() + this.getGhost_dx() * this.getGhost_speed());
        this.setGhost_y(this.getGhost_y() + this.getGhost_dy() * this.getGhost_speed());

        this.setWait(true);
    }

    public void moveYellow()
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
