package Rogertheone.team.service;

/**
 *
 * @Description customize exception
 * @Author Long Zhang (Roger) Email: ln451920@dal.ca
 * @Date 2023/06/15
 */
public class IdException extends Exception{
    static final long serialVersionUID = -3387516893124228876L;
    public IdException(){
        super();
    }

    public IdException(String msg){
        super(msg);
    }


}
