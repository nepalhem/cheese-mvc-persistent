package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by hemnepal on 4/17/17.
 */
@Repository
@Transactional

public interface CategoryDao extends CrudRepository<Category, Integer> {
}
