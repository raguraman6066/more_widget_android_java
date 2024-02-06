package com.example.widgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //checkbox
CheckBox checkBox;
//radio group
    RadioGroup radioGroup;
    //spinner
    Spinner spinner;
    TimePicker timePicker;
    DatePicker datePicker;
    Button btn;

    ProgressBar progressBar;
    Button pBtn;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //checkbox
        checkBox=findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //radiobutton
        radioGroup=findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton=findViewById(checkedId);
                Toast.makeText(MainActivity.this, "You Selected "+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        //spinner
        String[] courses={"C++","Java","Python","Kotlin"};
        spinner=findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,courses);
spinner.setAdapter(adapter);


//time picker
//        timePicker=findViewById(R.id.timePicker);
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//                Toast.makeText(MainActivity.this, "Hour"+hourOfDay+" Minute"+minute, Toast.LENGTH_SHORT).show();
//            }
//        });



        //datepicker
//        datePicker=findViewById(R.id.datePicker);
//        btn=findViewById(R.id.showDate);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String date="date "+datePicker.getDayOfMonth();
//                String month="month "+datePicker.getMonth();
//                String year="year "+datePicker.getYear();
//                Toast.makeText(MainActivity.this, date+"/ "+month+"/ "+year, Toast.LENGTH_SHORT).show();
//            }
//        });

        progressBar=findViewById(R.id.progressbar);
        pBtn=findViewById(R.id.checkProgress);
        pBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i+=10;
                progressBar.setProgress(i);
            }
        });
    }
}