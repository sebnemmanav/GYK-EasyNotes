package com.erenutku.easynotes.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.erenutku.easynotes.FirstFragment;
import com.erenutku.easynotes.R;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mBnvMain;
    private FragmentManager mFragmentManager;
    private FloatingActionButton faNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        faNote = (FloatingActionButton) findViewById(R.id.faNote);
        faNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NoteDetailsActivity.class));
            }
        });
        // Write a message to the database
        //FirebaseDatabase database = FirebaseDatabase.getInstance();

       // database.getReference("Notes").child("Note3").setValue(new NoteModel("Başlık3","İçerik3",true));
       /* DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello");

        database.getReference("oyun").child("oyun1").setValue("oyun1 içeriği");
        database.getReference("oyun").child("oyun2").setValue("oyun2 içeriği");
        database.getReference("oyun").child("oyun3").setValue("oyun3 içeriği");
        */
    }

    private void initViews() {
        mBnvMain = (BottomNavigationView) findViewById(R.id.bnvMain);

        final FirstFragment fragment1 = FirstFragment.newInstance("Hoşgeldiniz");
        final FirstFragment fragment2 = FirstFragment.newInstance("İkinci Fragment");
        mFragmentManager = getSupportFragmentManager();
        mFragmentManager.beginTransaction().replace(R.id.fMain, fragment1).commit();

        mBnvMain.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_notes:
                        mFragmentManager.beginTransaction().replace(R.id.fMain, fragment1).commit();
                        break;
                    case R.id.action_likes:
                        mFragmentManager.beginTransaction().replace(R.id.fMain, fragment2).commit();
                        break;
                    case R.id.action_credit:
                        break;
                }
                return true;
            }
        });
    }
}
