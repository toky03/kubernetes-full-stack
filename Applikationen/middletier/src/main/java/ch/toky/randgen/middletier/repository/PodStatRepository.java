package ch.toky.randgen.middletier.repository;

import ch.toky.randgen.middletier.model.PodStat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodStatRepository extends CrudRepository<PodStat, String> {


    @Query("Select count(ps.id) from PodStat ps where ps.id = ?1")
    Long countUniqueId( String id);

    @Query("Select count(ps.id) from PodStat ps")
    Long findMaxCount();

}
