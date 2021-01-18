public class RunBehavior implements OffenceBehavior{

    @Override
    public String play(){
            String[] moves = {"draw", "pitch", "reverse"};
            int choice = (int) Math.random() * 4;
            return "runs a " + moves[choice];       
    }

}
