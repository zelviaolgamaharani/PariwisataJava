package com.lauwba.pariwisata;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class SingleImage extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleimage);

        int imId = this.getIntent().getExtras().getInt("posisi");
        ImageView iv = (ImageView) findViewById(R.id.singleimage);
        int image = ImageAdapter.mThumbIds[imId];
        iv.setImageResource(image);

    }
}
