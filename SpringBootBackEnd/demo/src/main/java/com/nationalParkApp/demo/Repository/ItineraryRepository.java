package com.nationalParkApp.demo.Repository;

import com.nationalParkApp.demo.entity.ItineraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItineraryRepository extends JpaRepository<ItineraryEntity, Long> {
}
