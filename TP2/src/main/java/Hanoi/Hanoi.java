/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hanoi;
import tp2.PileEntiers;

/**
 *
 * @author Alexandre
 */
public class Hanoi {
    private Integer iDiameter;
    public PileEntiers iPE1;
    public PileEntiers iPE2;
    public PileEntiers iPE3;
    
    public Hanoi(){
    iPE1= new PileEntiers();
    iPE2= new PileEntiers();
    iPE3= new PileEntiers();
    }
    
    public void setDiameter(Integer iInt){
    iDiameter=iInt;
    }
    
    public Integer getDiameter(){
    
        return iDiameter;
    }
    
    
}
