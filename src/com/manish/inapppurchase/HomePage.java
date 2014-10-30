package com.manish.inapppurchase;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class HomePage
  extends TabActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(2130903042);
    TabHost localTabHost = getTabHost();
    TabHost.TabSpec localTabSpec1 = localTabHost.newTabSpec("PNL");
    TabHost.TabSpec localTabSpec2 = localTabHost.newTabSpec("N.E.E.D Donation");
    TabHost.TabSpec localTabSpec3 = localTabHost.newTabSpec("N.E.E.D Words");
    TabHost.TabSpec localTabSpec4 = localTabHost.newTabSpec("Ask N.E.E.D");
    TabHost.TabSpec localTabSpec5 = localTabHost.newTabSpec("N.E.E.D Shop");
    TabHost.TabSpec localTabSpec6 = localTabHost.newTabSpec("Prizing");
    Intent localIntent1 = new Intent(this, ActivityOne.class);
    Intent localIntent2 = new Intent(this, LinktoDonate.class);
    Intent localIntent3 = new Intent(this, WebviewChat.class);
    Intent localIntent4 = new Intent(this, SMS.class);
    Intent localIntent5 = new Intent(this, MainActivity.class);
    Intent localIntent6 = new Intent(this, Prizing.class);
    localTabSpec1.setIndicator("", getResources().getDrawable(2130837583));
    localTabSpec1.setContent(localIntent1);
    localTabSpec2.setIndicator("", getResources().getDrawable(2130837544));
    localTabSpec2.setContent(localIntent2);
    localTabSpec3.setIndicator("", getResources().getDrawable(2130837546));
    localTabSpec3.setContent(localIntent3);
    localTabSpec4.setIndicator("", getResources().getDrawable(2130837505));
    localTabSpec4.setContent(localIntent4);
    localTabSpec5.setIndicator("", getResources().getDrawable(2130837591));
    localTabSpec5.setContent(localIntent5);
    localTabSpec6.setIndicator("", getResources().getDrawable(2130837587));
    localTabSpec6.setContent(localIntent6);
    localTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener()
    {
      public void onTabChanged(String paramAnonymousString) {}
    });
    localTabHost.addTab(localTabSpec3);
    localTabHost.addTab(localTabSpec1);
    localTabHost.addTab(localTabSpec6);
    localTabHost.addTab(localTabSpec5);
    localTabHost.addTab(localTabSpec4);
    localTabHost.addTab(localTabSpec2);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      finish();
      System.exit(0);
    }
    return false;
  }
}


/* Location:           C:\Users\IRnawawi\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.manish.inapppurchase.HomePage
 * JD-Core Version:    0.7.0.1
 */