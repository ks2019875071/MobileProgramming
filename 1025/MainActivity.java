package com.cookandroid.study_1025;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtAngle;
    ImageView imageView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("toast");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.info_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast numMsg = Toast.makeText(MainActivity.this, "2019875071", Toast.LENGTH_SHORT);
        Toast nameMsg = Toast.makeText(MainActivity.this, "허 세연", Toast.LENGTH_SHORT);
        Toast infoMsg = Toast.makeText(MainActivity.this, "2019875071 허세연", Toast.LENGTH_SHORT);

        Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
        int xOffset = (int) (Math.random() * display.getWidth());
        int yOffset = (int) (Math.random() * display.getHeight());

        switch (item.getItemId()) {
            case R.id.number:
                numMsg.setGravity(Gravity.TOP | Gravity.LEFT, xOffset, yOffset);
                numMsg.show();
                return true;
            case R.id.name:
                nameMsg.setGravity(Gravity.TOP | Gravity.LEFT, xOffset, yOffset);
                nameMsg.show();
                return true;
            case R.id.info:
                infoMsg.setGravity(Gravity.TOP | Gravity.LEFT, xOffset, yOffset);
                infoMsg.show();
                return true;
        }
        return false;
    }
}
