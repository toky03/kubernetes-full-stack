package ch.toky.randgen.middletier.controller;

import ch.toky.randgen.middletier.model.PodStat;
import ch.toky.randgen.middletier.model.RandomNumber;
import ch.toky.randgen.middletier.repository.PodStatRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class MiddletierController {

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private PodStatRepository podStatRepository;
    private Map<String, String> env = System.getenv();

    @RequestMapping(value = "/", produces = "application/json")
    public RandomNumber getRandom() {

        RandomNumber randNum = getNewRandomNumber();
        Long maxCountId = podStatRepository.countUniqueId(randNum.getId());
        Long maxCountOverall = podStatRepository.findMaxCount();
        PodStat tmpPod = new PodStat();
        tmpPod.setId(randNum.getId());
        tmpPod.setTimeStamp(maxCountOverall+1);
        tmpPod.setCounter(maxCountId +1);
        podStatRepository.save(tmpPod);

        return randNum;

    }

    private RandomNumber getNewRandomNumber() {

        String randGenUrl=env.get("RANDOM_GENERATOR_URL");
        String URL = randGenUrl;
        RestTemplate restTemplate = new RestTemplate();

        return   restTemplate.getForObject(URL, RandomNumber.class);

    }
}
