/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsc;
/**
 *
 * @author USUARIO
 */
public class Articulos {
    
   private String name;
   private int cDate;
   private int size;
   private short duration;
   private String cat;
   
    public Articulos(String nombre, int fechaCad, int contenido, String categoria )
    {
        name=nombre;
        cDate=fechaCad;
        size=contenido;
        cat=categoria;
    
    }
    
    public String getNombre()
    {
        String nombre;
        nombre=name;
        return nombre;
    
    }
    
    public void setNombre(String nombre)
    {
        name=nombre;
        
    }
    
    public int getCdate()
    {
        int fecha;
        fecha=cDate;
        return fecha;
        
    }
    
    public void setCdate(int fechaC)
    {
        cDate=fechaC;
    }
    
    public int getSize()
    {
        int contenido;
        contenido=size;
        return contenido;
    }
    
    public void setSize(int contenido)
    {
        size=contenido;
    }
    
    public int getDuration()
    {
        int duracion;
        duracion=duration;
        return duracion;
              
    }
    
    public String getCat()
    {
        String categoria;
        categoria=cat;
        return categoria;
    }
    
    public void setCat(String categoria)
    {
        cat=categoria;
    }
}




