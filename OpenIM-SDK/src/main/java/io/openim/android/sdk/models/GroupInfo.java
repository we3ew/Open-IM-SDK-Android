package io.openim.android.sdk.models;

public class GroupInfo {
    /**
     * 组ID
     */
    private String groupID;
    /**
     * 群名
     */
    private String groupName;
    /**
     * 群公告
     */
    private String notification;
    /**
     * 群简介
     */
    private String introduction;
    /**
     * 群头像
     */
    private String faceURL;
    /**
     * 群主id
     */
    private String ownerUserID;
    /**
     * 创建时间
     */
    private long createTime;
    /**
     * 群成员数量
     */
    private int memberCount;
    /**
     * ok = 0 blocked = 1 Dismissed = 2 Muted  = 3
     */
    private int status;
    private String creatorUserID;
    private int groupType;
    private String ex;

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getFaceURL() {
        return faceURL;
    }

    public void setFaceURL(String faceURL) {
        this.faceURL = faceURL;
    }

    public String getOwnerUserID() {
        return ownerUserID;
    }

    public void setOwnerUserID(String ownerUserID) {
        this.ownerUserID = ownerUserID;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreatorUserID() {
        return creatorUserID;
    }

    public void setCreatorUserID(String creatorUserID) {
        this.creatorUserID = creatorUserID;
    }

    public int getGroupType() {
        return groupType;
    }

    public void setGroupType(int groupType) {
        this.groupType = groupType;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }
}
