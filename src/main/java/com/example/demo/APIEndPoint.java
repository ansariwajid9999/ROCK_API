package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
@RestController
public class APIEndPoint {
    HashMap<Integer,User> userDb = new HashMap<>();
    @GetMapping("/getWeatherDetails")
    public String getWeatherInfo(){
        return "Today weather is sunny";
    }
    @GetMapping("/calculateSum")
    public String calculateSum(@RequestParam("n1")Integer n1,@RequestParam("n2")Integer n2){
        int sum=n1+n2;
        return "The sum is "+sum;
    }
    @PostMapping("/signUpUser")
    public String signUpUser(@RequestBody User user){
        int primaryKey= user.getUserId();
        userDb.put(primaryKey,user);
        return "User with the name "+user.getName() + "has been added to the DB";
    }
    @GetMapping("/getUserById")
    public User findUserById(@RequestParam("userId")Integer userId){
        User user = userDb.get(userId);
        return user;
    }
    @GetMapping("/getListOfPeople/{country}")
    public List<User> getListOfUsers(@PathVariable("country")String country){
        List<User> ansList = new ArrayList<>();
        for(User user : userDb.values()){
            if(user.getCountry().equals(country)){
                ansList.add(user);
            }
        }
        return ansList;
    }
    @PutMapping("/updateUserInfo")
    public String updateUser(@RequestBody User updatedUserDetails,@RequestParam("userId")Integer userId){
        int primaryKey = userId;
        userDb.put(primaryKey,updatedUserDetails);
        return "User with userId "+userId +" has been modified";
    }
    @DeleteMapping("/deleteUser/{name}")
    public String deleteUser(@PathVariable("name")String name){
        for(int key : userDb.keySet()){
            User user = userDb.get(key);
            if(user.getName().equals(name)){
                userDb.remove(key);
            }
        }
        return "users with the name "+name+" have been removed ";
    }
}
