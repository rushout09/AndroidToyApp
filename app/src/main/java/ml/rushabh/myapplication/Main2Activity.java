package ml.rushabh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if(getIntent().hasExtra("ml.rushabh.myapplication.MSG"))
        {
            TextView tv = (TextView) findViewById(R.id.displayMessage);
            String message = getIntent().getExtras().getString("ml.rushabh.myapplication.MSG");
            tv.setText(message);
        }
    }
}
