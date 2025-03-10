package org.utwente.cs.ds.semi.lod.dblp.model;

import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("@code")
    private String code;
    private String text;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
