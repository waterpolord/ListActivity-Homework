package com.proyectoclase.listactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        String[] cities = new String[]{"Santiago de los Caballeros","Buenos Aires","New York","La Vega","Londres","Nuevo Leon","Cali","Berlin","Tokyo","Seul","Sidney"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.activity_main,R.id.text,cities);
        setListAdapter(arrayAdapter);

        ListView listView = getListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String txt = ((TextView) view).getText().toString();
                //Snackbar.make(view,"Hola desde "+txt, BaseTransientBottomBar.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Ciudades.class);
                intent.putExtra("NOMBRE",txt);
                startActivity(intent);
            }
        });
    }
}