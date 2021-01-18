import java.util.Random;

public class BlockBehavior implements DefenceBehavior{
    private static final String BLOCK_A = "block a ";
    Random rand = new Random();
    private String[] blocks = {"kick", "punt", "pass", "catch"};

    public String play()
    {
        String[] block;
        return BLOCK_A + block[rand.nextInt(blocks.length)];
    }
}