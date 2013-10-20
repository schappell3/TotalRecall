package edu.vt.cs5744.android.totalrecall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import android.os.AsyncTask;
import android.util.Log;


public class AccessDataGov extends AsyncTask<Void, Void, String>
{
    protected String doInBackground(Void...voids) 
    {
        try
        {
            URL dataGov = new URL("http://api.usa.gov/recalls/search.json?sort=date");
            BufferedReader in = new BufferedReader(new InputStreamReader(dataGov.openStream())); 
            String inputLine = in.readLine();
               
            in.close();
            return inputLine;
        }
        catch(Exception e)
        {
            Log.e("Error_Message", "Problem connecting" + e.toString());
            return null;
        }    
    }       
}