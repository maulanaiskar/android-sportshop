package com.example.sportshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity{

    public static final String EXTRA_NAME_ITEM = "extra_name_item";
    public static final String EXTRA_DETAIL_ITEM = "extra_detail_item";
    public static final String EXTRA_IMG_ITEM = "extra_img_item";
    public static final String EXTRA_PRICE_ITEM = "extra_price_item";
    public static final String EXTRA_ULASAN_ITEM = "extra_ulasan_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tv_name = findViewById(R.id.tv_item_name);
        TextView tv_detail = findViewById(R.id.tv_item_detail);
        ImageView iv_photo = findViewById(R.id.img_item_photo);
        TextView tv_price = findViewById(R.id.tv_item_price);
        TextView tv_ulasan = findViewById(R.id.tv_item_ulasan);

        Button btn_fav = findViewById(R.id.btn_set_favorite);
        Button btn_buy = findViewById(R.id.btn_set_buy);

        TextView colorBlack = findViewById(R.id.black);
        TextView colorBlue = findViewById(R.id.blue);
        TextView colorRed = findViewById(R.id.red);

        final String name = getIntent().getStringExtra(EXTRA_NAME_ITEM);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL_ITEM);
        int photo = getIntent().getIntExtra(EXTRA_IMG_ITEM, 0);
        String price = getIntent().getStringExtra(EXTRA_PRICE_ITEM);
        String ulasan = getIntent().getStringExtra(EXTRA_ULASAN_ITEM);

        tv_name.setText(name);
        tv_detail.setText(detail);
        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(150, 220))
                .into(iv_photo);
        tv_price.setText(price);
        tv_ulasan.setText(ulasan);

        btn_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Detail.this, "Favorit " + name, Toast.LENGTH_SHORT).show();
            }
        });

        btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Detail.this, name + " telah dimasukkan ke keranjang", Toast.LENGTH_SHORT).show();
            }
        });

        colorBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Detail.this, "Hitam dipilih", Toast.LENGTH_SHORT).show();
            }
        });

        colorBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Detail.this, "Biru dipilih", Toast.LENGTH_SHORT).show();
            }
        });

        colorRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Detail.this, "Merah dipilih", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
