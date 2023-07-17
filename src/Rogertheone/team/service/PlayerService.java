package Rogertheone.team.service;

import Rogertheone.team.domain.*;

/**
 *
 * @description Regarding the management of the player lineup. Including adding, deleting, etc
 * @Author Long Zhang (Roger) Email: ln451920@dal.ca
 * @Date 2023/06/18
 */
public class PlayerService {
    private static int teamID = 1; // This is the id within the team, with the function of counter
    private static final int max_number = 5; // This is the max number of players in a team
    private NBAplayer[] team = new NBAplayer[5]; // A team should have only 5 starters
    private int total;

    public PlayerService(){
        super();
    }

    public NBAplayer[] getTeam(){
        NBAplayer[] team = new NBAplayer[total];
        for (int i = 0; i < team.length; i++){
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     *
     * @desctiption the squad should have at most 1 superstar, 2 All-Star and 3 starter
     * @param player
     * @throws IdException
     * @Author Long Zhang (Roger) Email: ln451920@dal.ca
     * @Date 2023/06/19
     *
     */
    public void addPlayer(NBAplayer player) throws IdException {
        if (total >= max_number){ // if the squad is full
            throw new IdException("Cannot add player because the squad is full");
        }
        if (isExist(player)){ // if the player is already in the team
            throw new IdException("Cannot add player because the player is already in the team");
        }

        int numOfstarter = 0; // number of starters
        int numOfAll = 0; // number of All stars
        int numOfSuper = 0; // number of super stars
        for (int i = 0; i < total; i++){
            if (team[i] instanceof Superstar){
                numOfSuper++;
            }else if (team[i] instanceof Allstar){
                numOfAll++;
            }else{
                numOfstarter++;
            }
        }
        if (player instanceof Superstar){
            if (numOfSuper >= 1){
                throw new IdException("The team should have at most 1 superstar");
            }
        }else if (player instanceof Allstar){
            if (numOfAll >=2 ){
                throw new IdException("The team should have at most 2 all-stars");
            }
        }else if (player instanceof Starter){
            if (numOfstarter >= 3){
                throw new IdException("The team should have at most 3 starters");
            }
        }else{
            throw new IdException("This is the starting lineup, you can only choose players whose level is above starter");
        }

        team[total++] = player;
        player.setMemberID(teamID++);

    }
    public void removePlayer(int memberID) throws IdException {
        int i = 0;
        for (; i < total; i++){
            if (team[i].getMemberID() == memberID){
                break;
            }
        }

        if (i == total){ // did not find the member in the team
            throw new IdException("did not find the player, delete failed");
        }
        for (int j = i+1; j < total; j ++){  //
            team[j-1] = team[j];
        }
        team[total-1] = null;
        total--;


    }
    public boolean isExist(NBAplayer player){
        for (int i = 0; i < total; i++){
            if (player.getID() == team[i].getID()){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
