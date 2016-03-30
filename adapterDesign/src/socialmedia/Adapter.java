/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author taser_000
 */
public class Adapter extends YouTubeVideo implements SocialMediaEntry {
    private YouTubeVideo tube;
    
    public Adapter(String author, String title, String description) {
        tube = new YouTubeVideo (author,title,description);
    }

    @Override
    public String getUser() {
        return  tube.getAuthor();
    }

    @Override
    public String getPostText() {
        return (tube.getTitle() + " "  + tube.getDescription());
    }
}
