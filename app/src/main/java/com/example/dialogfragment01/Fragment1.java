package com.example.dialogfragment01;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class Fragment1  extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState){
        String tytul= "To jest Tytuł okna dialogowego";
        String pytanie ="Treść pytania?";
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                .setIconAttribute(android.R.attr.alertDialogIcon)
                .setTitle(tytul)
                .setMessage(pytanie)
                .setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int whichButton){
                        ((MainActivity)getActivity())
                                .PrzyciskDialog(whichButton);
                    }
                })
                .setNegativeButton("Anuluj",
                        new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int whichButton){
                        ((MainActivity) getActivity())
                                .PrzyciskDialog(whichButton);
                    }
                        });
        AlertDialog alert =builder.create();
        return alert;
    }
    @Override
    public void onCancel (DialogInterface dialog){
        ((MainActivity)getActivity()).BrakOdpowiedzi();
    }

    public void show(FragmentManager fragmentManager, String mojDialogFragment) {
    }
}
