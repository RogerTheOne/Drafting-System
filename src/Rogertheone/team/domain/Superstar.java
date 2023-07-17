package Rogertheone.team.domain;
/**
 *
 * @Description This is the Superstar class extended from Allstar with the number of championship
 * @Author Long Zhang (Roger) Email: ln451920@dal.ca
 * @Date 2023/06/15
 */
public class Superstar extends Allstar{
    private int Championship;

    public Superstar() {
        super();
    }


    public Superstar(int ID, String name, int age, String team, String position, String salary, Accessories accessories, String allStarAttended, int championship) {
        super(ID, name, age, team, position, salary, accessories, allStarAttended);
        Championship = championship;
    }

    public int getChampionship() {
        return Championship;
    }
    public void setChampionship(int championship) {
        Championship = championship;
    }

    public String toString(){
        return super.toString() + "\t\t\t\t" + Championship;
    }

    public String getBaseDetails(){
        return getDetails() + "\tSuperstar";
    }
}
