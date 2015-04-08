package com.example.erika.proyectofinal;

/**
 * Created by Jared on 08/04/2015.
 */
public class Product {

    private int _id;
    private String _nombre;
    private int _edad;
    private String _mail;

    public Product() {

    }

    public Product(int id, String nombre, int edad, String mail) {
        this._id = id;
        this._nombre = nombre;
        this._edad = edad;
        this._mail = mail;
    }

    public Product(String nombre, int edad, String mail) {
        this._nombre = nombre;
        this._edad = edad;

        this._mail = mail;
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


    public String getMail() {
        return _mail;
    }

    public void setMail(String _mail) {
        this._mail= _mail;
    }
}
