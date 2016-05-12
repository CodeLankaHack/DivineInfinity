package divineintinity.tokka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button for the users to set an new alarm notification

        Button alarm_set = (Button) findViewById(R.id.alarm_set);

    }
}
