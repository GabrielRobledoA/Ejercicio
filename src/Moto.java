/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Robledo
 */
public class Moto extends Vehiculo {
    
    public Moto(String marca, String modelo, int cilindrada, double precio)
    {
        this.CargarVehiculo(marca, modelo, precio);
        this.Cilindrada = cilindrada;
    } 
    
    public int Cilindrada;
    public int GetCilindrada() { return Cilindrada; }
    
        public String toString (){
            return "Marca: " + this.GetMarca() + " // Modelo: " + this.GetModelo() + " // Cilindrada: " + Cilindrada + "c // Precio: $" + this.GetPrecio();
    }
}
