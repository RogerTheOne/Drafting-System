package Rogertheone.team.domain;
/**
 *
 * @Description This is the Forward class implemented from the interface Accessories
 * @Author Long Zhang (Roger) Email: ln451920@dal.ca
 * @Date 2023/06/15
 */
public class Forward implements Accessories{
    private String brand;
    private String model;

    public Forward(String brand, String model) {
        super();
        this.brand = brand;
        this.model = model;
    }

    public Forward(){
        super();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return brand + "(" + model + ")";
    }
}
