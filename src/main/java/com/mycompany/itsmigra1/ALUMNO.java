/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itsmigra1;

/**
 *
 * @author luisa
 */
public class ALUMNO implements EVALUA, SOCIALIZAN {
@Override
    public void socializar(){
        System.out.println("El alumno socializa con sus compañeros y maestros");
    }
@Override
    public void evalua(){
        System.out.println("El alumno evalua al maestro");
    }
}