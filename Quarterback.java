public class Quarterback extends Player {
    public Quarterback(String name){
        super(name);
    }

     public void setDefenceBehavior(){
        defenceBehavior = null;
    }

    public void setOffenceBehavior(){
            offenceBehavior = new RunBehavior();
            offenceBehavior = new PassBehavior();
    }

}
