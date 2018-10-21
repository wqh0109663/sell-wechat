package it.hacker.sell.repository;

import it.hacker.sell.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * @author wqh
 * @date 18-10-19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Resource
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory category = repository.findOne(1);
        System.out.println(category);
    }
    @Test
    @Transactional
    public void saveTest(){
        ProductCategory category = new ProductCategory("女生最爱", 2);
        ProductCategory saveResult = repository.save(category);
        Assert.assertNotNull(saveResult);
    }

    @Test
    public void findByCategoryIdInTest(){
        List<ProductCategory> results = repository.findByCategoryIdIn(Arrays.asList(1, 2, 3));
        Assert.assertNotEquals(0,results.size());
    }
}