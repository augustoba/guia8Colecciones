
package ejercicio1extra.entity;

public class Numero {

    Integer num;

    public Numero() {
    }

    public Numero(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return   "numero: " + num ;
    }
    
    
}
