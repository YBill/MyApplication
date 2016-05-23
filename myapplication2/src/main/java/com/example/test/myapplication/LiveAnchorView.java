package com.example.test.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by null on 2016/5/14.
 */
public class LiveAnchorView extends LinearLayout implements View.OnClickListener{

    private View singleView;
    private View doubleView;
    private ImageView[] singleAudienceImage = new ImageView[4];
    private ImageView[] doubleAudienceImage = new ImageView[2];
    private View mikeView;
    private TextView mikeTextView;
    private TextView otherTextView;
    private View singleAudienceView;
    private View doubleAudienceView;
    private View singleModeView;
    private View doubleModeView;

    public enum LiveMode {
        single, // 单主播
        doubles // 双主播
    }

    private AnchorMode anchorMode;
    public enum AnchorMode{
        onMike, // 上麦,可点击
        onMikeNoClick, // 上麦,不可点击
        other, // 显示文字,不可点击
    }

    public LiveAnchorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = View.inflate(context, R.layout.layout_live_anchor, null);
        this.addView(view);
        singleView = view.findViewById(R.id.ll_single_anchor);
        doubleView = view.findViewById(R.id.ll_double_anchor);
        singleAudienceImage[0] = (ImageView) view.findViewById(R.id.iv_audience_single_frist);
        singleAudienceImage[1] = (ImageView) view.findViewById(R.id.iv_audience_single_second);
        singleAudienceImage[2] = (ImageView) view.findViewById(R.id.iv_audience_single_third);
        singleAudienceImage[3] = (ImageView) view.findViewById(R.id.iv_audience_single_fourth);
        doubleAudienceImage[0] = (ImageView) view.findViewById(R.id.iv_audience_double_frist);
        doubleAudienceImage[1] = (ImageView) view.findViewById(R.id.iv_audience_double_second);
        mikeView = view.findViewById(R.id.rl_mike);
        mikeView.setOnClickListener(this);
        mikeTextView = (TextView)view.findViewById(R.id.tv_mike);
        otherTextView = (TextView)view.findViewById(R.id.tv_mike_other);
        singleAudienceView = view.findViewById(R.id.layout_audience_single);
        singleAudienceView.setOnClickListener(this);
        doubleAudienceView = view.findViewById(R.id.layout_audience_double);
        doubleAudienceView.setOnClickListener(this);
        singleModeView = view.findViewById(R.id.iv_audience_single_more);
        doubleModeView = view.findViewById(R.id.iv_audience_double_more);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl_mike:
                if(audienceClickListener != null && AnchorMode.onMike == anchorMode){
                    audienceClickListener.onMikeClick();
                }
                break;
            case R.id.layout_audience_single: // 单主播听众头像
                if(audienceClickListener != null)
                    audienceClickListener.onSingleClick();
                break;
            case R.id.layout_audience_double: // 双主播听众头像
                if(audienceClickListener != null)
                    audienceClickListener.onDoubleClick();
                break;
        }

    }

    /**
     * 设置主播View
     * @param mode   LiveMode。single or LiveMode.doubles
     * @param number 听众人数
     */
    public void setLiveView(LiveMode mode, int number) {
        switch (mode) {
            case doubles:
                singleView.setVisibility(View.GONE);
                doubleView.setVisibility(View.VISIBLE);
                doubleAudienceNumber(number);
                break;
            default:
                singleView.setVisibility(View.VISIBLE);
                doubleView.setVisibility(View.GONE);
                singleAudienceNumber(number);
                break;
        }
    }

    /**
     * 设置主播模式
     * @param mode
     * @param text
     */
    public void setAnchorMode(AnchorMode mode, String text){
        anchorMode = mode;
        switch (mode) {
            case onMike:
                mikeView.setVisibility(View.VISIBLE);
                otherTextView.setVisibility(View.GONE);
                mikeView.setBackgroundResource(R.drawable.shape_onmike);
                break;
            case onMikeNoClick:
                mikeView.setVisibility(View.VISIBLE);
                otherTextView.setVisibility(View.GONE);
                mikeView.setBackgroundResource(R.drawable.shape_undermike);
                break;
            case other:
                mikeView.setVisibility(View.GONE);
                otherTextView.setVisibility(View.VISIBLE);
                if(text != null)
                    otherTextView.setText(text);
                break;
        }
    }

    /**
     * @param num 双主播听众人数
     */
    private void doubleAudienceNumber(int num) {
        if (num < 0)
            num = 0;
        if (num > 2)
            num = 2;
        if(num == 0){
            doubleModeView.setVisibility(View.GONE);
        }else{
            doubleModeView.setVisibility(View.VISIBLE);
        }
        for (int i = 0; i < num; i++) {
            doubleAudienceImage[i].setVisibility(View.VISIBLE);
            downloadImage(doubleAudienceImage[i], "");
        }
        for (int i = num; i < 2; i++) {
            doubleAudienceImage[i].setVisibility(View.GONE);
        }
    }

    /**
     * @param num 单主播听众人数
     */
    private void singleAudienceNumber(int num) {
        if (num < 0)
            num = 0;
        if (num > 4)
            num = 4;
        if(num == 0){
            singleModeView.setVisibility(View.GONE);
        }else{
            singleModeView.setVisibility(View.VISIBLE);
        }
        for (int i = 0; i < num; i++) {
            singleAudienceImage[i].setVisibility(View.VISIBLE);
            downloadImage(singleAudienceImage[i], "");
        }
        for (int i = num; i < 4; i++) {
            singleAudienceImage[i].setVisibility(View.GONE);
        }
    }

    /**
     * 下载图片
     * @param imageView
     * @param url
     */
    private void downloadImage(ImageView imageView, String url){

    }

    private AudienceClickListener audienceClickListener;

    /**
     * 注册听众点击事件
     * @param audienceClickListener
     */
    public void setAudienceClickListener(AudienceClickListener audienceClickListener) {
        this.audienceClickListener = audienceClickListener;
    }

    public interface AudienceClickListener{

        /**
         * 单主播点击事件
         */
        void onSingleClick();

        /**
         * 双主播点击事件
         */
        void onDoubleClick();

        /**
         *  右测绿色按钮点击事件
         */
        void onMikeClick();
    }


}
