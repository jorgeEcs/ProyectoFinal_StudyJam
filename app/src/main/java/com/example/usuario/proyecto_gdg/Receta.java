package com.example.usuario.proyecto_gdg;

import java.io.Serializable;

/**
 * Created by Usuario on 27/12/2016.
 */

public class Receta implements Serializable {
    private String nombre;
    private String prepara;
    private String ing1;
    private String ing2;
    private String ing3;
    private String ing4;
    private String ing5;
    private String ing6;
    private String ing7;
    private String ing8;
    private String ing9;
    private String ing10;
    private String ing11;
    private String ing12;
    private String ing13;
    public Receta() {

    }

    public Receta(String nombre
            ,String prepara
            ,String ing1
            ,String ing2
            ,String ing3
            ,String ing4
            ,String ing5
            ,String ing6
            ,String ing7
            ,String ing8
            ,String ing9
            ,String ing10
            ,String ing11
            ,String ing12
            ,String ing13
    ) {
        this.nombre = nombre;
        this.prepara= prepara;
        this.ing1=ing1;
        this.ing2=ing2;
        this.ing3=ing3;
        this.ing4=ing4;
        this.ing5=ing5;
        this.ing6=ing6;
        this.ing7=ing7;
        this.ing8=ing8;
        this.ing9=ing9;
        this.ing10=ing10;
        this.ing11=ing11;
        this.ing12=ing12;
        this.ing13=ing13;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrepara() {
        return prepara;
    }

    public void setPrepara(String prepara) {
        this.prepara = prepara;
    }

    public String getIng1() {
        return ing1;
    }

    public void setIng1(String ing1) {
        this.ing1 = ing1;
    }

    public String getIng2() {
        return ing2;
    }

    public void setIng2(String ing2) {
        this.ing2 = ing2;
    }

    public String getIng3() {
        return ing3;
    }

    public void setIng3(String ing3) {
        this.ing3 = ing3;
    }

    public String getIng4() {
        return ing4;
    }

    public void setIng4(String ing4) {
        this.ing4 = ing4;
    }

    public String getIng5() {
        return ing5;
    }

    public void setIng5(String ing5) {
        this.ing5 = ing5;
    }

    public String getIng6() {
        return ing6;
    }

    public void setIng6(String ing6) {
        this.ing6 = ing6;
    }

    public String getIng7() {
        return ing7;
    }

    public void setIng7(String ing7) {
        this.ing7 = ing7;
    }

    public String getIng8() {
        return ing8;
    }

    public void setIng8(String ing8) {
        this.ing8 = ing8;
    }

    public String getIng9() {
        return ing9;
    }

    public void setIng9(String ing9) {
        this.ing9 = ing9;
    }

    public String getIng10() {
        return ing10;
    }

    public void setIng10(String ing10) {
        this.ing10 = ing10;
    }

    public String getIng11() {
        return ing11;
    }

    public void setIng11(String ing11) {
        this.ing11 = ing11;
    }

    public String getIng12() {
        return ing12;
    }

    public void setIng12(String ing12) {
        this.ing12 = ing12;
    }

    public String getIng13() {
        return ing13;
    }

    public void setIng13(String ing13) {
        this.ing13 = ing13;
    }
}
