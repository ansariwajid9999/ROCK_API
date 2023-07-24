package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceClass {
    @Autowired
    private RepositoryClass repositoryClassObj;


    public String addTravelListItem(TravelList item){

        return repositoryClassObj.addTravelListItem(item);

    }

    public List<String> getTravelPlacesList(Integer userId){


        List<TravelList> travelLists = repositoryClassObj.getTravelListDetails(userId);
        //Service layer is to process/do some logic part


        List<String> placesToVisit = new ArrayList<>();

        for(TravelList travelListItem :travelLists){

            placesToVisit.add(travelListItem.getPlaceName());

        }

        return placesToVisit;
    }

}
