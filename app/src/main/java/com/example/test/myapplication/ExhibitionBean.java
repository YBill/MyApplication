package com.example.test.myapplication;

/**
 * Created by 卫彪 on 2015/11/24.
 */
public class ExhibitionBean {

    /**
     * exhibitId : clt3907319423398654
     * exhibitCoverUrl : http://img.51baoku.com/pic/750-950-51160d6301dabfb0a9f3e2e781ba730c
     * exhibitName : 霍华德
     * exhibitFounderId : 3907272799514908
     * exhibitFounderName : 策展人/baoku123
     * exhibitTemplateId : 2
     * exhibitBrief :
     * createTime : 1447061008
     * isLike : 0
     * likeCount : 0
     * forwardCount : 0
     * commentCount : 0
     * viewCount : 1
     * userVo : {"userId":"3907272799514908","nick":"baoku123","sex":0,"age":0,"authStatus":"0","headPhoto":"http://img.51baoku.com/pic/750-466-69a3c02b5cbd79499dcbf0973673b0c3/0","fansCount":0,"forwardCollectionCount":0,"attentionCount":0,"originExhibitCount":0,"originCollectionCount":0,"relationship":0}
     * approvalState : 0
     * hot : 0
     * exhibitTemplateDomain : {"templateId":"2","templateName":"色界","templateDetailPic":"http://img.51baoku.com/pic/500-633-3bc9ffbe23f47ff560d1dd435091fda4","templateShowPic":"http://img.51baoku.com/pic/750-300-e58ef2a5123e01fdb51523ca7f45348a","templateCreateUrl":"http://test.sapi.51baoku.com/mobile/exhibit/template/template2/create.html","templateViewUrl":"http://test.sapi.51baoku.com/mobile/exhibit/template/template2/view.html","templateBrief":"创投六人行，艺术本初心。\nI AM NOT THE ARTIST!I AM AN ARTIST!\n我，不是艺术家;我，也是艺术家。\n金秋十月，共聚秋艺大展，\u201c色\u2022界\u201d不见不散!","exhibitCoverHtml":"template2_zhuye.html","usedCount":0}
     */

    private String exhibitId;
    private String exhibitCoverUrl;
    private String exhibitName;
    private String exhibitFounderId;
    private String exhibitFounderName;
    private String exhibitTemplateId;
    private String exhibitBrief;
    private String createTime;
    private int isLike;
    private int likeCount;
    private int forwardCount;
    private int commentCount;
    private int viewCount;
    /**
     * userId : 3907272799514908
     * nick : baoku123
     * sex : 0
     * age : 0
     * authStatus : 0
     * headPhoto : http://img.51baoku.com/pic/750-466-69a3c02b5cbd79499dcbf0973673b0c3/0
     * fansCount : 0
     * forwardCollectionCount : 0
     * attentionCount : 0
     * originExhibitCount : 0
     * originCollectionCount : 0
     * relationship : 0
     */

    private UserVoEntity userVo;
    private int approvalState;
    private int hot;
    /**
     * templateId : 2
     * templateName : 色界
     * templateDetailPic : http://img.51baoku.com/pic/500-633-3bc9ffbe23f47ff560d1dd435091fda4
     * templateShowPic : http://img.51baoku.com/pic/750-300-e58ef2a5123e01fdb51523ca7f45348a
     * templateCreateUrl : http://test.sapi.51baoku.com/mobile/exhibit/template/template2/create.html
     * templateViewUrl : http://test.sapi.51baoku.com/mobile/exhibit/template/template2/view.html
     * templateBrief : 创投六人行，艺术本初心。
     I AM NOT THE ARTIST!I AM AN ARTIST!
     我，不是艺术家;我，也是艺术家。
     金秋十月，共聚秋艺大展，“色•界”不见不散!
     * exhibitCoverHtml : template2_zhuye.html
     * usedCount : 0
     */

    private ExhibitTemplateDomainEntity exhibitTemplateDomain;

    public void setExhibitId(String exhibitId) {
        this.exhibitId = exhibitId;
    }

    public void setExhibitCoverUrl(String exhibitCoverUrl) {
        this.exhibitCoverUrl = exhibitCoverUrl;
    }

    public void setExhibitName(String exhibitName) {
        this.exhibitName = exhibitName;
    }

    public void setExhibitFounderId(String exhibitFounderId) {
        this.exhibitFounderId = exhibitFounderId;
    }

    public void setExhibitFounderName(String exhibitFounderName) {
        this.exhibitFounderName = exhibitFounderName;
    }

    public void setExhibitTemplateId(String exhibitTemplateId) {
        this.exhibitTemplateId = exhibitTemplateId;
    }

