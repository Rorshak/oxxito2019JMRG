package mx.edu.utng.mrosas.oxxito2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnInicializar;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inflate ---> Relacionar controles de la vista con la clase JAVA
        btnInicializar = (Button)findViewById(R.id.btn_inicializar_bd);
        btnRegistrar = (Button)findViewById(R.id.btn_registrar);

        //Registrar el escuchador
        btnInicializar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_inicializar_bd){
            try {
                Toast.makeText(getApplicationContext(),"Inicializada" ,Toast.LENGTH_LONG).show();
            } catch (Exception e){
                //En caso de error se muestra el mensaje en un dialogo
                Toast.makeText(getApplicationContext(),"Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                System.exit(0);
            }
        }else if (v.getId()==R.id.btn_registrar){
            Intent intProd = new Intent(getApplicationContext(), ListaProductosActivity.class);
            //Sw arranca la actividad
            startActivity(intProd);
        }

    }
}
