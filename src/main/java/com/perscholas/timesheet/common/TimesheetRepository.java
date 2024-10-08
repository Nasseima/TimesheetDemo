package com.perscholas.timesheet.common;

import jakarta.annotation.PostConstruct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface TimesheetRepository extends JpaRepository <Timesheet, Integer> {

    List<Timesheet> findByLocation(Location location);
}



//private final JdbcClient jdbcClient;
//
//
//public TimesheetRepository(JdbcClient jdbcClient) {
//    this.jdbcClient = jdbcClient;
//}
//
//public List<Timesheet> findAll(){
//    return jdbcClient.sql("SELECT * FROM Timesheet").query(Timesheet.class).list();
//}
//
//public void create(Timesheet timesheet){
//
//    jdbcClient.sql("CREATE timesheet SET name = :name," +
//                    " punchInTime = :punchInTime, punchOutTime = :punchOutTime, hoursWorked " +
//                    "= :hoursWorked, location = :location, payRate = :payRate WHERE id = :id")
//            .param("id", timesheet.id())
//            .param("name", timesheet.name())
//            .param("punchInTime", timesheet.punch_in_time())
//            .param("punchOutTime", timesheet.punch_out_time())
//            .param("hoursWorked", timesheet.hours_worked())
//            .param("location", timesheet.location().name())
//            .param("payRate", timesheet.pay_rate())
//            .update();
//}
//
//public void update(Timesheet timesheet, Integer id){
//    jdbcClient.sql("UPDATE timesheet SET name = :name, punchInTime = " +
//                    ":punchInTime, punchOutTime = :punchOutTime, hoursWorked = :hoursWorked, location = :location, payRate = :payRate WHERE id = :id")
//            .param("id", id)
//            .param("name", timesheet.name())
//            .param("punchInTime", timesheet.punch_in_time())
//            .param("punchOutTime", timesheet.punch_out_time())
//            .param("hoursWorked", timesheet.hours_worked())
//            .param("location", timesheet.location().name())
//            .param("payRate", timesheet.pay_rate())
//            .update();
//}
//public void delete(Integer id){
//    jdbcClient.sql("DELETE FROM timesheet WHERE id = :id")
//            .param("id", id)
//            .update();
//}
//public Optional<Timesheet> findByID(Integer id){
//    return jdbcClient.sql("SELECT * FROM timesheet WHERE id = :id")
//            .param( "id", id)
//            .query(Timesheet.class)
//            .optional();
//}

//Different code starting here!!

//    private final List<Timesheet> timesheets = new ArrayList<>();
//
//    @PostConstruct
//    private void init(){
//        System.out.println("Timesheet Repository was created");
//        Timesheet timesheet1 = new Timesheet(1, "August 19th", LocalDateTime.now(), LocalDateTime.now().plus(8, ChronoUnit.HOURS),
//                8, Location.OFFICE, 100.0
//        );
//        Timesheet timesheet2 = new Timesheet(2, "August 20th", LocalDateTime.now(), LocalDateTime.now().plus(8, ChronoUnit.HOURS),
//                8, Location.OFFICE, 100.0
//        );
//        Timesheet timesheet3 = new Timesheet(3, "August 21st", LocalDateTime.now(), LocalDateTime.now().plus(8, ChronoUnit.HOURS),
//                8, Location.OFFICE, 100.0
//        );
//
//        timesheets.add(timesheet1);
//        timesheets.add(timesheet2);
//        timesheets.add(timesheet3);
//    }
//   public List<Timesheet> findAll() {
//        return timesheets;
//    }
//    public Optional<Timesheet> findByID(Integer id) {
//        return timesheets.stream().filter(timesheet -> timesheet.id().equals(id)).
//                findFirst();
//    }
//    public void create (Timesheet timesheet) {
//        timesheets.add(timesheet);
//    }
//
//    public void update(Timesheet timesheet, Integer id){
//        Optional<Timesheet> existingTimesheet = findByID(id);
//        if(existingTimesheet.isPresent()) {
//            timesheets.set(timesheets.indexOf(existingTimesheet.get()), timesheet);
//        }
//    }
//
//    public void delete(Integer id){
//        Optional<Timesheet> existingTimesheet = findByID(id);
//        if(existingTimesheet.isPresent()) {
//            timesheets.remove(existingTimesheet.get());
//        }
//    }
