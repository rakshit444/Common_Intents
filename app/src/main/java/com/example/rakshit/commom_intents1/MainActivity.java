package com.example.rakshit.commom_intents1;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.rakshit.common_intents1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        String value = editText.getText().toString();
        Intent i = new Intent(this,result_activity.class);
        i.putExtra("editText", value);
        startActivity(i);
    }
    public void open_maps(View view){
        Uri geoLocation = Uri.parse("google.streetview:cbll=46.414382,10.013988");
        Intent intent = new Intent(Intent.ACTION_VIEW,geoLocation);
        intent.setPackage("com.google.android.apps.maps");
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }}
    public void open_camera(View view){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }}
    public void open_contacts(View view){
        Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
    public void open_dialer(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
    public void share(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
    public void open_google(View view){
        String url = "http://www.google.com";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
}
