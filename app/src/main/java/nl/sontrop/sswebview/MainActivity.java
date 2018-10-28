package nl.sontrop.sswebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());   // om er voor te zorgen dat het in mijn app en niet in browser app opend
                                                        // made some notes over om browser vragen hier: D:\ssWebView\aparte browser.docx
        webView.loadUrl("http://www.yahoo.com");

        WebSettings webSettings = webView.getSettings();    // settings ophalen
        webSettings.setJavaScriptEnabled(true);                                         // settings erop op los laten.
    }                                                       // een voorbeeld van een websetting

    @Override
    public void onBackPressed() {       // backbutton probleem :)
        if (webView.canGoBack()) {      // kunnen we terug of zijn we op de eerste site die we openden
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
