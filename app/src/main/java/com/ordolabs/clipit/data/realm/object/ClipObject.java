package com.ordolabs.clipit.data.realm.object;

import android.support.annotation.NonNull;

import javax.annotation.Nullable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by ordogod on 18.06.19.
 **/

public class ClipObject extends RealmObject {

    @PrimaryKey private int     id;
    @Nullable   private String  title;
    @NonNull    private String  body;
    @NonNull    private String  date;
                private boolean isViewed;
                private boolean isRemoved;

    public ClipObject init(
            String title,
            String body,
            String datetime,
            boolean isViewed,
            boolean isRemoved)
    {
        this.title = title;
        this.body = body;
        this.date = datetime;
        this.isViewed = isViewed;
        this.isRemoved = isRemoved;

        return this;
    }

              public int getId() { return id; }
    @Nullable public String getTitle() { return title; }
    @NonNull  public String getBody() { return body; }
    @NonNull  public String getDateTime() { return date; }
              public boolean isRemoved() { return isRemoved; }
              public boolean isViewed() { return isViewed; }

    public void setTitle(@Nullable String title) { this.title = title; }
    public void setBody(@NonNull String body) { this.body = body; }
    public void setViewed(boolean viewed) { isViewed = viewed; }
    public void setRemoved(boolean removed) { isRemoved = removed; }

    // no date and id setters – should not
    // be editied – set in init() only
}
