package com.antiysz.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.widget.ListView;

import com.antiysz.adapter.CodeBookShowAdapter;
import com.antiysz.app.MagicRingApplication;
import com.antiysz.base.BaseActivity;
import com.antiysz.bean.CodeBookItem;
import com.antiysz.db.CodeBookDB;
import com.antiysz.magicring.R;

public class CodeBookShowActivity extends BaseActivity {

	private static final String TAG = "CodeBookShowActivity";

	private ListView showLV;
	private List<CodeBookItem> list = new ArrayList<CodeBookItem>();
	public static CodeBookShowActivity instance;

	/**
	 * init
	 */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.code_book_show);
		MagicRingApplication.getInstance().addActivity(this);
		setUI();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		MagicRingApplication.getInstance().removeActivity(this);
	}
}
