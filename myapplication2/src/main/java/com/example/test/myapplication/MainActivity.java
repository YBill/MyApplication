package com.example.test.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements LiveStaffView.OnStaffClickListener {

    private LiveStaffView liveStaffView, liveStaffView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(getApplicationContext());
        setContentView(R.layout.activity_test);
        liveStaffView = (LiveStaffView) findViewById(R.id.view_livestaff);
        liveStaffView.setLiveView(LiveStaffView.LiveMode.single, null);
        liveStaffView.setAnchorMode(LiveStaffView.AnchorMode.onMike, "");
        liveStaffView.setOnStaffClickListener(this);
        liveStaffView2 = (LiveStaffView) findViewById(R.id.view_livestaff2);
        liveStaffView2.setLiveView(LiveStaffView.LiveMode.doubles, getData());
        liveStaffView2.setAnchorMode(LiveStaffView.AnchorMode.other, "主播直播");
        liveStaffView2.setOnStaffClickListener(this);

    }

    private List<String> getData(){
        List<String> list = new ArrayList<String>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        return list;
    }

    @Override
    public void onAudienceClick() {
        Toast.makeText(this, "听众头像", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFristAnchorClick() {
        Toast.makeText(this, "第一个主播", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSecondAnchorClick() {
        Toast.makeText(this, "第二个主播", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onMikeClick(LiveStaffView.AnchorMode mode) {
        Toast.makeText(this, "mode:" + mode, Toast.LENGTH_SHORT).show();
    }
}
