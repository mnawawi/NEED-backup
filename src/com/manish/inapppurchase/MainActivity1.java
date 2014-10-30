package com.manish.inapppurchase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.appslipperneed.R;





public class MainActivity1 extends Activity implements OnClickListener {
	MediaPlayer clikbutton, clikbutton1;
	Button btn1, btn2, btn3,btn4;
	private Context mContext=this;
	private static final String TAG = "Android BillingService";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_wallet);
		btn1 = (Button) findViewById(R.id.wallet);
		//btn2 = (Button) findViewById(R.id.button2a);
		//btn3 = (Button) findViewById(R.id.button3a);
		//final Button pp=(Button) findViewById(R.id.ppbtna);
		//final Button pypl=(Button) findViewById(R.id.ppbtn);
		clikbutton1 = MediaPlayer.create(MainActivity1.this, R.raw.click1);
		btn1.setOnClickListener(this);
		//btn2.setOnClickListener(this);
		//btn3.setOnClickListener(this);
		/*pp.setOnClickListener(new View.OnClickListener(){


			 public void onClick(View v )
			   {
				Intent i = new Intent(MainActivity1.this, MolpayActivity.class);
				   startActivity(i);
					  }
				   
			   });*/
		
		
		 startService(new Intent(mContext, BillingService.class));
	        BillingHelper.setCompletedHandler(mTransactionHandler);
	}
	public Handler mTransactionHandler = new Handler(){
		public void handleMessage(android.os.Message msg) {
			Log.i(TAG, "Transaction complete");
			Log.i(TAG, "Transaction status: "+BillingHelper.latestPurchase.purchaseState);
			Log.i(TAG, "Item purchased is: "+BillingHelper.latestPurchase.productId);
			
			if(BillingHelper.latestPurchase.isPurchased()){
				showItem();
			}
		};
	
};
	@Override
	public void onClick(View v) {
		if (v == btn1) {
			if(BillingHelper.isBillingSupported()){
				BillingHelper.requestPurchase(mContext, "donate_3.5"); 
	        } else {
	        	Log.i(TAG,"Can't purchase on this device");
	        	
	        	btn1.setEnabled(false); // XXX press button before service started will disable when it shouldnt
	        	 clikbutton1.start();
	        }
			
			Toast.makeText(this, "Your donation is MYR 3.50", Toast.LENGTH_SHORT).show();
		}
		/*if (v == btn2) {
			if(BillingHelper.isBillingSupported()){
				BillingHelper.requestPurchase(mContext, "myr_4.50"); 
	        } else {
	        	Log.i(TAG,"Can't purchase on this device");
	        	btn2.setEnabled(false); // XXX press button before service started will disable when it shouldnt
	        }
			Toast.makeText(this, "Your donation is MYR 4.50", Toast.LENGTH_SHORT).show();
		}
		if (v == btn3) {
			if(BillingHelper.isBillingSupported()){
				BillingHelper.requestPurchase(mContext, "myr_7.50"); 
	        } else {
	        	Log.i(TAG,"Can't purchase on this device");
	        	btn3.setEnabled(false); // XXX press button before service started will disable when it shouldnt
	        }
			Toast.makeText(this, "Your donation is MYR 7.00", Toast.LENGTH_SHORT).show();
		}*/
		
		
			
	}
	
	 public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
	  {
	    if (paramInt == 4) {
	      super.onBackPressed();
	    }
	    return false;
	  }
	private void showItem() {
		//purchaseableItem.setVisibility(View.VISIBLE);
	}

	
	
	
	
	
}


