package com.example.test.myapplication;

import java.util.List;

public class ExhibitionTagEntity {

    /**
     * approvalState : 0
     * collectionDesc : 作品：癌宝宝霓虹灯
     作者：陆扬
     类型：装置艺术
     材质：霓虹灯
     尺寸：120cm
     时间：2014
     * collectionId : clt1444722961866
     * collectionPic : http://img.51baoku.com/pic/1064-1500-5626090adc44640ec12b2889257bd39b
     * commentCount : 0
     * coverPic : http://img.51baoku.com/pic/1064-1500-5626090adc44640ec12b2889257bd39b
     * createTime : 1444722953
     * feedTagList : [{"tagAttentionCount":0,"tagCollectionCount":0,"tagExhibitCount":0,"tagId":"26","tagName":"装置","tagType":0},{"tagAttentionCount":0,"tagCollectionCount":0,"tagExhibitCount":0,"tagId":"143","tagName":"修改分类","tagType":0}]
     * forwardCount : 1
     * hided : 0
     * hot : 0
     * isLike : 0
     * isTop : 0
     * likeCount : 0
     * userId : 3896407132025942
     * userVo : {"address":"上海黄浦区尚文路133弄10号","age":1,"attentionCount":0,"authStatus":"1","authText":"仁庐 Rén Space画廊 宝库官方账号","fansCount":0,"forwardCollectionCount":0,"headPhoto":"http://img.51baoku.com/pic/690-690-84552422930743bddcdee33cc5934baa/0","nick":"仁庐RénSpace","originCollectionCount":0,"originExhibitCount":0,"personBrief":"坐落在上海老城厢的仁庐是一个致力于为艺术家及策展人提供驻村项目、展览、工作坊和对话的艺术空间。作为一个交流与实验的艺术平台，仁庐为新一代富有文化特色的艺术家和团体提供他们所需要的，创造与国际同行进行深层对话与研讨的机会与条件。","phoneNum":"","relationship":0,"sex":3,"userId":"3896407132025942","userStatus":"1"}
     * visibility : 0
     */

    private int approvalState;
    private String collectionDesc;
    private String collectionId;
    private String collectionPic;
    private int commentCount;
    private String coverPic;
    private String createTime;
    private int forwardCount;
    private int hided;
    private int hot;
    private int isLike;
    private int isTop;
    private int likeCount;
    private String userId;
    /**
     * address : 上海黄浦区尚文路133弄10号
     * age : 1
     * attentionCount : 0
     * authStatus : 1
     * authText : 仁庐 Rén Space画廊 宝库官方账号
     * fansCount : 0
     * forwardCollectionCount : 0
     * headPhoto : http://img.51baoku.com/pic/690-690-84552422930743bddcdee33cc5934baa/0
     * nick : 仁庐RénSpace
     * originCollectionCount : 0
     * originExhibitCount : 0
     * personBrief : 坐落在上海老城厢的仁庐是一个致力于为艺术家及策展人提供驻村项目、展览、工作坊和对话的艺术空间。作为一个交流与实验的艺术平台，仁庐为新一代富有文化特色的艺术家和团体提供他们所需要的，创造与国际同行进行深层对话与研讨的机会与条件。
     * phoneNum :
     * relationship : 0
     * sex : 3
     * userId : 3896407132025942
     * userStatus : 1
     */

    private UserVoEntity userVo;
    private int visibility;
    /**
     * tagAttentionCount : 0
     * tagCollectionCount : 0
     * tagExhibitCount : 0
     * tagId : 26
     * tagName : 装置
     * tagType : 0
     */

    private List<FeedTagListEntity> feedTagList;

    public void setApprovalState(int approvalState) {
        this.approvalState = approvalState;
    }

