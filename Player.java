
public class Player{
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    public Player(String name){
        this.name = name;
        this.setDefenceBehavior();
        this.setOffenceBehavior();
        this.defence = false;
    }

    public void setDefenceBehavior(){
        this.defenceBehavior = null;
    }

    public void setOffenceBehavior(){
        this.offenceBehavior = null;
    }
    
    public String play(){
        if(defence == false){
            return offenceBehavior.play();
        }
        else{
            return "they are not playing";
        }
    }

    public void turnover(){
        this.defence = true;
    }

}
