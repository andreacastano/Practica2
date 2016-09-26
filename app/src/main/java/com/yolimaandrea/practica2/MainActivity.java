package com.yolimaandrea.practica2;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String usuario, contrasena, rcontrasena, email, sexo, fechaNac, lugarNac, hobbies;

    TextView tRespuesta;
    EditText eUsuario,eContrasena, erContrasena, eMail;
    RadioButton rMasculino, rFemenino;
    CheckBox chCine,chNatacion,ChVideoJuegos,chFutbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tRespuesta = (TextView)findViewById(R.id.Respuesta);
        eUsuario = (EditText) findViewById(R.id.eUsuario);
        eContrasena = (EditText) findViewById(R.id.eContrasena);
        erContrasena = (EditText) findViewById(R.id.erContrasena);
        eMail = (EditText) findViewById(R.id.eCorreo);
    }
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rFemenino:
                if (checked)
                    sexo="Femenino";
                break;
            case R.id.rMasculino:
                if (checked)
                    sexo="Masculino";
                break;
        }
    }

    public void onButtonClicked(View view){
    usuario= eUsuario.getText().toString();
        contrasena = eContrasena.getText().toString();
        rcontrasena = erContrasena.getText().toString();
        if (contrasena.equals(rcontrasena)){
    tRespuesta.setText("Usuario: "+usuario+" Contraseña:"+contrasena+"Mail: "+email+"Sexo: "+sexo);

        }else

        Toast.makeText(getApplication(), "Contraseñas no coinciden", Toast.LENGTH_SHORT).show();

}


    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }




    public void onButtonClicked(View view){
        usuario=eUsuario.getText().toString();
        contrasena=eContrasena.getText().toString();
        rcontrasena=erContrasena.getText().toString();
        email=eMail.getText().toString();
        if(contrasena.equals(rcontrasena))
]
    }



