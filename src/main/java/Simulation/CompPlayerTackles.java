package Simulation;

import java.util.Comparator;

/**
 * Created by ahngu on 11/13/2017.
 */

class CompPlayerTackles implements Comparator<PlayerDefense> {
    @Override
    public int compare(PlayerDefense a, PlayerDefense b) {
        return a.tackles > b.tackles ? -1 : a.tackles == b.tackles ? 0 : 1;
    }
}