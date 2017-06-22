package com.javamg.controller;

import com.javamg.entity.Meetings;
import com.javamg.service.MeetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
@RestController
@RequestMapping("meetings")
@CrossOrigin(origins = "http://localhost:3000")
public class MeetingsController {

    @Autowired
    private MeetingsService meetingsService;
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
