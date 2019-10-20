package home;

import menue.DatabaseSourceSearch;
import org.testng.annotations.Test;

public class DatabaseSearchFriends extends DatabaseSourceSearch {
    @Test
    public void searchfriends() throws InterruptedException {
        signIn();
        searchFriends(); }
}
