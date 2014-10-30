package com.manish.inapppurchase;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Prizing
  extends Activity
{
  private EditText beven;
  private EditText dist;
  private EditText indcost;
  private Button kira;
  private Handler mHandler = new Handler();
  private Runnable mUpdateTimeTask = new Runnable()
  {
    public void run()
    {
      Prizing.this.mHandler.postDelayed(this, 5000L);
    }
  };
  private EditText opscost;
  private Button padam;
  private EditText rawprice;
  private EditText ret;
  private EditText retailer;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903056);
    this.rawprice = ((EditText)findViewById(2131427450));
    this.indcost = ((EditText)findViewById(2131427451));
    this.indcost.setEnabled(false);
    this.opscost = ((EditText)findViewById(2131427452));
    this.opscost.setEnabled(false);
    this.dist = ((EditText)findViewById(2131427453));
    this.dist.setEnabled(false);
    this.ret = ((EditText)findViewById(2131427455));
    this.ret.setEnabled(false);
    this.retailer = ((EditText)findViewById(2131427454));
    this.retailer.setEnabled(false);
    this.beven = ((EditText)findViewById(2131427456));
    this.beven.setEnabled(false);
    this.kira = ((Button)findViewById(2131427387));
    this.padam = ((Button)findViewById(2131427459));
    this.padam.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Prizing.this.rawprice.setText("");
        Prizing.this.indcost.setText("");
        Prizing.this.opscost.setText("");
        Prizing.this.dist.setText("");
        Prizing.this.ret.setText("");
        Prizing.this.retailer.setText("");
        Prizing.this.beven.setText("");
      }
    });
    this.kira.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if ((Prizing.this.rawprice.getText() == null) || ("".equals(Prizing.this.rawprice.getText().toString()))) {
          Prizing.this.rawprice.setText("0");
        }
        double d1 = Double.parseDouble(Prizing.this.rawprice.getText().toString());
        double d2 = d1 + 0.3D * d1;
        EditText localEditText1 = Prizing.this.indcost;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Double.valueOf(d2);
        localEditText1.setText(String.format("%.2f", arrayOfObject1));
        Prizing.this.mHandler.postDelayed(Prizing.this.mUpdateTimeTask, 1000L);
        double d3 = Double.parseDouble(Prizing.this.indcost.getText().toString());
        double d4 = d3 + 0.3D * d3;
        EditText localEditText2 = Prizing.this.opscost;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Double.valueOf(d4);
        localEditText2.setText(String.format("%.2f", arrayOfObject2));
        Prizing.this.mHandler.postDelayed(Prizing.this.mUpdateTimeTask, 1000L);
        double d5 = Double.parseDouble(Prizing.this.opscost.getText().toString());
        double d6 = d5 + 0.5D * d5;
        EditText localEditText3 = Prizing.this.dist;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Double.valueOf(d6);
        localEditText3.setText(String.format("%.2f", arrayOfObject3));
        Prizing.this.mHandler.postDelayed(Prizing.this.mUpdateTimeTask, 1000L);
        double d7 = d5 + d5;
        EditText localEditText4 = Prizing.this.ret;
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Double.valueOf(d7);
        localEditText4.setText(String.format("%.2f", arrayOfObject4));
        Prizing.this.mHandler.postDelayed(Prizing.this.mUpdateTimeTask, 1000L);
        double d8 = d5 + 1.5D * d5;
        EditText localEditText5 = Prizing.this.retailer;
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Double.valueOf(d8);
        localEditText5.setText(String.format("%.2f", arrayOfObject5));
        Prizing.this.mHandler.postDelayed(Prizing.this.mUpdateTimeTask, 1000L);
        EditText localEditText6 = Prizing.this.beven;
        Object[] arrayOfObject6 = new Object[1];
        arrayOfObject6[0] = Double.valueOf(d4);
        localEditText6.setText(String.format("%.2f", arrayOfObject6));
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
 * Qualified Name:     com.manish.inapppurchase.Prizing
 * JD-Core Version:    0.7.0.1
 */