package jmendez.escoladeltreball.org.intentdemo1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button button;
    Intent originalIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener((View view) -> showBrowser() );

        originalIntent = getIntent();
    }

    /*
    Implicit intent
    
     */
    private void showBrowser() {
        String url = originalIntent.getStringExtra(Intent.EXTRA_COMPONENT_NAME);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
