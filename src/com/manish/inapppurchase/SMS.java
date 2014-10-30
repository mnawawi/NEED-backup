package com.manish.inapppurchase;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMS
  extends Activity
{
  Button btnSend;
  private Button padam;
  EditText txtPhoneNo;
  EditText txtSMS;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903057);
    this.btnSend = ((Button)findViewById(2131427463));
    this.txtSMS = ((EditText)findViewById(2131427462));
    this.btnSend.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        String str = SMS.this.txtSMS.getText().toString();
        try
        {
          SmsManager.getDefault().sendTextMessage("0134144557", null, str, null, null);
          Toast.makeText(SMS.this.getApplicationContext(), "SMS Sent!...", 1).show();
          return;
        }
        catch (Exception localException)
        {
          Toast.makeText(SMS.this.getApplicationContext(), "SMS fail, please try again later!", 1).show();
          localException.printStackTrace();
        }
      }
    });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131361798, paramMenu);
    return true;
  }
}


/* Location:           C:\Users\IRnawawi\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.manish.inapppurchase.SMS
 * JD-Core Version:    0.7.0.1
 */