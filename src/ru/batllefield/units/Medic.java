package ru.batllefield.units;

public class Medic extends AbstractHuman implements Shootable {
    public Medic(short health, short armor) {
        super(health, armor);
    }

    @Override
    public void getShot(short shootPower) {
        short armor = getArmor();
        short health = getHealth();
        if(armor==0){
            setHealth((short)(health-shootPower));
        }else{
            setHealth((short)(health-shootPower/armor));
        }
    }
}
