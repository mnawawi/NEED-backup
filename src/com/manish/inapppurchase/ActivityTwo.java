package com.manish.inapppurchase;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.DigitalClock;

public class ActivityTwo
  extends Activity
{
  private WebView wv;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903041);
   // ((DigitalClock)findViewById(2131427464));
    this.wv = ((WebView)findViewById(2131427395));
    this.wv.getSettings().setJavaScriptEnabled(true);
    this.wv.getSettings().setBuiltInZoomControls(true);
    this.wv.loadUrl("http://miarania.com/shopping/en/");
    this.wv.setWebViewClient(new WebViewClient()
    {
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        paramAnonymousWebView.loadUrl(paramAnonymousString);
        return true;
      }
    });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131361793, paramMenu);
    return true;
  }
}


/* Location:           C:\Users\IRnawawi\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.manish.inapppurchase.ActivityTwo
 * JD-Core Version:    0.7.0.1
 */