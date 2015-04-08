package com.example.erika.proyectofinal;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class cuenta extends ActionBarActivity {
    TextView lblNombre, lblEdad, lblMail, idView;
    EditText txtNombre, txtEdad, txtMail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);

        idView = (TextView) findViewById(R.id.idView);
        lblNombre = (TextView) findViewById(R.id.lblNombre);
        lblEdad = (TextView) findViewById(R.id.lblEdad);
        lblMail = (TextView) findViewById(R.id.lblMail);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtMail = (EditText) findViewById(R.id.txtMail);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cuenta, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void newProduct (View view){

        MyDBHandler dbHandler = new MyDBHandler(this,null,null,1);
        Product product = new Product(txtNombre.getText().toString(), Integer.parseInt(txtEdad.getText().toString()),txtMail.getText().toString());
        dbHandler.addProduct(product);
        lookupProduct(view);
        Toast.makeText(this, "Registro añadido.", Toast.LENGTH_SHORT).show();
    }
    public void lookupProduct (View view) {
        MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);

        Product product =
                dbHandler.findProduct(txtNombre.getText().toString());

        if (product != null) {
            idView.setText(String.valueOf(product.getID()));
            txtNombre.setText(product.getNombre());
            txtEdad.setText(String.valueOf(product.getEdad()));
            txtMail.setText(product.getMail());
        } else {
            Toast.makeText(this, "No se encontró el elemento.", Toast.LENGTH_SHORT).show();
        }
    }
    public void removeProduct (View view) {
        MyDBHandler dbHandler = new MyDBHandler(this, null,
                null, 1);

        boolean result = dbHandler.deleteProduct(
                txtNombre.getText().toString());

        if (result)
        {
            Toast.makeText(this, "Registro borrado.", Toast.LENGTH_SHORT).show();
            idView.setText("");
            txtNombre.setText("");
            txtEdad.setText("0");
            txtMail.setText("");
        }
        else
            Toast.makeText(this, "No se encontró el elemento.", Toast.LENGTH_SHORT).show();
    }
}

