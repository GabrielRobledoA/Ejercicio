
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Robledo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehiculo> ListaVehiculos = new ArrayList<Vehiculo>();
        CargarVehiculos(ListaVehiculos);
        MostrarVehiculos(ListaVehiculos);        
        OrdenarMostrar(ListaVehiculos);
    }

    public static void CargarVehiculos(ArrayList<Vehiculo> lv)
    {
        lv.add(new Auto("Peugeot", "206", 4, 200000));
        lv.add(new Moto("Honda", "Titan", 125, 60000));
        lv.add(new Auto("Peugeot", "208", 5, 250000));
        lv.add(new Moto("Yamaha", "YBR", 160, 80500.50));
    }
    
    public static void MostrarVehiculos(ArrayList<Vehiculo> lv)
    {
        int minId = 0, maxId = 0, conYId = -1;
        double min = 0, max = 0;
        for(int i = 0; i < lv.size(); i++)
        {
            
            System.out.println(lv.get(i).toString());
            double precio = lv.get(i).GetPrecio();
            String modelo = lv.get(i).GetModelo();
            if(i == 0) min = precio;
            if(min > precio) { minId = i; min = precio; }
            if(max < precio) { maxId = i;  max = precio; }
            if(modelo.contains("Y")) conYId = i;
            
        }
        System.out.println("=================================================================");
        System.out.println("Vehículo más caro: " + lv.get(maxId).GetMarca() + " " + lv.get(maxId).GetModelo());
        System.out.println("Vehículo más barato: " + lv.get(minId).GetMarca() + " " + lv.get(minId).GetModelo());
        if(conYId == -1) System.out.println("Vehículo que contiene en el modelo la letra Y: No se encontraron.");
        else System.out.println("Vehículo que contiene en el modelo la letra Y: " + lv.get(conYId).GetMarca() + " " + lv.get(conYId).GetModelo()
                            + " $" + lv.get(conYId).GetPrecio());
    }
    
    public static void  OrdenarMostrar(ArrayList<Vehiculo> lv)
    {
        for(int i = 0; i < lv.size(); i++)
        {
            for(int x = i+1; x < lv.size(); x++)
            {
                if(lv.get(i).GetPrecio() < lv.get(x).GetPrecio())
                {
                    Vehiculo aux = lv.get(i);
                    lv.set(i, lv.get(x));
                    lv.set(x, aux);
                }
            }
        }
        System.out.println("=================================================================\nVehículos ordenados por precio de mayor a menor:");
        for(int i = 0; i < lv.size(); i++) System.out.println(lv.get(i).GetMarca() + " " + lv.get(i).GetModelo());
    }
}
