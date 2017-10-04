package jmendez.escoladeltreball.org.intentdemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener((View view) -> switchActivity());

    }

    /*
    This method calls the SecondActivity
    Intent: asynchronous messages which allow application components to request functionality
    from another Android component

    - Implicit: Diem què ha de fer i Android es busca la vida
    - Explicit: Diem exactament què ha de fer
     */
    private void switchActivity() {

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Intent.EXTRA_COMPONENT_NAME, "http://www.escoladeltreball.org");
        startActivity(intent);

    }
}
