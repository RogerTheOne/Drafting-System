package Rogertheone.team.test;

import Rogertheone.team.domain.NBAplayer;
import Rogertheone.team.service.IdException;
import Rogertheone.team.service.PlayerListService;
import org.junit.Test;

/**
 *
 * @ Description Unit test for player list
 * @ Author Long Zhang (Roger) Email: ln451920@dal.ca
 * @ Date 2023/06/16
 */
public class PlayerListServiceTest {

    @Test
    public void testGetAllNbaPlayers(){
        PlayerListService p1 = new PlayerListService();
        NBAplayer[] nbAplayers = p1.getAllNbaPlayers();
        for (int i = 0; i < nbAplayers.length; i++){
            System.out.println(nbAplayers[i]);
        }
    }

    @Test
    public void testGetPlayer(){
        PlayerListService p2 = new PlayerListService();
        int id = 1;
        try{
            NBAplayer nbAplayers = p2.getPlayers(id);
            System.out.println(nbAplayers);
        }catch(IdException e){
            System.out.println(e.getMessage());
        }
    }

}
