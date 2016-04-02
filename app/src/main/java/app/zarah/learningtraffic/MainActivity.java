package app.zarah.learningtraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //explicit การประกาศตัวแปร
    private ListView trafficListView;
    private Button AboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget การผูกความสัมพันของตัวแปร

        trafficListView = (ListView) findViewById(R.id.listView);
        AboutMeButton = (Button) findViewById(R.id.button);

        //การเก็บเหตุการณ์ จากการคลิ้ก
        AboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.mosquito);

                mediaPlayer.start();
                // onclick


            }


        });
    } //method
}//class
