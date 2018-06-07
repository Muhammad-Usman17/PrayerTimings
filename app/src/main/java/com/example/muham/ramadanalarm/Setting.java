package com.example.muham.ramadanalarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Setting extends AppCompatActivity {
    HashMap<String, Integer> calculationMethod ;
    ArrayList<String> methodArray;
    HashMap<String, Integer> School ;
    ArrayList<String> schoolArray;
    String CurrentMethod;
    String CurrentSchool;

    Spinner sp1,sp2;
    TextView tx1,tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        sp1=findViewById(R.id.spinner2);
        sp2=findViewById(R.id.spinner3);
        methodArray=new ArrayList<>();
        calculationMethod=new HashMap<>();
        School=new HashMap<>();
        schoolArray=new ArrayList<>();


        methodArray.add("Muslim World League");
        methodArray.add("Islamic Society of North America");
        methodArray.add("Egyptian General Authority of Survey");
        methodArray.add("Umm Al-Qura University, Makkah");
        methodArray.add("University of Islamic Sciences, Karachi");
        methodArray.add("Institute of Geophysics, University of Tehran");
        methodArray.add("Shia Ithna-Ashari, Leva Institute, Qum");
        methodArray.add("Gulf Region");
        methodArray.add("Kuwait");
        methodArray.add("Qatar");
        methodArray.add("Majlis Ugama Islam Singapura, Singapore");
        methodArray.add("Union Organization islamic de France");
        methodArray.add("Diyanet İşleri Başkanlığı, Turkey");

        calculationMethod.put("Muslim World League", 1);
        calculationMethod.put("Islamic Society of North America", 2);
        calculationMethod.put("Egyptian General Authority of Survey", 3);
        calculationMethod.put("Umm Al-Qura University, Makkah", 4);
        calculationMethod.put("University of Islamic Sciences, Karachi", 5);
        calculationMethod.put("Institute of Geophysics, University of Tehran", 6);
        calculationMethod.put("Shia Ithna-Ashari, Leva Institute, Qum", 7);
        calculationMethod.put("Gulf Region", 8);
        calculationMethod.put("Kuwait", 9);
        calculationMethod.put("Qatar", 10);
        calculationMethod.put("Majlis Ugama Islam Singapura, Singapore", 11);
        calculationMethod.put("Union Organization islamic de France", 12);
        calculationMethod.put("Diyanet İşleri Başkanlığı, Turkey", 13);


        schoolArray.add("Shafi");
        schoolArray.add("Hanafi");

        School.put("Shafi",0);
        School.put("Hanafi",1);

    }

}
