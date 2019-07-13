package mx.edu.utng.mrosas.oxxito2019;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class ListaProductosActivity extends AppCompatActivity {
    private Button btnNuevo;
    private ListView lsvproducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);
        //inflate
        btnNuevo = (Button)findViewById(R.id.btn_agregar_producto);
        lsvproducto = (ListView)findViewById(R.id.lsv_productos);
        btnNuevo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intNuevoProducto = new Intent(getApplicationContext(),NuevoProductoActivity.class);
                startActivity(intNuevoProducto);

                   //Se arranca la actividad

            }
        });
    }
}
