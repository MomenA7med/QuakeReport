package com.example.android.quakereport;
/**
 * Created by AL-Motahida on 02/03/2018.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private Long mDate;
    private String mUrl;
    public Earthquake (double magnitude,String location,Long date,String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }
    public double getmMagnitude()
    {return mMagnitude;};
    public String getmLocation()
    {return mLocation;};
    public Long getmDate()
    {return mDate;};
    public String getmUrl()
    {return mUrl;};

}
