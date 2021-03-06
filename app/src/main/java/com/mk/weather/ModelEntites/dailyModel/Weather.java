
package com.mk.weather.ModelEntites.dailyModel;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Weather {

    @SerializedName("code")
    private Long mCode;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("icon")
    private String mIcon;

    public Long getCode() {
        return mCode;
    }

    public void setCode(Long code) {
        mCode = code;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

}
