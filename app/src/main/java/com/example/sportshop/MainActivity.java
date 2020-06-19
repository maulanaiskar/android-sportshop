package com.example.sportshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvItems;
    private ArrayList<Item> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvItems = findViewById(R.id.rv_item);
        rvItems.setHasFixedSize(true);

        list.addAll(ItemData.getListData());
        showRecyclerList();
    }

//      Pasang menu_main dengan 2 override di bawah
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//      Tambahkan method setMode
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

//    Bikin method setMode
    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_about:
                startActivity(new Intent(this, AboutActivity.class));
                break;
        }
    }

    private void showRecyclerList(){
        rvItems.setLayoutManager(new LinearLayoutManager(this));
        ListItemAdapter listItemAdapter = new ListItemAdapter(list);
        rvItems.setAdapter(listItemAdapter);
    }

}
