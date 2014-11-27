package com.HBV1.tyndr.test;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.test.ActivityTestCase;

import com.HBV1.tyndr.Form;
import com.HBV1.tyndr.Pet;

public class PrufariPet extends ActivityTestCase {

	public void testSetImage() {
		Pet pet = new Pet();
		Context context = getInstrumentation().getContext();
		Resources res = context.getResources();
		Bitmap img = BitmapFactory.decodeResource(
				res, R.drawable.ic_launcher);
		String img64 = Form.encodeTobase64(img);
		assertEquals(true, pet.setImage(img64));
	}
	
	public void testGetImage() {
		Pet pet = new Pet();
		Context context = getInstrumentation().getContext();
		Resources res = context.getResources();
		Bitmap img = BitmapFactory.decodeResource(
				res, R.drawable.ic_launcher);
		String img64 = Form.encodeTobase64(img);
		pet.setImage(img64);
		assertNotNull(pet.getImage());
	}

}
