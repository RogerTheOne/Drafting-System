package Rogertheone.team.domain;

/**
 *
 * @Description This is the Allstar class extended from Starter with the number of all star game attended
 * @Author Long Zhang (Roger) Email: ln451920@dal.ca
 * @Date 2023/06/15
 */
public class Allstar extends Starter{

    private String AllStarAttended;

    public Allstar() {
        super();
    }

    public Allstar(int ID, String name, int age, String team, String position, String salary, Accessories accessories, String allStarAttended) {
        super(ID, name, age, team, position, salary, accessories);
        AllStarAttended = allStarAttended;
    }

    public String getAllStarAttended() {
        return AllStarAttended;
    }

    public void setAllStarAttended(String allStarAttended) {
        AllStarAttended = allStarAttended;
    }

    public String toString(){
        return super.toString() + "\t\t\t" + AllStarAttended;
    }

    public String getBaseDetails(){
        return getDetails() + "\tAll Star";
    }
}
