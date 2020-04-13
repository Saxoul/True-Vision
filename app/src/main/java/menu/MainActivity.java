package menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.ar.sceneform.samples.hellosceneform.HelloSceneformActivity;

import org.tensorflow.lite.examples.detection.CameraActivity;
import org.tensorflow.lite.examples.detection.DetectorActivity;
import org.tensorflow.lite.examples.detection.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void changeActivity(View view){
        // We have to state that are intention is to open another Activity. We do so
        // by passing a Context and the Activity that we want to open

        Intent getNameScreenIntent = new Intent(this, DetectorActivity.class);

        // We ask for the Activity to start and don't expect a result to be sent back
        // startActivity(getNameScreenIntent);

        // We use startActivityForResult when we expect a result to be sent back

        final int result = 1;

        // To send data use putExtra with a String name followed by its value

        getNameScreenIntent.putExtra("callingActivity", "MainActivity");
        startActivity(getNameScreenIntent);


    }

    public void changeActivityReality(View view) {
        Intent getNameScreenIntent = new Intent(this, HelloSceneformActivity.class);

        final int result = 1;

        getNameScreenIntent.putExtra("callingActivity", "MainActivity");
        startActivity(getNameScreenIntent);

    }
}
