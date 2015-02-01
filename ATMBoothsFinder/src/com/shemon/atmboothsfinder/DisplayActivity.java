package com.shemon.atmboothsfinder;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends ActionBarActivity {

	TextView showName;
	TextView showAddress;
	TextView showBankName;
	TextView showDeposit;
	TextView showContactName;
	TextView showContactNo;
	TextView showLatitude;
	TextView showLongitude;
	Button go;
	int id;

	Info info;
	SQDataSource AtmBoothDataSource;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		Intent in = getIntent();
		Bundle bundle = in.getExtras();
		id = bundle.getInt("id");

		showName = (TextView) findViewById(R.id.showatmname);
		showAddress = (TextView) findViewById(R.id.showaddress);
		showBankName = (TextView) findViewById(R.id.showbanknameEt);
		showDeposit = (TextView) findViewById(R.id.showdeposit);
		showContactName = (TextView) findViewById(R.id.showcontact_name);
		showContactNo = (TextView) findViewById(R.id.showcontact_no);
		showLatitude = (TextView) findViewById(R.id.showlatitude);
		showLongitude = (TextView) findViewById(R.id.showlongitude);
		go = (Button) findViewById(R.id.go);

		AtmBoothDataSource = new SQDataSource(this);
		info = AtmBoothDataSource.getAllInfo(id);
		String name = info.getName();
		String add = info.getAdd();
		String bankName = info.getBankName();
		String deposit = info.getDeposit();
		String contactName = info.getContactName();
		String contactNo = info.getContactNo();
		String latitude = info.getLatitude();
		String longitude = info.getLongitude();

		showName.setText(name);
		showAddress.setText(add);
		showBankName.setText(bankName);
		showDeposit.setText(deposit);
		showContactName.setText(contactName);
		showContactNo.setText(contactNo);
		showLatitude.setText(latitude);
		showLongitude.setText(longitude);

		go.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle b = new Bundle();

				// put id into bundle
				b.putLong("id", id);
				Intent i = new Intent(getApplicationContext(),
						GoogleMapActivity.class);
				startActivity(i);
			}
		});
	}

	public void setTextView() {
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.view, menu);
		inflater.inflate(R.menu.add, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.add:
			add();
			return true;
		case R.id.edit:
			edit();
			return true;
		case R.id.delete:
			delete();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private void add() {
		Intent i = new Intent(getBaseContext(), SaveInfoActivity.class);
		startActivity(i);

	}

	private void edit() {
		Intent i = new Intent(getBaseContext(), SaveInfoActivity.class);
		startActivity(i);

	}

	private void delete() {
		AtmBoothDataSource = new SQDataSource(this);
		AtmBoothDataSource.deleteData(id);
		Intent i = new Intent(getBaseContext(), MainActivity.class);
		startActivity(i);

	}
=======
public class DisplayActivity {
>>>>>>> origin/master

}
