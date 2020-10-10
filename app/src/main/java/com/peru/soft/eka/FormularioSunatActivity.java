package com.peru.soft.eka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.peru.soft.eka.services.UserServiceI;
import com.peru.soft.eka.services.UserServices;
import com.peru.soft.eka.util.beans.UserBean;

public class FormularioSunatActivity extends AppCompatActivity {

    UserServiceI userServiceI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_sunat);

        userServiceI = new UserServices();

        EditText editTextRuc = findViewById(R.id.editTextRuc);
        EditText editTextRazonSocial = findViewById(R.id.editTextRznSocial);
        EditText editTextUsuarioSol = findViewById(R.id.editTextUsuarioSol);
        EditText editTextClaveSol = findViewById(R.id.editTexClaveSol);
        EditText editTextNombreComercial = findViewById(R.id.editTextNombreComercial);
        EditText editTextUbigeo = findViewById(R.id.editTextUbigeo);
        EditText editTextDireccion = findViewById(R.id.editTextDireccion);
        EditText editTextUrbanizacion = findViewById(R.id.editTextUrbanizacion);
        EditText editTextDepartamento = findViewById(R.id.editTextDepartamento);
        EditText editTextProvincia = findViewById(R.id.editTextProvincia);
        EditText editTextDistrito = findViewById(R.id.editTextDistrito);
        Switch switchProduccion = findViewById(R.id.switchProduccion);

        Button buttonGrabar = findViewById(R.id.buttonGrabar);
                buttonGrabar.setOnClickListener( g -> {
                    UserBean userBean = new UserBean();
                             userBean.setNumeroRuc(editTextRuc.getText().toString());
                             userBean.setRazonSocial(editTextRazonSocial.getText().toString());
                             userBean.setUsuarioSol(editTextUsuarioSol.getText().toString());
                             userBean.setClaveSol(editTextClaveSol.getText().toString());
                             userBean.setNombreComercial(editTextNombreComercial.getText().toString());
                             userBean.setUbigeo(editTextUbigeo.getText().toString());
                             userBean.setDireccion(editTextDireccion.getText().toString());
                             userBean.setUrbanizacion(editTextUrbanizacion.getText().toString());
                             userBean.setDepartamento(editTextDepartamento.getText().toString());
                             userBean.setProvincia(editTextProvincia.getText().toString());
                             userBean.setDistrito(editTextDistrito.getText().toString());
                             userBean.setProduccion(switchProduccion.isActivated());
                 userServiceI.addUser(userBean);

    });
    }
}