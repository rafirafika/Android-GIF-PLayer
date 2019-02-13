package com.gifplayer.wiwitsari.gifplayer;
import android.os.Bundle;
import android.webkit.WebView;
import android.app.Activity;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import java.io.IOException;
import java.io.InputStream;
import android.widget.Button;
import com.gifplayer.wiwitsari.gifplayer.GIFPlayer;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InputStream stream = null;
        try {
            stream = getAssets().open("PinkGirl.gif");
        } catch (IOException e) {
            e.printStackTrace();
        }

        final GIFPlayer view = new GIFPlayer(this, stream);
        setContentView(view);
    }
}
