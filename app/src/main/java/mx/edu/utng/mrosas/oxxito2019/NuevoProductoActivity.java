package mx.edu.utng.mrosas.oxxito2019;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NuevoProductoActivity extends AppCompatActivity {
    private EditText txtCodigo;
    private EditText txtProducto;
    private EditText txtPrecio;
    private EditText txtExistencia;
    private EditText txtFechaCaducidad;
    private Button  btnGuardar;
    private Button btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nuevo_producto);
        txtCodigo = (EditText) findViewById(R.id.txt_codigo);
        txtProducto = (EditText) findViewById(R.id.txt_producto);
        txtPrecio = (EditText) findViewById(R.id.txt_precio);
        txtExistencia = (EditText) findViewById(R.id.txt_existencia);
        txtFechaCaducidad = (EditText) findViewById(R.id.txt_fecha_caducidad);

        btnGuardar = (Button) findViewById(R.id.btn_Guardar);
        btnCancelar = (Button) findViewById(R.id.btn_Cancelar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Guardando...", Toast.LENGTH_LONG).show();
                System.exit(0);
            }
        });
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cancelando...", Toast.LENGTH_LONG).show();
                System.exit(0);
            }
        });
        }
        public void limpiarRegostro(){
        txtCodigo.setText("");
        txtProducto.setText("");
        txtPrecio.setText("");
        txtExistencia.setText("");
        }
    }

