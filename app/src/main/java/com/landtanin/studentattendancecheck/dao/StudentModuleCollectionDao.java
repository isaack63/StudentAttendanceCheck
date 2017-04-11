package com.landtanin.studentattendancecheck.dao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.realm.RealmModel;
import io.realm.RealmObject;

/**
 * Created by landtanin on 4/10/2017 AD.
 */

public class StudentModuleCollectionDao extends RealmObject implements RealmModel {

    @SerializedName("students")
    @Expose
    private List<StudentModuleDao> data = null;



    public List<StudentModuleDao> getData() {
        return data;
    }

    public void setData(List<StudentModuleDao> data) {
        this.data = data;
    }
}
