package com.manish.inapppurchase;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;

public class CustomizeWebview
  extends FrameLayout
{
  private boolean mIsLoadFinish = false;
  private Button mNextBtn;
  private Button mPreBbn;
  private Button mReload;
  private WebView mWebView = new WebView(getContext());
  private WebViewClient mWebViewClient;
  private LinearLayout mWebViewControllerLn;
  
  public CustomizeWebview(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(this.mWebView);
    this.mReload = new Button(getContext());
    this.mReload.setText("");
    this.mReload.setBackgroundResource(2130837588);
    this.mReload.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    this.mNextBtn = new Button(getContext());
    this.mNextBtn.setText("");
    this.mNextBtn.setEnabled(false);
    this.mNextBtn.setBackgroundResource(2130837561);
    this.mNextBtn.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    this.mPreBbn = new Button(getContext());
    this.mPreBbn.setText("");
    this.mPreBbn.setBackgroundResource(2130837562);
    this.mPreBbn.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    this.mPreBbn.setEnabled(false);
    this.mWebViewControllerLn = new LinearLayout(getContext());
    this.mWebViewControllerLn.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
    this.mWebViewControllerLn.setOrientation(0);
    this.mWebViewControllerLn.setBackgroundColor(-16777216);
    this.mWebViewControllerLn.addView(this.mPreBbn);
    this.mWebViewControllerLn.addView(this.mNextBtn);
    this.mWebViewControllerLn.addView(this.mReload);
    addView(this.mWebViewControllerLn);
    this.mReload.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        CustomizeWebview.this.mWebView.reload();
        CustomizeWebview.this.enableControllerButton();
      }
    });
    this.mPreBbn.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        CustomizeWebview.this.mWebView.goBack();
        CustomizeWebview.this.enableControllerButton();
      }
    });
    this.mNextBtn.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        CustomizeWebview.this.mWebView.goForward();
        CustomizeWebview.this.enableControllerButton();
      }
    });
  }
  
  private void enableControllerButton()
  {
    if (this.mIsLoadFinish)
    {
      this.mReload.setEnabled(true);
      if (this.mWebView.canGoBack())
      {
        this.mPreBbn.setEnabled(true);
        this.mPreBbn.setBackgroundResource(2130837563);
      }
      while (this.mWebView.canGoForward())
      {
        this.mNextBtn.setEnabled(true);
        this.mNextBtn.setBackgroundResource(2130837560);
        return;
        //this.mPreBbn.setEnabled(false);
      }
      this.mNextBtn.setEnabled(false);
      return;
    }
    this.mPreBbn.setEnabled(false);
    this.mNextBtn.setEnabled(false);
  }
  
  public void loadUrl(String paramString)
  {
    this.mWebView.getSettings().setJavaScriptEnabled(true);
    this.mWebViewClient = new WebViewClient()
    {
      public void onPageFinished(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        CustomizeWebview.this.mIsLoadFinish = true;
        CustomizeWebview.this.enableControllerButton();
      }
      
      public void onPageStarted(WebView paramAnonymousWebView, String paramAnonymousString, Bitmap paramAnonymousBitmap) {}
      
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        return super.shouldOverrideUrlLoading(paramAnonymousWebView, paramAnonymousString);
      }
    };
    this.mWebView.setWebViewClient(this.mWebViewClient);
    this.mWebView.loadUrl(paramString);
  }
}


/* Location:           C:\Users\IRnawawi\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.manish.inapppurchase.CustomizeWebview
 * JD-Core Version:    0.7.0.1
 */