    public void setExhibitBrief(String exhibitBrief) {
        this.exhibitBrief = exhibitBrief;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setIsLike(int isLike) {
        this.isLike = isLike;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public void setForwardCount(int forwardCount) {
        this.forwardCount = forwardCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public void setUserVo(UserVoEntity userVo) {
        this.userVo = userVo;
    }

    public void setApprovalState(int approvalState) {
        this.approvalState = approvalState;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public void setExhibitTemplateDomain(ExhibitTemplateDomainEntity exhibitTemplateDomain) {
        this.exhibitTemplateDomain = exhibitTemplateDomain;
    }

    public String getExhibitId() {
        return exhibitId;
    }

    public String getExhibitCoverUrl() {
        return exhibitCoverUrl;
    }

    public String getExhibitName() {
        return exhibitName;
    }

    public String getExhibitFounderId() {
        return exhibitFounderId;
    }

    public String getExhibitFounderName() {
        return exhibitFounderName;
    }

    public String getExhibitTemplateId() {
        return exhibitTemplateId;
    }

    public String getExhibitBrief() {
        return exhibitBrief;
    }

    public String getCreateTime() {
        return createTime;
    }

    public int getIsLike() {
        return isLike;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public UserVoEntity getUserVo() {
        return userVo;
    }

    public int getApprovalState() {
        return approvalState;
    }

    public int getHot() {
        return hot;
    }

    public ExhibitTemplateDomainEntity getExhibitTemplateDomain() {
        return exhibitTemplateDomain;
    }

    public static class UserVoEntity {
        private String userId;
        private String nick;
        private int sex;
        private int age;
        private String authStatus;
        private String headPhoto;
        private int fansCount;
        private int forwardCollectionCount;
        private int attentionCount;
        private int originExhibitCount;
        private int originCollectionCount;
        private int relationship;

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setAuthStatus(String authStatus) {
            this.authStatus = authStatus;
        }

        public void setHeadPhoto(String headPhoto) {
            this.headPhoto = headPhoto;
        }

        public void setFansCount(int fansCount) {
            this.fansCount = fansCount;
        }

        public void setForwardCollectionCount(int forwardCollectionCount) {
            this.forwardCollectionCount = forwardCollectionCount;
        }

        public void setAttentionCount(int attentionCount) {
            this.attentionCount = attentionCount;
        }

        public void setOriginExhibitCount(int originExhibitCount) {
            this.originExhibitCount = originExhibitCount;
        }

        public void setOriginCollectionCount(int originCollectionCount) {
            this.originCollectionCount = originCollectionCount;
        }

        public void setRelationship(int relationship) {
            this.relationship = relationship;
        }

        public String getUserId() {
            return userId;
        }

        public String getNick() {
            return nick;
        }

        public int getSex() {
            return sex;
        }

        public int getAge() {
            return age;
        }

        public String getAuthStatus() {
            return authStatus;
        }

        public String getHeadPhoto() {
            return headPhoto;
        }

        public int getFansCount() {
            return fansCount;
        }

        public int getForwardCollectionCount() {
            return forwardCollectionCount;
        }

        public int getAttentionCount() {
            return attentionCount;
        }

        public int getOriginExhibitCount() {
            return originExhibitCount;
        }

        public int getOriginCollectionCount() {
            return originCollectionCount;
        }

        public int getRelationship() {
            return relationship;
        }
    }

    public static class ExhibitTemplateDomainEntity {
        private String templateId;
        private String templateName;
        private String templateDetailPic;
        private String templateShowPic;
        private String templateCreateUrl;
        private String templateViewUrl;
        private String templateBrief;
        private String exhibitCoverHtml;
        private int usedCount;

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public void setTemplateName(String templateName) {
            this.templateName = templateName;
        }

        public void setTemplateDetailPic(String templateDetailPic) {
            this.templateDetailPic = templateDetailPic;
        }

        public void setTemplateShowPic(String templateShowPic) {
            this.templateShowPic = templateShowPic;
        }

        public void setTemplateCreateUrl(String templateCreateUrl) {
            this.templateCreateUrl = templateCreateUrl;
        }

        public void setTemplateViewUrl(String templateViewUrl) {
            this.templateViewUrl = templateViewUrl;
        }

        public void setTemplateBrief(String templateBrief) {
            this.templateBrief = templateBrief;
        }

        public void setExhibitCoverHtml(String exhibitCoverHtml) {
            this.exhibitCoverHtml = exhibitCoverHtml;
        }

        public void setUsedCount(int usedCount) {
            this.usedCount = usedCount;
        }

        public String getTemplateId() {
            return templateId;
        }

        public String getTemplateName() {
            return templateName;
        }

        public String getTemplateDetailPic() {
            return templateDetailPic;
        }

        public String getTemplateShowPic() {
            return templateShowPic;
        }

        public String getTemplateCreateUrl() {
            return templateCreateUrl;
        }

        public String getTemplateViewUrl() {
            return templateViewUrl;
        }

        public String getTemplateBrief() {
            return templateBrief;
        }

        public String getExhibitCoverHtml() {
            return exhibitCoverHtml;
        }

        public int getUsedCount() {
            return usedCount;
        }
    }
}
