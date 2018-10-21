package it.hacker.sell.service.impl;

import it.hacker.sell.entity.ProductCategory;
import it.hacker.sell.repository.ProductCategoryRepository;
import it.hacker.sell.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**类目
 * @author wqh
 * @date 18-10-19
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryIdIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryIdIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
