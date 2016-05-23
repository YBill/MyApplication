package com.example.test.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by 卫彪 on 2016/5/19.
 */
public class LiveStaffView extends LinearLayout implements View.OnClickListener{

    private Context context;
    private LinearLayout parentLayout;
    private View secondAnchorView;
    private SimpleDraweeView fristAnchorImage;
    private SimpleDraweeView secondAnchorImage;
    private View moreView;
    private View mikeView;
    private TextView mikeTextView;
    private View micView;
    GradientDrawable shapeDrawable;

    public enum LiveMode {
        single, // 单主播
        doubles // 双主播
    }

    private AnchorMode anchorMode;
    public enum AnchorMode{
        onMike, // 上麦,可点击
        underMike, // 下麦，可点击
        onMikeNoClick, // 上麦,不可点击
        rowMike, // 排麦中
        other, // 显示文字,不可点击
    }

    public LiveStaffView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        View view = View.inflate(context, R.layout.layout_live_staff, null);
        this.addView(view);
        parentLayout = (LinearLayout)view.findViewById(R.id.ll_parent); // 听众ViewGroup
        parentLayout.setOnClickListener(this);
        secondAnchorView = view.findViewById(R.id.i_anchor_second); // 双麦时第二个主播
        fristAnchorImage = (SimpleDraweeView)view.findViewById(R.id.iv_anchor); // 第一个主播
        fristAnchorImage.setOnClickListener(this);
        secondAnchorImage = (SimpleDraweeView)view.findViewById(R.id.iv_anchor_second); // 第二个主播
        secondAnchorImage.setOnClickListener(this);
        moreView = view.findViewById(R.id.iv_staff_more); // 更多
        mikeView = view.findViewById(R.id.rl_mike); // 右边绿色View,用于点击事件
        shapeDrawable = (GradientDrawable)mikeView.getBackground();
        mikeView.setOnClickListener(this);
        mikeTextView = (TextView)view.findViewById(R.id.tv_mike); // 右边绿色框里面的文字
        micView = view.findViewById(R.id.iv_icon_mike); // mic

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_parent:
                if(staffClickListener != null)
                    staffClickListener.onAudienceClick();
                break;
            case R.id.iv_anchor:
                if(staffClickListener != null)
                    staffClickListener.onFristAnchorClick();
                break;
            case R.id.iv_anchor_second:
                if(staffClickListener != null)
                    staffClickListener.onSecondAnchorClick();
                break;
            case R.id.rl_mike:
                if(staffClickListener != null)
                    staffClickListener.onMikeClick(anchorMode);
                break;
        }
    }

    /**
     * 听众
     * @param mode
     * @param list
     */
    private void addAudienceChildView(LiveMode mode, List<String> list){
        int number = 0;
        if(list != null){
            number = list.size();
        }

        if(LiveMode.single == mode && number > 4 || number == 0)
            number = 4;
        if(LiveMode.doubles == mode && number > 2 || number == 0)
            number = 2;
        parentLayout.removeAllViews();
        for(int i = 0; i < number; i++){
            SimpleDraweeView imageview = new SimpleDraweeView(context);
            LayoutParams params = new LayoutParams(dip2px(33), dip2px(33));
            if(LiveMode.single == mode && i > 1){
                params.leftMargin = dip2px(-4);
            }else
                params.leftMargin = dip2px(6);
            imageview.setLayoutParams(params);

            if(list == null)
                downloadImage(imageview, null);
           else{
                if(i < list.size())
                    downloadImage(imageview, list.get(i));
                else
                    downloadImage(imageview, null);
            }
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.setRoundAsCircle(true);
            imageview.getHierarchy().setRoundingParams(roundingParams);
            imageview.setImageResource(R.drawable.anchor_head_portrait);
            parentLayout.addView(imageview);
        }
    }

    /**
     *
     * @param mode 单麦&双麦
     * @param list 主播头像集合
     */
    private void setAnchor(LiveMode mode, List<String> list){
        if(LiveMode.doubles == mode){
            secondAnchorView.setVisibility(View.VISIBLE);
            if(list != null && list.size() == 2){
                downloadImage(fristAnchorImage, list.get(0));
                downloadImage(secondAnchorImage, list.get(1));
            }
        }else{
            secondAnchorView.setVisibility(View.GONE);
            if(list != null && list.size() == 1){
                downloadImage(fristAnchorImage, list.get(0));
            }
        }
    }

    /**
     * 下载图片
     * @param imageView
     * @param url
     */
    private void downloadImage(ImageView imageView, String url){
        if(TextUtils.isEmpty(url))
            imageView.setImageResource(R.drawable.anchor_head_portrait);
        else{
            // 下载图片
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
                mikeTextView.setText("上麦");
                micView.setVisibility(View.VISIBLE);
                shapeDrawable.setColor(Color.parseColor("#80d422"));
                break;
            case underMike:
                mikeTextView.setText("下麦");
                micView.setVisibility(View.GONE);
                shapeDrawable.setColor(Color.parseColor("#f5a823"));
                break;
            case onMikeNoClick:
                mikeTextView.setText("上麦");
                micView.setVisibility(View.VISIBLE);
                shapeDrawable.setColor(Color.parseColor("#dbdbdb"));
                break;
            case rowMike:
                mikeTextView.setText("排麦中");
                micView.setVisibility(View.GONE);
                shapeDrawable.setColor(Color.parseColor("#f5a823"));
                break;
            case other:
                micView.setVisibility(View.GONE);
                shapeDrawable.setColor(Color.parseColor("#fe4f5c"));
                if(text != null)
                    mikeTextView.setText(text);
                break;
        }
    }

    public void setLiveView(LiveMode mode, List<String> list) {
        setAnchor(mode, list);
        addAudienceChildView(mode, list);
    }

    private OnStaffClickListener staffClickListener;

    /**
     * 注册点击事件
     * @param staffClickListener
     */
    public void setOnStaffClickListener(OnStaffClickListener staffClickListener) {
        this.staffClickListener = staffClickListener;
    }
    public interface OnStaffClickListener{

        /**
         * 听众点击事件
         */
        void onAudienceClick();

        /**
         * 第一个头像
         */
        void onFristAnchorClick();

        /**
         * 第二个头像
         */
        void onSecondAnchorClick();

        /**
         *  右测绿色按钮点击事件
         */
        void onMikeClick(AnchorMode mode);
    }

    private int dip2px(float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

}
