package com.clicks.yogi.popup_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu pop = new PopupMenu(MainActivity.this,btn1);
                pop.getMenuInflater().inflate(R.menu.mypopupmenu,pop.getMenu());

                pop.setOnMenuItemClickListener(new PopupMenu
                        .OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this,"Clciked on"+item.getTitle(),
                                Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                pop.show();
            }
        });
    }
}