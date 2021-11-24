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
public class consumivel extends entidade{
    private int valorPontos;
    consumivel(parOrdenado pos, int valor){
        super(pos);
        valorPontos = valor; 
    }
    consumivel(parOrdenado pos){
        super(pos);
    }
    public void setPontos(int valor){
        valorPontos = valor;
    }
    public int getPontos(){
        return valorPontos;
    }
}
