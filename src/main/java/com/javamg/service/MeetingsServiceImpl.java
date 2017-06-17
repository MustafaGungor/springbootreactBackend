package com.javamg.service;

import com.javamg.dao.MeetingsDao;
import com.javamg.entity.Meetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ucakyunus on 10.06.2017.
 */
@Service
public class MeetingsServiceImpl implements MeetingsService {

    @Autowired
    private MeetingsDao meetingsDao;

    @Override
    public void getId(Integer id) {

    }

    @Override
    public void createMeeting(Meetings meeting) {
        meetingsDao.create(meeting);
    }

    @Override
    public void updateMeeting(Integer id) {
        meetingsDao.getId(id);
    }

    @Override
    public void deleteMeeting(Integer id) {
        meetingsDao.getId(id);
    }

    @Override
    public List<Meetings> getAllMeeting() {
        return meetingsDao.getAllList();
    }
}
