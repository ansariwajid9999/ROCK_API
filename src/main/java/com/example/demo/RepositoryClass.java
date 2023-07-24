package com.example.demo;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Repository
public class RepositoryClass {
    HashMap<Integer,List<TravelList>> travelListHashMap = new HashMap<>();


    public String addTravelListItem(TravelList travelListItem){

        int PrimaryKey = travelListItem.getUserId();

        List<TravelList> travelItems = travelListHashMap.getOrDefault(PrimaryKey,new ArrayList<>());

        travelItems.add(travelListItem);

        travelListHashMap.put(PrimaryKey,travelItems);

        return "Travel List Item has been added to bucket List";
    }


    public List<TravelList> getTravelListDetails(Integer userId){

        return travelListHashMap.getOrDefault(userId,new ArrayList<>());

    }

}
