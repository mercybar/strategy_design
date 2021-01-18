public class Lineman extends Player {

    public Lineman(String name){
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
