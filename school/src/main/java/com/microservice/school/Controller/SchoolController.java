package com.microservice.school.Controller;
import com.microservice.school.Service.SchoolService;
import com.microservice.school.entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RequestMapping(path = "/school")
@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;
    @PostMapping
    public School addSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }
    @GetMapping
    public List<School> fetchSchools(){
        return  schoolService.fetchSchools();
    }
    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable int id){
        return schoolService.fetchSchoolById(id);
    }
}