/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itsmigra1;

/**
 *
 * @author luisa
 */
public class DOCENTE implements SOCIALIZAN,EVALUA{
@Override
    public void socializar(){
        System.out.println("El docente socializa con los alumnos y el coordinador");
    }
@Override
    public void evalua(){
        System.out.println("El docente evalua al estudiante");
    }
}