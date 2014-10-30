package com.manish.inapppurchase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class LinktoDonate
  extends Activity
  implements View.OnClickListener
{
  private static final String TAG = "Android BillingService";
  MediaPlayer clikbutton;
  MediaPlayer clikbutton1;
  private Context mContext = this;
  
  public void onClick(View paramView) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903046);
    ImageButton localImageButton1 = (ImageButton)findViewById(2131427404);
    ImageButton localImageButton2 = (ImageButton)findViewById(2131427402);
    ImageButton localImageButton3 = (ImageButton)findViewById(2131427403);
    this.clikbutton = MediaPlayer.create(this, 2131034113);
    this.clikbutton1 = MediaPlayer.create(this, 2131034114);
    localImageButton1.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(LinktoDonate.this, Molpay_Terms_Conds.class);
        LinktoDonate.this.startActivity(localIntent);
        LinktoDonate.this.clikbutton.start();
      }
    });
    localImageButton2.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(LinktoDonate.this, MainActivity1.class);
        LinktoDonate.this.startActivity(localIntent);
        LinktoDonate.this.clikbutton.start();
      }
    });
    localImageButton3.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(LinktoDonate.this, SampleActivity1.class);
        LinktoDonate.this.startActivity(localIntent);
        LinktoDonate.this.clikbutton.start();
      }
    });
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      startActivity(new Intent(this, HomePage.class));
    }
    return false;
  }
}


/* Location:           C:\Users\IRnawawi\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.manish.inapppurchase.LinktoDonate
 * JD-Core Version:    0.7.0.1
 */