package Rogertheone.team.domain;
/**
 * @Descripton: This the sub class starter of NBA player
 * @Author: Long Zhang (Roger)  Email: ln451920@dal.ca
 * @Date 2023/06/11
 */
public class Starter extends NBAplayer{

    private String salary;
    private Accessories accessories;

    public Starter() {
        super();
    }

    public Starter(int ID, String name, int age, String team, String position, String salary, Accessories accessories) {
        super(ID, name, age, team, position, accessories);
        this.salary = salary;

    }



    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


    public String toString(){
        return super.toString() + "\t\t" + salary;
    }

    public String getBaseDetails(){
        return getDetails() + "\tStarter";
    }

    //ID + "\t" + name + "\t" + age + "\t\t" + team + "\t" + position;
}
