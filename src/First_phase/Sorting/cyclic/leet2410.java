package First_phase.Sorting.cyclic;

import java.util.Arrays;

public class leet2410 {
    public static void main(String[] args) {
            int one[]={4,7,9};
            int two[]={8,2,5,8};

        System.out.println(matchPlayersAndTrainers(one,two));
    }
    static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i=0; int j=0;

        Arrays.sort(players);
        Arrays.sort(trainers);
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}
