package com.rachev.burgasplaces.models;

import java.io.Serializable;

public class Place implements Serializable
{
    public String name;
    public String type;
    public String openHours;
    public String address;
    public String shortInfo;
    public String contactPhone;
    public String documentId;
    public boolean isFavourite;
    
    public Place()
    {
    }
    
    public Place(String name, String type, String openHours, String address, String shortInfo,
                 String contactPhone, String documentId, boolean isFavourite)
    {
        this.name = name;
        this.type = type;
        this.openHours = openHours;
        this.address = address;
        this.shortInfo = shortInfo;
        this.documentId = documentId;
        this.contactPhone = contactPhone;
        this.isFavourite = isFavourite;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getContactPhone()
    {
        return contactPhone;
    }
    
    public String getDocumentId()
    {
        return documentId;
    }
    
    public String getOpenHours()
    {
        return openHours;
    }
    
    public String getShortInfo()
    {
        return shortInfo;
    }
    
    public String getType()
    {
        return type;
    }
    
    public boolean isFavourite()
    {
        return isFavourite;
    }
    
    public void setFavourite(boolean favourite)
    {
        isFavourite = favourite;
    }
}
