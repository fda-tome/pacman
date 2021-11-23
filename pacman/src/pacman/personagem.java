/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

/**
 *
 * @author nosf
 */
public abstract class personagem extends entidade{
    private parOrdenado vel;
    personagem(parOrdenado vel){
        this.vel = vel;
    }
    public parOrdenado getVel(){
        return vel;
    }
    public void setVel(parOrdenado vel){
        this.vel = vel;
    }
    public abstract void move();
}
