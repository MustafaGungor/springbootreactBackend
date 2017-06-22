package com.javamg.service;

import com.javamg.entity.Meetings;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
public interface MeetingsService extends BaseService {

    void getId(Integer id);

    void createMeeting(Meetings meeting);

    void updateMeeting(Integer id);

    void deleteMeeting(Integer id);

    List<Meetings> getAllMeeting();
}
