package com.example.trabajopractico1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {

   @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Recibiste un mensaje", Toast.LENGTH_LONG).show();

       }
    }