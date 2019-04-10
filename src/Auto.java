/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Robledo
 */
public class Auto extends Vehiculo {
    
    public Auto()
    {
        
    }
    
    public Auto(String marca, String modelo, int cantidadpuertas, double precio)
    {
        this.CargarVehiculo(marca, modelo, precio);
        this.CantidadPuertas = cantidadpuertas;
    }
    public int CantidadPuertas;
    public int GetCantidadPuertas() {  return CantidadPuertas; }
    
        public String toString (){
            return "Marca: " + this.GetMarca() + " // Modelo: " + this.GetModelo() + " // Puertas: " + CantidadPuertas + " // Precio: $" + this.GetPrecio();
    }
    
        
}
