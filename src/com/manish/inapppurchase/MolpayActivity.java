package com.manish.inapppurchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;
import com.molpay.molpaylib.MOLPayActivity;
import com.molpay.molpaylib.settings.MerchantInfo;
import java.util.Random;

public class MolpayActivity
  extends Activity
{
  public static final int REQUEST_CODE = 1;
  private TextView result;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt2 == -1) && (paramInt1 == 1))
    {
      Bundle localBundle = paramIntent.getExtras().getBundle("bundle");
      if (localBundle != null)
      {
        String str1 = localBundle.getString(MerchantInfo.PAY_AMOUNT);
        String str2 = localBundle.getString(MerchantInfo.TXN_ID);
        String str3 = localBundle.getString(MerchantInfo.STATUS_CODE);
        String str4 = localBundle.getString(MerchantInfo.ERR_DESC);
        String str5 = "the amount is " + str1 + "\nthe transaction id is " + str2 + "\nthe error description is " + str4 + "\nthe status is " + str3;
        this.result.setText(str5);
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903044);
    this.result = ((TextView)findViewById(2131427399));
    Intent localIntent = new Intent(this, MOLPayActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("MerchantId", "appslipperspioneer");
    localBundle.putString("AppName", "needshop");
    localBundle.putString("VerifyKey", "3f9601daec99476be5a02939afd80b78");
    localBundle.putString("Username", "api_appslipperspioneer");
    localBundle.putString("Password", "app09pers07");
    int i = 1 + new Random().nextInt(499999);
    localBundle.putString("OrderId", "GPAA" + String.valueOf(i));
    localBundle.putString("BillName", "DONATOR");
    localBundle.putString("BillDesc", "DONATE");
    localBundle.putString("BillMobile", "0132222591");
    localBundle.putString("BillEmail", "nawawi2501@yahoo.com.my");
    localBundle.putString("Channel", "multi");
    localBundle.putString("Currency", "MYR");
    localBundle.putString("Country", "MY");
    localBundle.putFloat("Amount", 3.5F);
    localIntent.putExtras(localBundle);
    startActivityForResult(localIntent, 1);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131361796, paramMenu);
    return true;
  }
}


/* Location:           C:\Users\IRnawawi\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.manish.inapppurchase.MolpayActivity
 * JD-Core Version:    0.7.0.1
 */