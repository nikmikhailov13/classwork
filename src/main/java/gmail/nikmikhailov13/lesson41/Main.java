package gmail.nikmikhailov13.lesson41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();

        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        Player player4 = new Player(65, "Nash", 20);

//        compare player1 and player2 (by ranking)
//        "player1 < player2"
//        "player1 == player2"
//        "player1 > player2"
//        String result = "";
//        switch (player1.compareTo(player3)) {
//            case -1:
//                result = "player-left < player-right";
//                break;
//            case 0:
//                result = "player-left == player-right";
//                break;
//            case 1:
//                result = "player-left > player-right";
//                break;
//        }
//
//        System.out.println(result);

        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
        footballTeam.add(player4);

        System.out.println("Before Sorting : " + footballTeam);
        footballTeam.sort(Collections.reverseOrder());
        System.out.println("After Sorting : " + footballTeam);
    }
}
