package Recruiting;

import java.util.Comparator;

class CompRecruitTeamRosterOvr implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        String[] psA = a.split(" ");
        String[] psB = b.split(" ");
        int ovrA = Integer.parseInt(psA[5]);
        int ovrB = Integer.parseInt(psB[5]);
        return ovrA > ovrB ? -1 : ovrA == ovrB ? 0 : 1;
    }
}
