package com.example.parcialii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private adapterEmpleado empleadoAdapter;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<empleadoclass> empleados = new ArrayList<>();
        empleados.add(new empleadoclass(R.drawable.imagen1, "Miguel Angel guzman", "Analista Programador", "JBC"));
        empleados.add(new empleadoclass(R.drawable.imagen2, "Carlos Lopez", "Asistente", "Hospital blue"));
        empleados.add(new empleadoclass(R.drawable.imagen3, "Sara Bonz", "Director", "Empresa C"));
        empleados.add(new empleadoclass(R.drawable.imagen4, "Liliana clarence", "Dise;adora de Producto", "Neumaticos Press"));
        empleados.add(new empleadoclass(R.drawable.imagen5, "Benito Peralta", "Supervisor de ventas", "Banco Nacional"));
        empleados.add(new empleadoclass(R.drawable.imagen6, "Juan Jaramillo", "CEO", "Empresa C"));
        empleados.add(new empleadoclass(R.drawable.imagen7, "Cristian Steps", "CTO", "Cooperativa Verde"));
        empleados.add(new empleadoclass(R.drawable.imagen8, "Alexa Giraldo", "Lead Programer", "Frutysofy"));
        empleados.add(new empleadoclass(R.drawable.imagen9, "Linda Murillo", "Directora de Marketing", "Seguros Boliver"));
        empleados.add(new empleadoclass(R.drawable.imagen10, "Lizeth Astrada", "CEO", "Consecionario Molotox"));


        adapterEmpleado adapterEmpleado = new adapterEmpleado(this, R.layout.activity_layoutempleado,empleados);

        listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapterEmpleado);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, persona.class);


                intent.putExtra("idEmpleado", position);


                startActivity(intent);
            }
        });
    }
}
