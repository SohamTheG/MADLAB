package com.example.q1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ConstraintLayout ct;
    ImageView ig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.hwtxt);
        ct = findViewById(R.id.main);
        ig = findViewById(R.id.imageView);
        registerForContextMenu(ig);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("System App");

        menu.add(0, v.getId(), 0, "Open");
        menu.add(0, v.getId(), 0, "Uninstall");
        menu.add(0, v.getId(), 0, "View Details");
    }
    public boolean onContextItemSelected(MenuItem item) {
        String title = item.getTitle().toString();

        switch (title) {
            case "Open":
                ct.setBackgroundColor(Color.YELLOW);
                break;
            case "Uninstall":
                ct.setBackgroundColor(Color.GRAY);
                break;
            case "View Details":
                ct.setBackgroundColor(Color.CYAN);
                break;
        }
        return true;
    }
}