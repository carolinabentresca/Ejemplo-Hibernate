package Dao;
// Generated 08/01/2022 20:55:19 by Hibernate Tools 4.3.1



/**
 * Producto1 generated by hbm2java
 */
public class Producto1  implements java.io.Serializable {


     private int id;
     private String marca;
     private String modelo;
     private String color;
     private Double precio;
     private Double cuota;

    public Producto1() {
    }

	
    public Producto1(int id) {
        this.id = id;
    }
    public Producto1(int id, String marca, String modelo, String color, Double precio, Double cuota) {
       this.id = id;
       this.marca = marca;
       this.modelo = modelo;
       this.color = color;
       this.precio = precio;
       this.cuota = cuota;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public Double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Double getCuota() {
        return this.cuota;
    }
    
    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }




}


