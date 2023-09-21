/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsvid1;

import java.util.ArrayList;
import mascotaApp_servicios.ServicioMascota;

/**
 *
 * @author diego
 */
public class CollectionsVid1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioMascota masServ = new ServicioMascota();
        masServ.crearMascota();
        masServ.fabricaMascotas(150);
        masServ.mostrarMascotas();
    }
    
}
