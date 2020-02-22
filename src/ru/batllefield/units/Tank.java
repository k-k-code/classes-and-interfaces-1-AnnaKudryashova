package ru.batllefield.units;

public class Tank extends AbstractMachine implements Shooter {
    private short shootPower;
    public Tank(short fuel){
        super(fuel);
        this.shootPower=shootPower;

    }

    @Override
    public void shoot(Shootable target) {
        target.getShot(shootPower);
    }
}
