import java.io.*;
import java.util.*;

class Solution {

    static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
        for(int i=0; i<slotsA.length; i++){
            for(int j=0; j<slotsB.length; j++){
                int aStart = slotsA[i][0];
                int bStart = slotsB[j][0];
                if(aStart>=bStart){
                    if(slotsB[j][1]-aStart>=dur && slotsA[i][1]-aStart>=dur){
                        int[] sol = new int[2];
                        sol[0] = aStart;
                        sol[1] = aStart+dur;
                        return sol;
                    }
                } else {
                    if(slotsA[i][1]-bStart>=dur && slotsB[j][1]-bStart>=dur){
                        int[] sol = new int[2];
                        sol[0] = bStart;
                        sol[1] = bStart+dur;
                        return sol;
                    }
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {

    }

}