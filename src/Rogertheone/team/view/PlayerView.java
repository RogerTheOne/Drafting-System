package Rogertheone.team.view;

import Rogertheone.team.domain.NBAplayer;
import Rogertheone.team.domain.Starter;
import Rogertheone.team.service.IdException;
import Rogertheone.team.service.PlayerListService;
import Rogertheone.team.service.PlayerService;

/**
 *
 * @Description This is the class focusing on the user side.
 * @Author Long Zhang (Roger) Email: ln451920@dal.ca
 * @Date 2023/06/20
 */
public class PlayerView {
    private PlayerListService listService = new PlayerListService();
    private PlayerService playerService = new PlayerService();

    public void enterMainMenu(){

        boolean isFlag = true;
        char menu = 0;
        while(isFlag) {
            if (menu != '1'){
                listAllPlayers();
            }

            System.out.print("1-Team Review  2-Add Player  3-Remove Player  4-Back  Please select (1-4): ");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addPlayer();
                    break;
                case '3':
                    removePlayer();
                    break;
                case '4':
                    System.out.println("Are you sure you want to go back (Y/N):  ");
                    char isGoBack = TSUtility.readConfirmSelection();
                    if (isGoBack == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }

    }


    private void listAllPlayers(){
        System.out.println();
        System.out.println("-----------------------------------------------------------------NBA Players Draft------------------------------------------------------------------\n");
        NBAplayer[] players = listService.getAllNbaPlayers();
        System.out.println("ID\t\tName\t\t\tAge\t\tTeam\t\tposition\t\t\tAccessories\t\t\t\t\tSalary\t\tAll Star Game Attended\tChampionship");
        for (int i = 0; i < players.length; i++){
            System.out.println(players[i]);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }

    private void getTeam(){
        System.out.println("\n-----------------------------------This is your squad------------------------------------");
        NBAplayer[] teamMember = playerService.getTeam();
        if (teamMember == null || teamMember.length == 0){
            System.out.println("There is no player in the squad");
        }else{
            System.out.println("TID/ID\t\tName\t\t\tAge\t\tTeam\t\tPosition\t\t\tLevel");
            for (int i = 0; i < teamMember.length; i++){
                System.out.println(teamMember[i].getBaseDetails());
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------\n");
    }
    private void addPlayer(){
        System.out.println("Add nba player");
        System.out.println("-----------------------------------Add Player------------------------------------\n");
        System.out.println("Please enter the ID you want to add: ");
        int id = TSUtility.readInt();
        try {
            NBAplayer p = listService.getPlayers(id);
            playerService.addPlayer(p);
            System.out.println("Successfully added!");
            TSUtility.readReturn();
        } catch (IdException e) {
            System.out.println("Failed: " + e.getMessage());
        }
    }

    private void removePlayer(){
        System.out.println("Remove nba player");
    }

    public static void main(String[] args) {
        PlayerView playerView = new PlayerView();
        playerView.enterMainMenu();
    }
}
