/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author ThinkPad
 */

public class ApDung {
    public static void main(String[] args) {
        DSNV ds = new DSNV();
        ds.nhapDS();
        System.out.println("Ty le QL / NV: " + ds.tyLe() +"%");
    }
}
