package com.example.test1.phone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.test1.R;

public class Call extends AppCompatActivity {
    EditText editText_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        editText_phone = (EditText)findViewById(R.id.editText_phone);

    }
    //拨号键
    public void gotoCall(View view){
        String phone_number = editText_phone.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        Uri data = Uri.parse("tel:"+phone_number);
        intent.setData(data);
        startActivity(intent);
    }
    //拨号
    public void gotoCall2(View view){
//        String phone_number = editText_phone.getText().toString();
//        Intent intent = new Intent(Intent.ACTION_CALL);
//        Uri data = Uri.parse("tel:"+phone_number);
//        intent.setData(data);
//        startActivity(intent);
        Toast.makeText(this,"功能不可用",Toast.LENGTH_SHORT).show();
    }
}
