package models;

import java.util.*;
/**
 * Created by KellyAnn on 11/30/14.
 */
public class ReminderModel {

    private int _reminderId;
    private Date _expectedDate;
    private Date _completionDate;
    private int _userId;
    private int _itemId;

    public ReminderModel(int reminderId, Date expectedDate ,Date completionDate, int userId, int itemId) {
        this._reminderId = reminderId;
        this._expectedDate = expectedDate;
        this._completionDate = completionDate;
        this._userId = userId;
        this._itemId = itemId;
    }

    public int getReminderId(){
        return _reminderId;
    }

    public void setReminderId(int reminderId){
        this._reminderId = reminderId;
    }

    public int getUserId(){
        return _userId;
    }

    public void setUserId(int userId){
        this._userId = userId;
    }

    public int getItemId(){
        return _itemId;
    }

    public void seItemId(int itemId){
        this._itemId = itemId;
    }

    public Date getExpectedDate(){
        return _expectedDate;
    }
    public Date getCompletionDate() {
        return _completionDate;
    }
}