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
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

public class ActivityOne
  extends Activity
{
  private EditText hb;
  private EditText jp;
  private double jumlah;
  private EditText k;
  private EditText k1;
  private EditText k10;
  private EditText k12;
  private EditText k2;
  private EditText k3;
  private EditText k4;
  private EditText k5;
  private EditText k6;
  private EditText k7;
  private EditText k8;
  private EditText k9;
  private Button kira;
  private EditText kj;
  private EditText kk;
  private Handler mHandler = new Handler();
  private Handler mHandler1 = new Handler();
  private Runnable mUpdateTimeTask = new Runnable()
  {
    public void run()
    {
      ActivityOne.this.mHandler.postDelayed(this, 5000L);
    }
  };
  private Runnable mUpdateTimeTask1 = new Runnable()
  {
    public void run()
    {
      ActivityOne.this.mHandler1.postDelayed(this, 5000L);
    }
  };
  private EditText nj;
  private Button padam;
  private EditText r1;
  private EditText r10;
  private EditText r2;
  private EditText r3;
  private EditText r4;
  private EditText r5;
  private EditText r6;
  private EditText r7;
  private EditText r8;
  private EditText r9;
  private EditText rdecm;
  private EditText rj1;
  private EditText rj10;
  private EditText rj12;
  private EditText rj2;
  private EditText rj3;
  private EditText rj4;
  private EditText rj5;
  private EditText rj6;
  private EditText rj7;
  private EditText rj8;
  private EditText rj9;
  private EditText rjj;
  private EditText rr;
  
  private void jpen()
  {
    double d1 = Double.parseDouble(this.r1.getText().toString());
    double d2 = Double.parseDouble(this.r2.getText().toString());
    double d3 = Double.parseDouble(this.r3.getText().toString());
    double d4 = Double.parseDouble(this.r4.getText().toString());
    double d5 = Double.parseDouble(this.r5.getText().toString());
    double d6 = Double.parseDouble(this.r6.getText().toString());
    double d7 = Double.parseDouble(this.r7.getText().toString());
    double d8 = Double.parseDouble(this.r8.getText().toString());
    double d9 = Double.parseDouble(this.r9.getText().toString());
    double d10 = Double.parseDouble(this.r10.getText().toString());
    double d11 = Double.parseDouble(this.rr.getText().toString());
    this.mHandler1.postDelayed(this.mUpdateTimeTask1, 1500L);
    double d12 = Double.parseDouble(this.rdecm.getText().toString()) + (d11 + (d10 + (d9 + (d8 + (d7 + (d6 + (d5 + (d4 + (d3 + (d1 + d2))))))))));
    EditText localEditText = this.jp;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(d12);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void k()
  {
    double d1 = Double.parseDouble(this.k1.getText().toString());
    double d2 = Double.parseDouble(this.k2.getText().toString());
    double d3 = Double.parseDouble(this.k3.getText().toString());
    double d4 = Double.parseDouble(this.k4.getText().toString());
    double d5 = Double.parseDouble(this.k5.getText().toString());
    double d6 = Double.parseDouble(this.k6.getText().toString());
    double d7 = Double.parseDouble(this.k7.getText().toString());
    double d8 = Double.parseDouble(this.k8.getText().toString());
    double d9 = Double.parseDouble(this.k9.getText().toString());
    double d10 = Double.parseDouble(this.k10.getText().toString());
    double d11 = Double.parseDouble(this.kk.getText().toString());
    this.jumlah = (Double.parseDouble(this.k12.getText().toString()) + (d11 + (d10 + (d9 + (d8 + (d7 + (d6 + (d5 + (d4 + (d3 + (d1 + d2)))))))))));
    EditText localEditText = this.k;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira1()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.k1.getText() == null) || ("".equals(this.k1.getText().toString()))) {
      this.k1.setText("0");
    }
    if ((this.rj1.getText() == null) || ("".equals(this.rj1.getText().toString()))) {
      this.rj1.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k1.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj1.getText().toString()) - d2);
    EditText localEditText = this.r1;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira10()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.k10.getText() == null) || ("".equals(this.k10.getText().toString()))) {
      this.k10.setText("0");
    }
    if ((this.rj10.getText() == null) || ("".equals(this.rj10.getText().toString()))) {
      this.rj10.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k10.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj10.getText().toString()) - d2);
    EditText localEditText = this.r10;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira11()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.kk.getText() == null) || ("".equals(this.kk.getText().toString()))) {
      this.kk.setText("0");
    }
    if ((this.rjj.getText() == null) || ("".equals(this.rjj.getText().toString()))) {
      this.rjj.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.kk.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rjj.getText().toString()) - d2);
    EditText localEditText = this.rr;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira12()
  {
    if ((this.k12.getText() == null) || ("".equals(this.k12.getText().toString()))) {
      this.k12.setText("0");
    }
    if ((this.rj12.getText() == null) || ("".equals(this.rj12.getText().toString()))) {
      this.rj12.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k12.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj12.getText().toString()) - d2);
    EditText localEditText = this.rdecm;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira2()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.k2.getText() == null) || ("".equals(this.k2.getText().toString()))) {
      this.k2.setText("0");
    }
    if ((this.rj2.getText() == null) || ("".equals(this.rj2.getText().toString()))) {
      this.rj2.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k2.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj2.getText().toString()) - d2);
    EditText localEditText = this.r2;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira3()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.k3.getText() == null) || ("".equals(this.k3.getText().toString()))) {
      this.k3.setText("0");
    }
    if ((this.rj3.getText() == null) || ("".equals(this.rj3.getText().toString()))) {
      this.rj3.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k3.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj3.getText().toString()) - d2);
    EditText localEditText = this.r3;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira4()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.k4.getText() == null) || ("".equals(this.k4.getText().toString()))) {
      this.k4.setText("0");
    }
    if ((this.rj4.getText() == null) || ("".equals(this.rj4.getText().toString()))) {
      this.rj4.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k4.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj4.getText().toString()) - d2);
    EditText localEditText = this.r4;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira5()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.k5.getText() == null) || ("".equals(this.k5.getText().toString()))) {
      this.k5.setText("0");
    }
    if ((this.rj5.getText() == null) || ("".equals(this.rj5.getText().toString()))) {
      this.rj5.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k5.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj5.getText().toString()) - d2);
    EditText localEditText = this.r5;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira6()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.k6.getText() == null) || ("".equals(this.k6.getText().toString()))) {
      this.k6.setText("0");
    }
    if ((this.rj6.getText() == null) || ("".equals(this.rj6.getText().toString()))) {
      this.rj6.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k6.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj6.getText().toString()) - d2);
    EditText localEditText = this.r6;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira7()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.k7.getText() == null) || ("".equals(this.k7.getText().toString()))) {
      this.k7.setText("0");
    }
    if ((this.rj7.getText() == null) || ("".equals(this.rj7.getText().toString()))) {
      this.rj7.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k7.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj7.getText().toString()) - d2);
    EditText localEditText = this.r7;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira8()
  {
    if ((this.hb.getText() == null) || ("".equals(this.hb.getText().toString()))) {
      this.hb.setText("0");
    }
    if ((this.k8.getText() == null) || ("".equals(this.k8.getText().toString()))) {
      this.k8.setText("0");
    }
    if ((this.rj8.getText() == null) || ("".equals(this.rj8.getText().toString()))) {
      this.rj8.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k8.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj8.getText().toString()) - d2);
    EditText localEditText = this.r8;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kira9()
  {
    if ((this.k9.getText() == null) || ("".equals(this.k9.getText().toString()))) {
      this.k9.setText("0");
    }
    if ((this.rj9.getText() == null) || ("".equals(this.rj9.getText().toString()))) {
      this.rj9.setText("0");
    }
    double d1 = Double.parseDouble(this.hb.getText().toString());
    double d2 = Double.parseDouble(this.k9.getText().toString());
    this.jumlah = (d1 * Double.parseDouble(this.rj9.getText().toString()) - d2);
    EditText localEditText = this.r9;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  public void kj()
  {
    double d1 = Double.parseDouble(this.rj1.getText().toString());
    double d2 = Double.parseDouble(this.rj2.getText().toString());
    double d3 = Double.parseDouble(this.rj3.getText().toString());
    double d4 = Double.parseDouble(this.rj4.getText().toString());
    double d5 = Double.parseDouble(this.rj5.getText().toString());
    double d6 = Double.parseDouble(this.rj6.getText().toString());
    double d7 = Double.parseDouble(this.rj7.getText().toString());
    double d8 = Double.parseDouble(this.rj8.getText().toString());
    double d9 = Double.parseDouble(this.rj9.getText().toString());
    double d10 = Double.parseDouble(this.rj10.getText().toString());
    double d11 = Double.parseDouble(this.rjj.getText().toString());
    this.jumlah = (Double.parseDouble(this.rj12.getText().toString()) + (d11 + (d10 + (d9 + (d8 + (d7 + (d6 + (d5 + (d4 + (d3 + (d1 + d2)))))))))));
    EditText localEditText = this.kj;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.0f", arrayOfObject));
  }
  
  public void nj()
  {
    double d1 = Double.parseDouble(this.rj1.getText().toString());
    double d2 = Double.parseDouble(this.rj2.getText().toString());
    double d3 = Double.parseDouble(this.rj3.getText().toString());
    double d4 = Double.parseDouble(this.rj4.getText().toString());
    double d5 = Double.parseDouble(this.rj5.getText().toString());
    double d6 = Double.parseDouble(this.rj6.getText().toString());
    double d7 = Double.parseDouble(this.rj7.getText().toString());
    double d8 = Double.parseDouble(this.rj8.getText().toString());
    double d9 = Double.parseDouble(this.rj9.getText().toString());
    double d10 = Double.parseDouble(this.rj10.getText().toString());
    double d11 = Double.parseDouble(this.rjj.getText().toString());
    double d12 = Double.parseDouble(this.rj12.getText().toString());
    this.jumlah = (Double.parseDouble(this.hb.getText().toString()) * (d12 + (d11 + (d10 + (d9 + (d8 + (d7 + (d6 + (d5 + (d4 + (d3 + (d1 + d2))))))))))));
    EditText localEditText = this.nj;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.jumlah);
    localEditText.setText(String.format("%.2f", arrayOfObject));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    ScrollView localScrollView = (ScrollView)findViewById(2131427329);
    HorizontalScrollView localHorizontalScrollView = (HorizontalScrollView)findViewById(2131427328);
    this.hb = ((EditText)findViewById(2131427377));
    this.k1 = ((EditText)findViewById(2131427353));
    this.k2 = ((EditText)findViewById(2131427331));
    this.k3 = ((EditText)findViewById(2131427333));
    this.k4 = ((EditText)findViewById(2131427334));
    this.k5 = ((EditText)findViewById(2131427335));
    this.k6 = ((EditText)findViewById(2131427336));
    this.k7 = ((EditText)findViewById(2131427366));
    this.k8 = ((EditText)findViewById(2131427337));
    this.k9 = ((EditText)findViewById(2131427338));
    this.k10 = ((EditText)findViewById(2131427339));
    this.kk = ((EditText)findViewById(2131427340));
    this.k12 = ((EditText)findViewById(2131427341));
    this.rj1 = ((EditText)findViewById(2131427354));
    this.rj2 = ((EditText)findViewById(2131427357));
    this.rj3 = ((EditText)findViewById(2131427359));
    this.rj4 = ((EditText)findViewById(2131427361));
    this.rj5 = ((EditText)findViewById(2131427363));
    this.rj6 = ((EditText)findViewById(2131427365));
    this.rj7 = ((EditText)findViewById(2131427368));
    this.rj8 = ((EditText)findViewById(2131427370));
    this.rj9 = ((EditText)findViewById(2131427372));
    this.rj10 = ((EditText)findViewById(2131427343));
    this.rjj = ((EditText)findViewById(2131427342));
    this.rj12 = ((EditText)findViewById(2131427376));
    this.r1 = ((EditText)findViewById(2131427355));
    this.r1.setEnabled(false);
    this.r2 = ((EditText)findViewById(2131427356));
    this.r2.setEnabled(false);
    this.r3 = ((EditText)findViewById(2131427358));
    this.r3.setEnabled(false);
    this.r4 = ((EditText)findViewById(2131427360));
    this.r4.setEnabled(false);
    this.r5 = ((EditText)findViewById(2131427362));
    this.r5.setEnabled(false);
    this.r6 = ((EditText)findViewById(2131427364));
    this.r6.setEnabled(false);
    this.r7 = ((EditText)findViewById(2131427367));
    this.r7.setEnabled(false);
    this.r8 = ((EditText)findViewById(2131427369));
    this.r8.setEnabled(false);
    this.r9 = ((EditText)findViewById(2131427371));
    this.r9.setEnabled(false);
    this.r10 = ((EditText)findViewById(2131427373));
    this.r10.setEnabled(false);
    this.rr = ((EditText)findViewById(2131427374));
    this.rr.setEnabled(false);
    this.rdecm = ((EditText)findViewById(2131427375));
    this.rdecm.setEnabled(false);
    this.kj = ((EditText)findViewById(2131427346));
    this.kj.setEnabled(false);
    this.nj = ((EditText)findViewById(2131427347));
    this.nj.setEnabled(false);
    this.k = ((EditText)findViewById(2131427348));
    this.k.setEnabled(false);
    this.jp = ((EditText)findViewById(2131427352));
    this.jp.setEnabled(false);
    this.kira = ((Button)findViewById(2131427387));
    this.padam = ((Button)findViewById(2131427388));
    localScrollView.fullScroll(33);
    localScrollView.smoothScrollTo(0, 0);
    localHorizontalScrollView.fullScroll(33);
    localHorizontalScrollView.smoothScrollTo(0, 0);
    this.padam.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        ActivityOne.this.hb.setText("");
        ActivityOne.this.k1.setText("");
        ActivityOne.this.k2.setText("");
        ActivityOne.this.k3.setText("");
        ActivityOne.this.k4.setText("");
        ActivityOne.this.k5.setText("");
        ActivityOne.this.k6.setText("");
        ActivityOne.this.k7.setText("");
        ActivityOne.this.k8.setText("");
        ActivityOne.this.k9.setText("");
        ActivityOne.this.k10.setText("");
        ActivityOne.this.kk.setText("");
        ActivityOne.this.k12.setText("");
        ActivityOne.this.rj1.setText("");
        ActivityOne.this.rj2.setText("");
        ActivityOne.this.rj3.setText("");
        ActivityOne.this.rj4.setText("");
        ActivityOne.this.rj5.setText("");
        ActivityOne.this.rj6.setText("");
        ActivityOne.this.rj7.setText("");
        ActivityOne.this.rj8.setText("");
        ActivityOne.this.rj9.setText("");
        ActivityOne.this.rj10.setText("");
        ActivityOne.this.rjj.setText("");
        ActivityOne.this.rj12.setText("");
        ActivityOne.this.r1.setText("");
        ActivityOne.this.r2.setText("");
        ActivityOne.this.r3.setText("");
        ActivityOne.this.r4.setText("");
        ActivityOne.this.r5.setText("");
        ActivityOne.this.r6.setText("");
        ActivityOne.this.r7.setText("");
        ActivityOne.this.r8.setText("");
        ActivityOne.this.r9.setText("");
        ActivityOne.this.r10.setText("");
        ActivityOne.this.rr.setText("");
        ActivityOne.this.rdecm.setText("");
        ActivityOne.this.kj.setText("");
        ActivityOne.this.nj.setText("");
        ActivityOne.this.k.setText("");
        ActivityOne.this.jp.setText("");
      }
    });
    this.kira.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        ActivityOne.this.kira1();
        ActivityOne.this.kira2();
        ActivityOne.this.mHandler.postDelayed(ActivityOne.this.mUpdateTimeTask, 1000L);
        ActivityOne.this.kira3();
        ActivityOne.this.mHandler.postDelayed(ActivityOne.this.mUpdateTimeTask, 1000L);
        ActivityOne.this.kira4();
        ActivityOne.this.kira5();
        ActivityOne.this.mHandler.postDelayed(ActivityOne.this.mUpdateTimeTask, 1000L);
        ActivityOne.this.kira6();
        ActivityOne.this.kira7();
        ActivityOne.this.mHandler.postDelayed(ActivityOne.this.mUpdateTimeTask, 1000L);
        ActivityOne.this.kira8();
        ActivityOne.this.mHandler.postDelayed(ActivityOne.this.mUpdateTimeTask, 1000L);
        ActivityOne.this.kira9();
        ActivityOne.this.mHandler.postDelayed(ActivityOne.this.mUpdateTimeTask, 1000L);
        ActivityOne.this.kira10();
        ActivityOne.this.mHandler1.postDelayed(ActivityOne.this.mUpdateTimeTask1, 1500L);
        ActivityOne.this.kira11();
        ActivityOne.this.kira12();
        ActivityOne.this.mHandler1.postDelayed(ActivityOne.this.mUpdateTimeTask1, 1500L);
        ActivityOne.this.kj();
        ActivityOne.this.nj();
        ActivityOne.this.mHandler1.postDelayed(ActivityOne.this.mUpdateTimeTask1, 1500L);
        ActivityOne.this.k();
        ActivityOne.this.mHandler1.postDelayed(ActivityOne.this.mUpdateTimeTask1, 1500L);
        ActivityOne.this.jpen();
      }
    });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131361792, paramMenu);
    return true;
  }
}


/* Location:           C:\Users\IRnawawi\Desktop\classes_dex2jar.jar
 * Qualified Name:     com.manish.inapppurchase.ActivityOne
 * JD-Core Version:    0.7.0.1
 */