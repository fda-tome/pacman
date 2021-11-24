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
public abstract class personagem extends entidade{
    private parOrdenado vel;
    personagem(parOrdenado pos, parOrdenado vel){
        super(pos);
        this.vel = vel;
    }
    personagem(parOrdenado pos){
        super(pos);
        vel = new parOrdenado(0,0);
    }
    public parOrdenado getVel(){
        return vel;
    }
    public void setVel(parOrdenado vel){
        this.vel = vel;
    }
    public abstract void move();
}
