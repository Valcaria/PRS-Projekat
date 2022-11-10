package Package;

public abstract class Ghosts
{

    private int ghost_x;
    private int ghost_y;
    private int ghost_dx;
    private int ghost_dy;
    private int ghost_speed;

    private boolean wait;

    public Ghosts()
    {
        this.ghost_x = 50;
        this.ghost_y = 50;
        this.ghost_dx = 50;
        this.ghost_dy = 50;
        this.ghost_speed = 2;

        this.wait = true;
    }

    synchronized public int getGhost_x()
    {
        return ghost_x;
    }

    synchronized public void setGhost_x(int ghost_x)
    {
        this.ghost_x = ghost_x;
    }

    synchronized public int getGhost_y()
    {
        return ghost_y;
    }

    synchronized public void setGhost_y(int ghost_y)
    {
        this.ghost_y = ghost_y;
    }

    synchronized public int getGhost_dx()
    {
        return ghost_dx;
    }

    synchronized public void setGhost_dx(int ghost_dx)
    {
        this.ghost_dx = ghost_dx;
    }

    synchronized public int getGhost_dy()
    {
        return ghost_dy;
    }

    synchronized public void setGhost_dy(int ghost_dy)
    {
        this.ghost_dy = ghost_dy;
    }

    synchronized public int getGhost_speed()
    {
        return ghost_speed;
    }

    synchronized public void setGhost_speed(int ghost_speed)
    {
        this.ghost_speed = ghost_speed;
    }

    synchronized public void setWait(boolean wait)
    {
        this.wait = wait;
    }

    synchronized public boolean getWait()
    {
        return this.wait;
    }

    synchronized public int automatic(boolean word[])
    {
        int condition = -1;

        if (word[0])
        {
            condition = 0; 
        }

        if (word[1])
        {
            if(condition == -1)
            {
                condition = 1; 
            }

            else condition = 2; 
        }

        if (word[2])
        {
            if(condition == -1)
            {
                condition = 3; 
            }

            else if(condition == 0)
            {
                condition = 4; 
            }

            else if(condition == 1)
            {
                condition = 5;
            }
        }

        if (word[3])
        {
            if(condition == -1)
            {
                condition = 6;
            }

            else if(condition == 0)
            {
                condition = 7; 
            }

            else if(condition == 1)
            {
                condition = 8; 
            }

            else if(condition == 3)
            {
                condition = 9; 
            }
        }

        return condition;
    }

    public abstract void move();
}
