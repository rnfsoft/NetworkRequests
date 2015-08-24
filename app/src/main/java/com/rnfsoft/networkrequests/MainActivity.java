package com.rnfsoft.networkrequests;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    ImageView ivBasicImageEasy;
    ImageView ivBasicImageHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imageUri = "https://i.imgur.com/tGbaZCY.jpg";
        ivBasicImageEasy = (ImageView)findViewById(R.id.ivBasicImageEasy);
        ivBasicImageHard = (ImageView) findViewById(R.id.ivBasicImageHard);

        //Displaying Remote Images (The "Easy" Way)
        Picasso.with(this).load(imageUri).into(ivBasicImageEasy);

        //Displaying Remote Images (The "Hard" Way)
        new ImageDownloadTask(ivBasicImageHard).execute(imageUri);

    }


    private class ImageDownloadTask extends AsyncTask<String, Void, Bitmap> {
        ImageView imageView;
        InputStream in;

        public ImageDownloadTask(ImageView imageView) {
            this.imageView = imageView;
        }

        @Override
        protected Bitmap doInBackground(String... addresses) {
            Bitmap bitmap = null;
            InputStream in;
            try {
                URL url = new URL(addresses[0]);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.connect();
                in = conn.getInputStream();
                bitmap = BitmapFactory.decodeStream(in);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
           imageView.setImageBitmap(bitmap);
        }
    }
}
