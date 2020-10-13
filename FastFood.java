package BurgerProgram;

public class FastFood {
    String name;
    String drink;
    String side;
    public FastFood (String name, String drink, String side){
        this.name = name;
        this.drink = drink;
        this.side = side;

    }
    public String toString(){

        return name +"/"+drink+"/"+side;
    }


}
