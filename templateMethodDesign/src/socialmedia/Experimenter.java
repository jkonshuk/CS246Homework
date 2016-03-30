package socialmedia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class is the Experiment shell for the classification program.
 * 
 * @author sburton
 */
public interface Experimenter {
    
    /**
     * Runs the Experiment and outputs the results
     */
    public void runTest();
    
    /**
     * Gets a filename from the user
     * @return 
     */
    String getFileName();
    
    /**
     * Loads SocialMediaEntries from the given file.
     * @param file
     * @return 
     */
    Set<SocialMediaEntry> loadEntriesFromFile(String file);
    
    /**
     * Gets the training set from the given entries.
     * @param entries
     * @return 
     */
    Set<SocialMediaEntry> loadTrainingData(Set<SocialMediaEntry> entries);
    
    /**
     * Gets the test set from the given entries.
     * @param entries
     * @return 
     */
    Set<SocialMediaEntry> loadTestData(Set<SocialMediaEntry> entries);
            
    /**
     * Builds a model and classifies the test set.
     * @param trainingSet
     * @param testSet
     * @return A mapping of true or false to each entry in the test set.
     */
    Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet,
            Set<SocialMediaEntry> testSet);
    
    /**
     * Outputs the results of the experiment
     * @param results 
     */
    void outputResults(Map<SocialMediaEntry, Boolean> results);
}
