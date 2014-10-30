package com.manish.inapppurchase;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash
  extends Activity
{
  MediaPlayer ourSound;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903058);
    this.ourSound = MediaPlayer.create(this, 2131034115);
    this.ourSound.start();
    new Thread()
    {
      public void run()
      {
        try
        {
          sleep(4000L);
          Intent localIntent3;
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          Intent localIntent2;
          return;
        }
        finally
        {
          Intent localIntent1 = new Intent(Splash.this, HomePage.class);
          Splash.this.startActivity(localIntent1);
        }
      }
    }.start();
  }
  
  protected void onPause()
  {
    super.onPause();
    this.ourSound.release();
    finish();
  }
}


/* Location:           C:\Users\IRnawawi\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.manish.inapppurchase.Splash
 * JD-Core Version:    0.7.0.1
 */