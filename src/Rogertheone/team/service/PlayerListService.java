package Rogertheone.team.service;

import Rogertheone.team.domain.*;
import jdk.jfr.DataAmount;

/**
 *
 * @description Responsible for encapsulating the data in Data into the
 * nbaPlayers [] array and providing methods for related operations on nbaPlayers [].
 * @Author Long Zhang (Roger) Email: ln451920@dal.ca
 * @Date: 2023/06/15
 */

public class PlayerListService {
    private NBAplayer[] nbaPlayers;

    public PlayerListService() {
        nbaPlayers = new NBAplayer[Data.Players.length];

        for (int i = 0; i < nbaPlayers.length; i++) {
            int type = Integer.parseInt(Data.Players[i][0]);

            int id = Integer.parseInt(Data.Players[i][1]);
            String name = Data.Players[i][2];
            int age = Integer.parseInt(Data.Players[i][3]);
            String team = Data.Players[i][4];
            String position = Data.Players[i][5];
            Accessories accessories;
            String salary;
            String allStarAttended;
            int championShip;
            switch (type) {
                case Data.NBAplayer:
                    accessories = createAccessories(i);
                    nbaPlayers[i] = new NBAplayer(id, name, age, team, position, accessories);
                    break;

                case Data.Starter:
                    salary = Data.Players[i][6];
                    accessories = createAccessories(i);
                    nbaPlayers[i] = new Starter(id, name, age, team, position, salary, accessories);
                    break;

                case Data.AllStar:
                    salary = Data.Players[i][6];
                    allStarAttended = Data.Players[i][7];
                    accessories = createAccessories(i);
                    nbaPlayers[i] = new Allstar(id, name, age, team, position, salary, accessories, allStarAttended);
                    break;
                case Data.SuperStar:
                    salary = Data.Players[i][6];
                    allStarAttended = Data.Players[i][7];
                    championShip = Integer.parseInt(Data.Players[i][8]);
                    accessories = createAccessories(i);
                    nbaPlayers[i] = new Superstar(id, name, age, team, position, salary, accessories, allStarAttended, championShip);
                    break;
            }
        }
    }

    /**
     *
     * Get the accessories details and create objects according to the player's position
     * @param i
     * @return obj
     */
    public Accessories createAccessories(int i) {
        int type = Integer.parseInt(Data.Accessories[i][0]);
        switch (type) {
            case Data.guard:
                return new Guard(Data.Accessories[i][1], Data.Accessories[i][2]);
            case Data.forward:
                return new Forward(Data.Accessories[i][1], Data.Accessories[i][2]);
            case Data.center:
                return new Center(Data.Accessories[i][1], Data.Accessories[i][2]);
        }
        return null;
    }

    /**
     * Get all nba players
     * @return
     */
    public NBAplayer[] getAllNbaPlayers() {
        return nbaPlayers;
    }

    /**
     * Get the certain nba player
     * @param id
     * @return
     */
    public NBAplayer getPlayers(int id) throws IdException {
        for (int i = 0; i < nbaPlayers.length; i++){
            if (nbaPlayers[i].getID() == id){
                return nbaPlayers[i];
            }
        }
        throw new IdException("Cannot find players");
    }

}


