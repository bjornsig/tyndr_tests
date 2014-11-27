package com.HBV1.tyndr.test;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.test.ActivityTestCase;

import com.HBV1.tyndr.Form;

public class PrufariForm extends ActivityTestCase {
	
	public void testEncodeTobase64() {
		Context context = getInstrumentation().getContext();
		Resources res = context.getResources();
		Bitmap img = BitmapFactory.decodeResource(res, R.drawable.ic_launcher);
		String img64 = Form.encodeTobase64(img);
		assertNotNull(img64);
	}

}
