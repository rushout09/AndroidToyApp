package ml.rushabh.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editMoney = (EditText) findViewById(R.id.editMoney);
                EditText editPersons = (EditText) findViewById(R.id.editPersons);
                int num1 = Integer.parseInt(editMoney.getText().toString());
                int num2 = Integer.parseInt(editPersons.getText().toString());
                float res = num1/num2;
                TextView Result = (TextView) findViewById(R.id.textView);
                Result.setText(res+"");
            }
        });
        Button dispMessage = (Button) findViewById(R.id.dispMessage);
        dispMessage.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent nextdisp = new Intent(getApplicationContext(),Main2Activity.class);
                nextdisp.putExtra("ml.rushabh.myapplication.MSG", "Result is created by Rushabh");
                startActivity(nextdisp);
            }
        });
        Button google = (Button) findViewById(R.id.Google);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address = "http://www.rushabh.ml";
                Uri webdress = Uri.parse(address);
                Intent navtogo = new Intent(Intent.ACTION_VIEW,webdress);
                if(navtogo.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(navtogo);
                }
            }
        });
    }

}
