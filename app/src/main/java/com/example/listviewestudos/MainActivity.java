package com.example.listviewestudos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView minhaLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minhaLista = findViewById(R.id.listview);

        // Criação e instancia da lista da Lista
        List<String> list = new ArrayList<>();

        // Itens da lista add - Poderiamos também criar um array e apenas informar ele - Nesse caso pegamos uma lista vazia e add elementos a ela
        list.add("Preto");
        list.add("Verde");

        // Aqui setamos o adpter da nossa lista e definimos seu layout
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        minhaLista.setAdapter(arrayAdapter);

        // Aqui pegamos a posição dos itens na lista (I) e retornamos uma ação, nesse caso abrimos uma nova página com background diferente
        minhaLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    // Item de posição 1 Clicado -
                    startActivity(new Intent(MainActivity.this, PretoActivity.class));

                } else if (i == 1) {
                    // Item de posição 2 Clicado -
                    startActivity(new Intent(MainActivity.this, VerdeActivity.class));
                }
            }
        });
    }
}