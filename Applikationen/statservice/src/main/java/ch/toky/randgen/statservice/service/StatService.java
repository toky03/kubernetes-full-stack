package ch.toky.randgen.statservice.service;

import ch.toky.randgen.statservice.model.PodStat;
import ch.toky.randgen.statservice.model.Series;
import ch.toky.randgen.statservice.model.SeriesItem;
import ch.toky.randgen.statservice.model.Stat;
import ch.toky.randgen.statservice.repository.PodStatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StatService {

    @Autowired
    PodStatRepository podStatRepository;

    private Iterable<String> getAllIds(){
        Iterable<String> source = podStatRepository.findUniqueIds();

        return source;
    }

    public List<Stat> getAllPodStats(){
        Iterable<String> source = getAllIds();
        List<Stat> podStatistics = new ArrayList<Stat>();

        source.forEach( id -> {
            podStatistics.add(new Stat(id, podStatRepository.countUniqueId(id)));

        });

        return podStatistics;
    }

    public List<Series> getPodHistory(){
        List<PodStat> source = podStatRepository.findAll();

        Map<String, Series> podHistorys = new HashMap<>();
        source.forEach( entry ->{
            if(podHistorys.get(entry.getId()) == null){
                podHistorys.put(entry.getId(), new Series(entry.getId()));
            }
            podHistorys.get(entry.getId()).appendSeriesItem(new SeriesItem(entry.getTimestamp(), entry.getCounter()));

        });

        List<Series> plainSeries = new ArrayList<>(podHistorys.values());

        return plainSeries;

    }
}
