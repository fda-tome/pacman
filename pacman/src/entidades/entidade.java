/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author nosf
 */
public class entidade {
    private parOrdenado pos;
    public entidade(parOrdenado pos){
        this.pos = pos;
    }
    public parOrdenado getPos(){
        return pos;
    }
    public void setPos(parOrdenado pos){
        this.pos = pos;
    }
}
