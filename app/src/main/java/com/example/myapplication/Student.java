package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    private String name;
    private String school_name;
    private String city;

    public Student(String name, String school_name, String city) {
        this.name = name;
        this.school_name = school_name;
        this.city = city;
    }

    public Student()
    {
        super();
    }

    public Student(Parcel parcel)
    {
        this.city=parcel.readString();
        this.name=parcel.readString();
        this.school_name=parcel.readString();
    }


    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.city);
        dest.writeString(this.name);
        dest.writeString(this.school_name);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
