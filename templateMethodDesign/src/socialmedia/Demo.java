package socialmedia;

/**
 * This is the main driver for the program.
 * 
 * @author sburton
 */
public class Demo implements Runnable {

    @Override
    public void run() {
        // TODO: Add code here to run all three experiements
        Experimenter trueClass = new TrueClassifier();
        trueClass.runTest();
        Experimenter rando = new RandomClassifier();
        rando.runTest();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Demo().run();
    }
}
