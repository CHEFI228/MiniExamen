/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itsmigra1;

/**
 *
 * @author luisa
 */
public class COORDINADOR implements COORDINA, SOCIALIZAN {
@Override
    public void socializar(){
        System.out.println("El coordinador socializa con los alumnos y docentes");
    }
@Override
    public void coordina(){
        System.out.println("El coordinador lleva el control");
    }
}