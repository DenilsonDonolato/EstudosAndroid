package com.example.funcionalidades;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class InternetStatus extends AsyncTask<Void,Void,Boolean> {

    private Consumer mConsumer;

    public interface Consumer {
        boolean accept(Boolean internet);
    }

    InternetStatus(Consumer consumer){
        mConsumer = consumer;
        execute();
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        try {
            Socket sock = new Socket();
            sock.connect(new InetSocketAddress("8.8.8.8", 53), 1500);
            sock.close();
            Log.e("Con","verdadeiro");
            return true;
        } catch (IOException e) {
            Log.e("Con","falso");
            return false;
        }
    }

    @Override protected void onPostExecute(Boolean internet) {
        mConsumer.accept(internet);
    }
}
