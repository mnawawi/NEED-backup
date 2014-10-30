package com.manish.inapppurchase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Molpay_Terms_Conds
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
    setContentView(2130903049);
    Button localButton = (Button)findViewById(2131427411);
    this.clikbutton1 = MediaPlayer.create(this, 2131034114);
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(Molpay_Terms_Conds.this, MolpayActivity.class);
        Molpay_Terms_Conds.this.startActivity(localIntent);
        Molpay_Terms_Conds.this.clikbutton1.start();
      }
    });
  }
}


/* Location:           C:\Users\IRnawawi\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.manish.inapppurchase.Molpay_Terms_Conds
 * JD-Core Version:    0.7.0.1
 */