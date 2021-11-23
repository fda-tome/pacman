/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;
import java.lang.Math;
/**
 *
 * @author nosf
 */
public class parOrdenado {
    private double x;
    private double y;
    parOrdenado(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getDist(parOrdenado ponto){
        return(Math.sqrt(Math.pow(ponto.x - x, 2)+Math.pow(ponto.y - y, 2)));
    }
}
