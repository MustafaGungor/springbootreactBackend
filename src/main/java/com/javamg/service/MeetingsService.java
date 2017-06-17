package com.javamg.service;

import com.javamg.entity.Meetings;

import java.util.List;

/**
 * Created by ucakyunus on 10.06.2017.
 */
public interface MeetingsService extends BaseService {

    void getId(Integer id);

    void createMeeting(Meetings meeting);

    void updateMeeting(Integer id);

    void deleteMeeting(Integer id);

    List<Meetings> getAllMeeting();
}
