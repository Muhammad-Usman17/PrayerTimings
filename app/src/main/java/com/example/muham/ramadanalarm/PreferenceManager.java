package com.example.muham.ramadanalarm;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {
    private SharedPreferences preferences;
    private SharedPreferences.Editor spEditor;
    private int count;


    private static PreferenceManager instance = null;

    private PreferenceManager() {
    }

    public static PreferenceManager getInstance() {

        if (instance == null)
            instance = new PreferenceManager();
        return instance;
    }

    public void setArray(String arrayName,String[] array,  Context mContext) {

        SharedPreferences prefs = mContext.getSharedPreferences("preferencename",  Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(arrayName +"_size", array.length);
        for(int i=0;i<array.length;i++)
            editor.putString(arrayName + "_" + i, array[i]);
        editor.apply();
    }
    public String[] getArray(String arrayName, Context mContext) {

        SharedPreferences prefs = mContext.getSharedPreferences("preferencename",  Context.MODE_PRIVATE);
        int size = prefs.getInt(arrayName + "_size", 0);
        String array[] = new String[size];
        for(int i=0;i<size;i++)
            array[i] = prefs.getString(arrayName + "_" + i, null);
        return array;
    }

    public void setString(String name,String value, Context context) {

        preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        spEditor = preferences.edit();
        spEditor.putString(name, value);
        spEditor.apply();
    }
    public String getString(String name, Context context) {

        preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        return preferences.getString(name,null);
    }

    public void setNumber(String name,int value, Context context) {

        preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        spEditor = preferences.edit();
        spEditor.putInt(name, value);
        spEditor.apply();
    }

    public int getNumber(String name, Context context) {

        preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        return preferences.getInt(name,0);
    }

    public int getLength(String name, Context context) {

        preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        count = preferences.getInt("count", 0);
        return count;
    }

    public void removeData(String name, String key, Context context) {

        preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        spEditor = preferences.edit();
        spEditor.remove(key);
        spEditor.apply();
    }


}