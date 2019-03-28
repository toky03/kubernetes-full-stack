package ch.toky.randgen.statservice.repository;

import ch.toky.randgen.statservice.model.PodStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PodStatRepository extends JpaRepository<PodStat, String> {

    @Query("SELECT count(pd.id) FROM PodStat pd WHERE pd.id = ?1")
    Long countUniqueId(String id);

    @Query("SELECT distinct ps.id FROM PodStat ps")
    List<String> findUniqueIds();

    @Query("SELECT ps from PodStat ps WHERE ps.id = ?1")
    List<PodStat> findByIds(String id);


}
