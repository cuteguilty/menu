package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = findViewById(R.id.selectedMenuItem);
        switch(id){
            case R.id.Camera_settings :
                headerView.setText("Camera");
                return true;
            case R.id.Video_settings:
                headerView.setText("Video");
                return true;
            case R.id.Copy_settings:
                Toast.makeText(this, "вы выбрали Copy", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Add_settings:
                    Toast.makeText(this, "вы выбрали Add", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Paste_settings:
                Toast.makeText(this, "вы выбрали Paste", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Help_settings:
                Toast.makeText(this, "вы выбрали Help", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Call_settings :
                //headerView.setText("Camera");
                Intent intent = new Intent(this, MainCall.class);
                //Intent intent = new Intent(LoginActivity.this, ChatListActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                headerView.setText("Переход");
                return true;
                case R.id.Email_settings :
                //headerView.setText("Camera");
                Intent intent2 = new Intent(this, Call.class);
                //Intent intent = new Intent(LoginActivity.this, ChatListActivity.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent2);
                headerView.setText("Переход");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}