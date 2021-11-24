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
public class fruta extends consumivel{
    private String tipo;
    fruta(parOrdenado pos){
        super(pos);
    }
    fruta(parOrdenado pos, int valor){
        super(pos, valor);
    }
    fruta(parOrdenado pos, int valor, String tipo){
        super(pos, valor);
        this.tipo = tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
}
