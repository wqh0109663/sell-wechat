package it.hacker.sell.repository;

import it.hacker.sell.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wqh
 * @date 18-10-19
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    /**
     * 根据类目编号来查
     * @param list 类目集合
     * @return 查询到的ProductCategory集合
     */
    List<ProductCategory> findByCategoryIdIn(List<Integer> list);
}
