package com.meuteste.testejenkins;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolves;
    private String mSuspect;


    public String getFotoFileName(){
        return "IMG"+getmId().toString()+".jpg";
    }

    public String getmSuspect() {
        return mSuspect;
    }

    public void setmSuspect(String mSuspect) {
        this.mSuspect = mSuspect;
    }

    public Crime() {
        this(UUID.randomUUID());
        this.mDate = new Date();
    }

    public Crime(UUID id){
        mId=id;
        mDate=new Date();
    }
    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolves() {
        return mSolves;
    }

    public void setmSolves(boolean mSolves) {
        this.mSolves = mSolves;
    }

    public UUID getmId() {

        return mId;
    }

    public Crime(UUID mId, Date mDate) {
        this.mId = mId;
        this.mDate = new Date();



    }
}
