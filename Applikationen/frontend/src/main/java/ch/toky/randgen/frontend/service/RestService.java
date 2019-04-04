package ch.toky.randgen.frontend.service;

import ch.toky.randgen.frontend.model.PodStat;
import ch.toky.randgen.frontend.model.RandomNumber;
import ch.toky.randgen.frontend.model.Series;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class RestService {

    private Map<String, String> env = System.getenv();
    private final String statURL = env.get("STAT_URL");
    private final String randNumURL = env.get("RAND_NUM_URL");
    private final String historyURL = env.get("HISTORY_URL");
    private RestTemplate restTemplate = new RestTemplate();

    public List<PodStat> getStatistics(){
        PodStat[] tmpStats = restTemplate.getForObject(statURL, PodStat[].class);
        return Arrays.asList(tmpStats);
    }

    public RandomNumber getRandomNumber(){
        return restTemplate.getForObject(randNumURL, RandomNumber.class);
    }

    public List<Series> getHistory(){
        Series[] series = restTemplate.getForObject(historyURL, Series[].class);
        return  Arrays.asList(series);
    }
}
