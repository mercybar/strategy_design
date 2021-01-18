public class Receiver extends Player{
    public Receiver (String name){
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