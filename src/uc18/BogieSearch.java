package uc18;

public class BogieSearch {

    public boolean searchBogie(String[] bogieIds, String key) {

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true; // found
            }
        }
        return false; // not found
    }
}