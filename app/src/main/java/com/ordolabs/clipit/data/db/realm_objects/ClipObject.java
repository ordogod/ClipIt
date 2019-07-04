package com.ordolabs.clipit.data.db.realm_objects;

import android.support.annotation.NonNull;

import javax.annotation.Nullable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by ordogod on 18.06.19.
 **/

public class ClipObject extends RealmObject {

    @PrimaryKey private int id;
    @Nullable private String title;
    @NonNull private String body;
    @NonNull private String datetime;
    @NonNull private boolean isViewed;

    public int getId() {
        return id;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    @NonNull
    public String getBody() {
        return body;
    }

    @NonNull
    public String getDateTime() {
        return datetime;
    }

    public boolean isViewed() {
        return isViewed;
    }

    public void setTitle(@Nullable String title) {
        this.title = title;
    }

    public void setBody(@NonNull String body) {
        this.body = body;
    }

    public void setDateTime(@NonNull String date) {
        this.datetime = date;
    }

    public void setViewed(boolean viewed) {
        isViewed = viewed;
    }
}
