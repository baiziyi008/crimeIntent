package com.mfx.android.criminaintent.bean;

import java.util.Date;
import java.util.UUID;

/**
 * Created by mafuxin on 2018/3/18.
 */

public class Crime {
    private UUID    mId;
    private String mTitle;
    private Date    mDate;
    private boolean isSolved;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }

    public Crime() {
        this.mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
