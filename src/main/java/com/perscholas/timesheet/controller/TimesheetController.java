package com.perscholas.timesheet.controller;

import com.perscholas.timesheet.common.Timesheet;
import com.perscholas.timesheet.common.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/timesheets")
@RestController
public class TimesheetController {

    private final TimesheetRepository timesheetRepository;

    @Autowired
    public TimesheetController(TimesheetRepository timesheetRepo) {
        timesheetRepository = timesheetRepo;
    }

//    getting all of out timesheets
    @GetMapping("")
    public ResponseEntity<List<Timesheet>> home(){
        List<Timesheet> timesheets = timesheetRepository.findAll();
        return ResponseEntity.ok(timesheets);
    }

//
////    //Post a Timesheeet
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void CreateTimesheet(@RequestBody Timesheet timesheet){
    timesheetRepository.save(timesheet);
    }

////    // Get Item by id
    @GetMapping("/{id}")
    Timesheet getTimesheetByID(@PathVariable Integer id){
        Optional<Timesheet> timesheet = timesheetRepository.findById(id);

        if(timesheet.isEmpty()){
            throw new RuntimeException();
        }

//        return timesheetRepository.findByID(id);
        return timesheet.get();
    }
////
////    // Put a Timesheeet
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void updateTimesheet(@RequestBody Timesheet timesheet,
                         @PathVariable Integer id){

        timesheetRepository.save(timesheet);

    }
////
////    // Delete a Timesheeet
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteTimesheet(@PathVariable Integer id) {
        timesheetRepository.deleteById(id);
    }}
//
//}