package ch.toky.randgen.statservice.controller;

import ch.toky.randgen.statservice.model.Series;
import ch.toky.randgen.statservice.model.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    StatService statService;


    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<Stat> getAllPodStats(){

        return statService.getAllPodStats();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/history")
    public List<Series> getAllPodStatHistory(){

        return statService.getPodHistory();

    }

}
