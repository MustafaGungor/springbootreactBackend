package com.javamg.controller;

import com.javamg.entity.Meetings;
import com.javamg.service.MeetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ucakyunus on 10.06.2017.
 */
@RestController
@RequestMapping("meetings")
public class MeetingsController {

    @Autowired
    private MeetingsService meetingsService;
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "read", method = RequestMethod.GET)
    public List<Meetings> getAllMeetings() {
        return meetingsService.getAllMeeting();
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public void createMeetings(Meetings meetings) {
        meetingsService.createMeeting(meetings);
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public void updateMeetings(@PathVariable("id") Integer id) {
        meetingsService.updateMeeting(id);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteMeetings(@PathVariable("id") Integer id) {
        meetingsService.deleteMeeting(id);
    }
}
