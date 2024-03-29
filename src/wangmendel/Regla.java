/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wangmendel;

/**
 *
 * @author porto
 */
public class Regla implements Cloneable {

    private short blueRed;
    private short greenBlue;
    private short redGreen;
    private short consecuente;
    private Float peso;


    public Regla(short br, short gb, short rg, Float peso)
    {
        this.blueRed=br;
        this.greenBlue=gb;
        this.redGreen=rg;
        this.peso=peso;
    }

    public short getBlueRed() {
        return blueRed;
    }

    public short getConsecuente() {
        return consecuente;
    }

    public short getGreenBlue() {
        return greenBlue;
    }

    public Float getPeso() {
        return peso;
    }

    public short getRedGreen() {
        return redGreen;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public void setConsecuente(short consecuente) {
        this.consecuente = consecuente;
    }


    public static String construirID(short br, short gb, short rg)
    {
        String id;
        id=String.valueOf(br)+String.valueOf(gb)+String.valueOf(rg);
        
        return id;
    }
    

    public String construirID()
    {
        return construirID(this.blueRed, this.greenBlue, this.redGreen);
    }

    @Override
    public Object clone()
    {
        Object clon=null;
        try{
            clon=super.clone();

        }catch (CloneNotSupportedException cne){
            System.out.println("Error al intentar clonar el objeto Regla, operación no soportada");
        }
        return clon;
    }

}
