/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import entidades.entidade;
import entidades.parOrdenado;
    
/**
 *
 * @author nosf
 */
public class bloco extends entidade{
    private boolean parede;
    private boolean caminho;
    private boolean consumivel;
    private boolean fantasma;
    private boolean player;
    bloco(parOrdenado pos){
        super(pos);
    }
    private boolean getParede(){
        return parede;
    }    
    private boolean getCaminho(){
        return caminho;
    }
    private boolean getConsumivel(){
        return consumivel;
    }
    private boolean getFantasma(){
        return fantasma;
    }
    private boolean getPlayer(){
        return player;
    }
    private void setParede(boolean estado){
        parede = estado;
    }
    private void setCaminho(boolean estado){
        caminho = estado;
    }
    private void setConsumivel(boolean estado){
        consumivel = estado;
    }
    private void setFantasma(boolean estado){
        fantasma = estado;
    }    
    private void setplayer(boolean estado){
        player = estado;
    }
}
