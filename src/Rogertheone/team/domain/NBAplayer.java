package Rogertheone.team.domain;

/**
 * @Descripton: This the super class of all players with basic info
 * @Author: Long Zhang (Roger)  Email: ln451920@dal.ca
 * @Date 2023/06/11
 */
public class NBAplayer {

    private int memberID; // id in the team
    private int ID;
    private String name;
    private int age;
    private String team;
    private String position;

    private Accessories accessories;

    public NBAplayer() {

    }

    public NBAplayer(int ID, String name, int age, String team, String position, Accessories accessories) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.team = team;
        this.position = position;
        this.accessories = accessories;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Accessories getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessories accessories) {
        this.accessories = accessories;
    }

    public String toString(){
        return ID + "\t" + name + "\t" + age + "\t\t" + team + "\t" + position + "\t" + accessories.toString();
    }

    public String getDetails(){
        return memberID + "/" + ID + "\t\t" + name + "\t" + age + "\t\t" + team + "\t" + position;
    }

    public String getBaseDetails(){
        return getDetails();
    }
}
