package org.aghiprac.banqP.surgery;

import java.util.List;
import java.util.Optional;

import org.aghiprac.banqP.entities.Surgery;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long>{

	
}
