package com.example.muham.ramadanalarm;

import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiManager {

    public String getApiData(String ApiUrl) {
        String httpData = "";
        try {
            InputStream inputStream = null;
            HttpURLConnection httpURLConnection = null;
            try {
                URL url = new URL(ApiUrl);
                httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuffer = new StringBuilder();
                String line ;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuffer.append(line);
                }
                httpData = stringBuffer.toString();
                bufferedReader.close();
            } catch (Exception e) {
                Log.d(e.getMessage(), "doInBackground: ");
            } finally {
                inputStream.close();
                httpURLConnection.disconnect();

            }


        } catch (Exception e) {
            Log.d(e.getMessage(), "doInBackground: ");
        }
        return httpData;
    }
}
