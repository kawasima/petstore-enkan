package petstore.controller;

import enkan.component.BeansConverter;
import enkan.component.doma2.DomaProvider;
import petstore.dao.CategoryDao;
import petstore.entity.Category;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author kawasima
 */
public class CategoryController {
    @Inject
    private DomaProvider daoProvider;

    @Inject
    private BeansConverter beansConverter;

    public List<Category> findAll() {
        CategoryDao categoryDao = daoProvider.getDao(CategoryDao.class);
        return categoryDao.findAll();
    }

    @Transactional
    public petstore.model.Category create(petstore.model.Category categoryArg) {
        Category category = beansConverter.createFrom(categoryArg, Category.class);
        CategoryDao categoryDao = daoProvider.getDao(CategoryDao.class);
        categoryDao.insert(category);
        categoryArg.setId(category.getId());
        return categoryArg;
    }

    @Transactional
    public petstore.model.Category update(petstore.model.Category categoryArg) {
        Category category = beansConverter.createFrom(categoryArg, Category.class);
        CategoryDao categoryDao = daoProvider.getDao(CategoryDao.class);
        categoryDao.update(category);
        categoryArg.setId(category.getId());
        return categoryArg;
    }

}
