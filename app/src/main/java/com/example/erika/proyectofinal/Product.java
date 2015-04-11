package com.example.erika.proyectofinal;
public class Product {

    private int _id;
    private String _nombre;
    private int _edad;
    private String _activo;
    private float _temp;

    public Product() {

    }

    public Product(int id, String nombre, String activo, int edad, float temp) {
        this._id = id;
        this._nombre = nombre;
        this._edad = edad;
        this._activo = activo;
        this._temp = temp;
    }

    public Product(String nombre, String activo, int edad, float temp) {
        this._nombre = nombre;
        this._edad = edad;
        this._activo = activo;
        this._temp = temp;
    }

    public void setID(int id) {
        this._id = id;
    }

    public int getID() {
        return this._id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int _edad) {
        this._edad = _edad;
    }

    public String getActivo() {
        return _activo;
    }

    public void setActivo(String _activo) {
        this._activo = _activo;
    }

    public float getTemp() {
        return _temp;
    }

    public void setTemp(float _temp) {
        this._temp = _temp;
    }
}


