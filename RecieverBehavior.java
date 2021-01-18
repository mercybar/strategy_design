public class RecieverBehavior implements OffenceBehavior {

    public String play() {
            String[] moves = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
            int choice = (int) Math.random() * 5;
            return "runs a " + moves[choice];
    }

}
