package Simulation;

import java.util.Comparator;

/**
 * Created by ahngu on 11/13/2017.
 */
//League

class CompPlayerHeisman implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        return a.getHeismanScore() > b.getHeismanScore() ? -1 : a.getHeismanScore() == b.getHeismanScore() ? 0 : 1;
    }
}