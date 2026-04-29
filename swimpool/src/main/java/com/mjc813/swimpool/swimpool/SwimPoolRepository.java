package com.mjc813.swimpool.swimpool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwimPoolRepository extends JpaRepository<SwimPoolEntity, Long> {
}
