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
public class pilula extends consumivel{
    private int powerUpTempo;
    pilula(parOrdenado pos){
        super(pos);
    }
    pilula(parOrdenado pos, int valor){
        super(pos, valor);
    }
    pilula(parOrdenado pos, int valor, int tempo){
        super(pos, valor);
        powerUpTempo = tempo;
    }
    public void setTempo(int tempo){
        powerUpTempo = tempo;
    }
    public int getTempo(){
        return powerUpTempo;
    }
}
