package it.hacker.sell.service;

import it.hacker.sell.entity.ProductCategory;

import java.util.List;

/**
 * @author wqh
 * @date 18-10-19
 */
public interface CategoryService {
    /**
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * @param categoryTypeList
     * @return
     */

    List<ProductCategory> findByCategoryIdIn(List<Integer> categoryTypeList);

    /**
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
