package com.example.dialogfragment01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Fragment1 dialogFragment = new Fragment1();
        dialogFragment.show(getSupportFragmentManager(), "MojDialogFragment");

    }

   // private FragmentManager ChildFragmentManager() {    }

    public void PrzyciskDialog(int whichButton){
        if(whichButton == DialogInterface.BUTTON_POSITIVE)
            Toast.makeText(this, "Wciśnięto OK", Toast.LENGTH_SHORT).show();
        else if(whichButton== DialogInterface.BUTTON_NEGATIVE)
            Toast.makeText(this, "Wciśnięto ANULUJ",Toast.LENGTH_SHORT).show();
    }
    public void BrakOdpowiedzi(){
        Toast.makeText(this,"Nie udzielono odpowiedzi",Toast.LENGTH_SHORT).show();
    }
}