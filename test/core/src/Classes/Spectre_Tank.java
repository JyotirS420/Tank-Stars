package Classes;

import com.badlogic.gdx.physics.box2d.World;

public class Spectre_Tank extends Tank {
    private int maxPowerLaunch;
    private boolean isSurpriseBoxActive;



    public Spectre_Tank(World world, int x, int y, int width, int height, String tankType) {
        super(world, x, y, width, height, tankType);
        this.health = 3;
        this.speed = 10;
        this.isAlive = true;
        this.maxFuel = 200;
        this.maxPowerLaunch = 100;
        this.isSurpriseBoxActive = false;
        this.body.setLinearDamping(20.5f);

        //set userdata
        this.body.setUserData(this);

    }

    public Spectre_Tank(World world, int x, int y, int width, int height, String tankType, int health, int fuel) {
        super(world, x, y, width, height, tankType);
        this.health = health;
        this.fuel = fuel;

        this.speed = 10;
        this.isAlive = true;
        this.maxFuel = 200;
        this.maxPowerLaunch = 100;
        this.isSurpriseBoxActive = false;
        this.body.setLinearDamping(20.5f);

        //set userdata
        this.body.setUserData(this);

    }

    public Spectre_Tank(int x, int y, int width, int height, String tankType,int health, int fuel) {
        super(x, y, width, height, tankType, health, fuel);
        this.health = health;
        this.fuel = fuel;

        this.speed = 10;
        this.isAlive = true;
        this.maxFuel = 200;
        this.maxPowerLaunch = 100;
        this.isSurpriseBoxActive = false;


    }

    public int getMaxPowerLaunch() {
        return maxPowerLaunch;
    }

    public void setMaxPowerLaunch(int maxPowerLaunch) {
        this.maxPowerLaunch = maxPowerLaunch;
    }

    public boolean isSurpriseBoxActive() {
        return isSurpriseBoxActive;
    }

    public void setSurpriseBoxActive(boolean surpriseBoxActive) {
        isSurpriseBoxActive = surpriseBoxActive;
    }
}

