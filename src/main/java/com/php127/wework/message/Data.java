package com.php127.wework.message;

import org.json.JSONObject;

public class Data {

    protected String msgid = "";
    protected String msgfrom = "";
    protected String roomid = "";
    protected String msgtype = "";
    protected String msgdata = "";
    protected long msgtime = 0;
    protected long seq = 0;
    protected String tolist = "";
    protected String sdkfileid = "";
    protected String text = "";
    protected String action = "";
    protected String mediaPath = "";

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public void setMediaPath(String mediaPath) {
        this.mediaPath = mediaPath;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setMsgdata(String msgdata) {
        this.msgdata = msgdata;
    }

    public void setMsgfrom(String msgfrom) {
        this.msgfrom = msgfrom;
    }

    public void setMsgtime(long msgtime) {
        this.msgtime = msgtime;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public void setSdkfileid(String sdkfileid) {
        this.sdkfileid = sdkfileid;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTolist(String tolist) {
        this.tolist = tolist;
    }

    public String getText() {
        return this.text;
    }

    public long getMsgtime() {
        return msgtime;
    }

    public long getSeq() {
        return seq;
    }

    public String getAction() {
        return action;
    }

    public String getMediaPath() {
        return mediaPath;
    }

    public String getMsgdata() {
        return msgdata;
    }

    public String getMsgfrom() {
        return msgfrom;
    }

    public String getMsgid() {
        return msgid;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public String getRoomid() {
        return roomid;
    }

    public String getSdkfileid() {
        return sdkfileid;
    }

    public String getTolist() {
        return tolist;
    }
}
