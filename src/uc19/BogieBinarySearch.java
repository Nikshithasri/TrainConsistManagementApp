package uc19;

import java.util.Arrays;

public class BogieBinarySearch {

    public boolean binarySearch(String[] bogieIds, String key) {

        if (bogieIds.length == 0) return false;

        Arrays.sort(bogieIds); // ensure sorted

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = bogieIds[mid].compareTo(key);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
