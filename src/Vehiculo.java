/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Robledo
 */
public class Vehiculo {
    private String Marca;
    public String GetMarca() { return Marca; }
    private String Modelo;
    public String GetModelo() { return Modelo; }
    private double Precio;
    public double GetPrecio() { return Precio; }
    
    public void CargarVehiculo(String marca, String modelo, double precio)
    {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Precio = precio;
    }
}
