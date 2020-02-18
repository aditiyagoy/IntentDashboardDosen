package com.example.dashboarddosen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener{
    private Button btnMoveActivity;
    private Button btnMoveWithDataActivity;
    private Button btnMoveWithObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveActivity = (Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
        btnMoveWithDataActivity = (Button)findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);
        btnMoveWithObject = (Button)findViewById(R.id.btn_move_activity_object);
        btnMoveWithObject.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this,
                        MoveWithData.class);
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_NAME,
                        "Dosen");
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_AGE,5);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_move_activity_object:
                Person mPerson = new Person();
                mPerson.setName("Dosen");
                mPerson.setAge(50);
                mPerson.setEmail("fasilkom@gmail.com");
                mPerson.setCity("Karawang");
                Intent moveWithObjectIntent = new Intent(MainActivity.this,
                        MoveWithObject.class);
                moveWithObjectIntent.putExtra(MoveWithObject.EXTRA_PERSON, mPerson);
                startActivity(moveWithObjectIntent);
                break;
        }
    }

}