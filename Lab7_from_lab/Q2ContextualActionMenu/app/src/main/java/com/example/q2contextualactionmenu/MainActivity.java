package com.example.q2contextualactionmenu;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar tlb;
    ImageView menuIcon, displayImage;
    LinearLayout rootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        menuIcon = findViewById(R.id.menuIcon);
        displayImage = findViewById(R.id.displayicon);
        rootLayout = findViewById(R.id.rootLayout);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(view);}
        });
    }
    private void showPopupMenu(View view){
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                int itemId = item.getItemId();

                if (itemId == R.id.image1) {
                    displayImage.setImageResource(R.drawable.ic_launcher_foreground); // Add image1.png
                    displayImage.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "This is Image 1", Toast.LENGTH_SHORT).show();
                    return true;

                } else if (itemId == R.id.image2) {
                    displayImage.setImageResource(R.drawable.ic_launcher_background); // Add image2.png
                    displayImage.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "This is Image 2", Toast.LENGTH_SHORT).show();
                    return true;

                } else {
                    return false;
                }
            }
        });

        popupMenu.show();

    }
}