    public void setCollectionDesc(String collectionDesc) {
        this.collectionDesc = collectionDesc;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public void setCollectionPic(String collectionPic) {
        this.collectionPic = collectionPic;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setForwardCount(int forwardCount) {
        this.forwardCount = forwardCount;
    }

    public void setHided(int hided) {
        this.hided = hided;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public void setIsLike(int isLike) {
        this.isLike = isLike;
    }

    public void setIsTop(int isTop) {
        this.isTop = isTop;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserVo(UserVoEntity userVo) {
        this.userVo = userVo;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public void setFeedTagList(List<FeedTagListEntity> feedTagList) {
        this.feedTagList = feedTagList;
    }

    public int getApprovalState() {
        return approvalState;
    }

    public String getCollectionDesc() {
        return collectionDesc;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public String getCollectionPic() {
        return collectionPic;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public String getCreateTime() {
        return createTime;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public int getHided() {
        return hided;
    }

    public int getHot() {
        return hot;
    }

    public int getIsLike() {
        return isLike;
    }

    public int getIsTop() {
        return isTop;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public String getUserId() {
        return userId;
    }

    public UserVoEntity getUserVo() {
        return userVo;
    }

    public int getVisibility() {
        return visibility;
    }

    public List<FeedTagListEntity> getFeedTagList() {
        return feedTagList;
    }

    public static class UserVoEntity {
        private String address;
        private int age;
        private int attentionCount;
        private String authStatus;
        private String authText;
        private int fansCount;
        private int forwardCollectionCount;
        private String headPhoto;
        private String nick;
        private int originCollectionCount;
        private int originExhibitCount;
        private String personBrief;
        private String phoneNum;
        private int relationship;
        private int sex;
        private String userId;
        private String userStatus;

        public void setAddress(String address) {
            this.address = address;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setAttentionCount(int attentionCount) {
            this.attentionCount = attentionCount;
        }

        public void setAuthStatus(String authStatus) {
            this.authStatus = authStatus;
        }

        public void setAuthText(String authText) {
            this.authText = authText;
        }

        public void setFansCount(int fansCount) {
            this.fansCount = fansCount;
        }

        public void setForwardCollectionCount(int forwardCollectionCount) {
            this.forwardCollectionCount = forwardCollectionCount;
        }

        public void setHeadPhoto(String headPhoto) {
            this.headPhoto = headPhoto;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public void setOriginCollectionCount(int originCollectionCount) {
            this.originCollectionCount = originCollectionCount;
        }

        public void setOriginExhibitCount(int originExhibitCount) {
            this.originExhibitCount = originExhibitCount;
        }

        public void setPersonBrief(String personBrief) {
            this.personBrief = personBrief;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public void setRelationship(int relationship) {
            this.relationship = relationship;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setUserStatus(String userStatus) {
            this.userStatus = userStatus;
        }

        public String getAddress() {
            return address;
        }

        public int getAge() {
            return age;
        }

        public int getAttentionCount() {
            return attentionCount;
        }

        public String getAuthStatus() {
            return authStatus;
        }

        public String getAuthText() {
            return authText;
        }

        public int getFansCount() {
            return fansCount;
        }

        public int getForwardCollectionCount() {
            return forwardCollectionCount;
        }

        public String getHeadPhoto() {
            return headPhoto;
        }

        public String getNick() {
            return nick;
        }

        public int getOriginCollectionCount() {
            return originCollectionCount;
        }

        public int getOriginExhibitCount() {
            return originExhibitCount;
        }

        public String getPersonBrief() {
            return personBrief;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public int getRelationship() {
            return relationship;
        }

        public int getSex() {
            return sex;
        }

        public String getUserId() {
            return userId;
        }

        public String getUserStatus() {
            return userStatus;
        }
    }

    public static class FeedTagListEntity {
        private int tagAttentionCount;
        private int tagCollectionCount;
        private int tagExhibitCount;
        private String tagId;
        private String tagName;
        private int tagType;

        public void setTagAttentionCount(int tagAttentionCount) {
            this.tagAttentionCount = tagAttentionCount;
        }

        public void setTagCollectionCount(int tagCollectionCount) {
            this.tagCollectionCount = tagCollectionCount;
        }

        public void setTagExhibitCount(int tagExhibitCount) {
            this.tagExhibitCount = tagExhibitCount;
        }

        public void setTagId(String tagId) {
            this.tagId = tagId;
        }

        public void setTagName(String tagName) {
            this.tagName = tagName;
        }

        public void setTagType(int tagType) {
            this.tagType = tagType;
        }

        public int getTagAttentionCount() {
            return tagAttentionCount;
        }

        public int getTagCollectionCount() {
            return tagCollectionCount;
        }

        public int getTagExhibitCount() {
            return tagExhibitCount;
        }

        public String getTagId() {
            return tagId;
        }

        public String getTagName() {
            return tagName;
        }

        public int getTagType() {
            return tagType;
        }
    }
}
