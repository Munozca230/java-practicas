/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Mavenproject1 {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int horarioEstudiante=0,horarioEstudiante2 = 0;
    int codigoCurso;
    String nombreCurso = "";
    int horarioCurso = 0;
    String profeCurso = "";
    int aulaCurso = 0;
    int estudiantesMatriculados = 0;
    boolean existeCurso = true;
    boolean matricular = true;
    
    while (matricular) {
        System.out.println("Ingrese codigo de curso");
        codigoCurso = sc.nextInt();
        sc.nextLine(); // Para limpiar el buffer despues de leer un int
        
        switch (codigoCurso) {
            case 111 -> {
                nombreCurso="DB";
                horarioCurso=8;
                profeCurso="Juan Albeiro";
                aulaCurso=101;
                estudiantesMatriculados=12+1;
                horarioEstudiante=8;
            }
            
            case 112 -> {
                nombreCurso="HTML y CSS";
                horarioCurso=8;
                profeCurso="José Muñoz";
                aulaCurso=102;
                estudiantesMatriculados=18+1;
                horarioEstudiante2=8;
            }
                
            default -> existeCurso=false;
        }
        
        if(horarioEstudiante2==horarioEstudiante) {
            System.out.println("ya tienes ese horario ocupado");
        } else {
            if(existeCurso) {
                System.out.println("Sus datos de curso son: nombre de curso: "+ nombreCurso + ", su horario es: "+ horarioCurso +", el profesor del curso es: "+ profeCurso +" y su aula es: "+ aulaCurso);
            } else {
                System.out.println("Ese curso no existe");
            }
            }
        
        System.out.println("Quieres agregar otro curso?");
        System.out.println("Escriba y o n");
        
        String respuesta = sc.nextLine();
        
        switch (respuesta) {
            case "y" -> matricular = true;
            case "n" -> matricular = false;
        }
    }
}}