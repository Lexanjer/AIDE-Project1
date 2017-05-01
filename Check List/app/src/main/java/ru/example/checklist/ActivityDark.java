package ru.example.checklist;

import android.os.*;
import android.support.v7.app.*;
import android.util.*;
import android.widget.*;


public class ActivityDark extends AppCompatActivity {

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDark);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark);


				
				Toast.makeText(this, "Activity Dark "
                , Toast.LENGTH_LONG).show();
        Log.d(MainActivity.TAG, "Vcem privet---------   Activity Dark  -------- ");

				
			
    }
		
		
		
}


