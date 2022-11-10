/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception;

import javax.swing.JOptionPane;

public class PruebaExcepcion {

    public static void main(String args[]) {

        formatoNumero();
        desborde();
        aritmetico();
        Operaciones();

    }

//excepción sin tratar
    public static void formatoNumero() {
        int numero = 0;
        String cadena = " 1";
        try {
            numero = Integer.parseInt(cadena);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar una cadena en un entero");
        }

    }

    public static void desborde() {

        int v[] = new int[3];

        try {
            for (int i = 0; i < 5; i++) {
                v[i] = i;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El ciclo es mayor al numero de objetos del array");
        }
    }

    public static void aritmetico() {

        int numero = 5, resultado;

        try {
            resultado = numero / 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Un entero no se puede dividir por cero");
        }
    }

    public static void Operaciones() {

        String valor1, valor2, mensajeResultado = "";

        int numeroValor1=0, numeroValor2=0, resultado, resultado2, resultado3, resultado4, resultado5, opcion;

        boolean indBien = false;

        while (true) {
            indBien = false;
            while (indBien == false) {
                valor1 = JOptionPane.showInputDialog("Ingrese primer valor");
                valor2 = JOptionPane.showInputDialog("Ingrese segundo valor");
                indBien = true;
                try {

                    numeroValor1 = Integer.parseInt(valor1);
                    numeroValor2 = Integer.parseInt(valor2);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "\n\ndebe digitar valores numericos", "Mensaje de error al digitar", JOptionPane.ERROR_MESSAGE);
                    indBien = false;

                }

            }
            indBien = true;
            resultado = numeroValor1 + numeroValor2;
            resultado2 = numeroValor1 - numeroValor2;
            resultado3 = numeroValor1 * numeroValor2;

            mensajeResultado = "primer numero:" + numeroValor1 + "\nsegundo numero:" + numeroValor2 + "\n\nLas suma es:" + resultado + "\nla resta es: " + resultado2 + "\nla multiplicacion es:" + resultado3;

            if (numeroValor2 > 0) {
                resultado4 = numeroValor1 / numeroValor2;
                resultado5 = numeroValor1 % numeroValor2;

                mensajeResultado += "\n\nla división es :" + resultado4;
                mensajeResultado += "\nel residuo es :" + resultado5;

            }

            JOptionPane.showMessageDialog(null, mensajeResultado, "Resultados", JOptionPane.PLAIN_MESSAGE);

            opcion = JOptionPane.showConfirmDialog(null, "Confirme si desea realizar cálculos");
            

            if (opcion != 0) {
                break;

            }

        }
        System.exit(0);
    }

}
