package com.example.aplikasisederhana;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText Nama, JenisKelamin, Umur, Hobi;
	TextView Hnm, Hjk, Humur, Hhobi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Nama = (EditText)findViewById(R.id.txtNama);
        JenisKelamin = (EditText)findViewById(R.id.txtJnsKelamin);
        Umur = (EditText)findViewById(R.id.txtUmur);
        Hobi = (EditText)findViewById(R.id.txtHobi);
        
        
        Hnm = (TextView)findViewById(R.id.txtHnm);
        Hjk = (TextView)findViewById(R.id.txtHjk);
        Humur = (TextView)findViewById(R.id.txtHumur);
        Hhobi = (TextView)findViewById(R.id.txtHHobi);
    }
    
    
    public void BtnSimpan (View v){
    	
    	String nama, jk, ur, hbi;
    	
    	nama = Nama.getText().toString();
    	jk = JenisKelamin.getText().toString();
    	ur = Umur.getText().toString();
    	hbi = Hobi.getText().toString();
    	
    	
    	Hnm.setText(nama);
    	Hjk.setText(jk);
    	Humur.setText(ur);
    	Hhobi.setText(hbi);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
