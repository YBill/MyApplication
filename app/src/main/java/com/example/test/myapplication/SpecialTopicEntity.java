package com.example.test.myapplication;

/**
 * Created by 卫彪 on 2015/11/25.
 */
public class SpecialTopicEntity {

    /**
     * subjectId : 1446707611950
     * title : 宝库欲打造艺术APP No.1
     * imageUrl : http://img.51baoku.com/pic/640-343-161eb521a91f9af068e6de1fe025f04c
     * orderNum : 3
     * isOnline : 1
     * linkUrl : http://mp.weixin.qq.com/s?__biz=MzA5ODIwNjcyNw==&mid=400612776&idx=1&sn=0caf7419f9eccfa6460ae5425e97484a&scene=2&srcid=1104kKcUOtS6IH8AOA0xWJgf&from=timeline&isappinstalled=0#rd
     * createTime : 1446707633
     */

    private String subjectId;
    private String title;
    private String imageUrl;
    private int orderNum;
    private int isOnline;
    private String linkUrl;
    private String createTime;

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public void setIsOnline(int isOnline) {
        this.isOnline = isOnline;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public int getIsOnline() {
        return isOnline;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public String getCreateTime() {
        return createTime;
    }
}
