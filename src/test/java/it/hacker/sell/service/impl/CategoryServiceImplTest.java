package it.hacker.sell.service.impl;

import it.hacker.sell.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author wqh
 * @date 18-10-19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Resource
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory result = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),result.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> results = categoryService.findAll();
        Assert.assertNotEquals(0,results.size());
    }

    @Test
    public void findByCategoryIdIn() {
        List<ProductCategory> results = categoryService.findByCategoryIdIn(Arrays.asList(1, 2));
        Assert.assertNotEquals(0,results.size());
    }

    @Test
    public void save() {
        ProductCategory result = categoryService.save(new ProductCategory("男生最爱", 3));
        Assert.assertNotNull(result);
    }
}