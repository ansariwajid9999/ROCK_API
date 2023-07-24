package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travel")
public class ControllerClass {
    @Autowired
    private ServiceClass serviceClassObj;

    @PostMapping("/addTravelItem")
    public String addTravelItem(@RequestBody TravelList travelList){

        String ans = serviceClassObj.addTravelListItem(travelList);
        return ans;
    }

    @GetMapping("/getTravelPlacesList")
    public List<String> getTravelPlacesList(@RequestParam("userId")Integer userId){

        List<String> ans=serviceClassObj.getTravelPlacesList(userId);
        return ans;

    }


}
