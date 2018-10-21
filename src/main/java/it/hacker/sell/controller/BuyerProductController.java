package it.hacker.sell.controller;

import it.hacker.sell.entity.ProductCategory;
import it.hacker.sell.entity.ProductInfo;
import it.hacker.sell.service.CategoryService;
import it.hacker.sell.service.ProductService;
import it.hacker.sell.utils.ResultVOUtil;
import it.hacker.sell.vo.ProductInfoVO;
import it.hacker.sell.vo.ProductVO;
import it.hacker.sell.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wqh
 * @date 18-10-20
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Resource
    private CategoryService categoryService;
    @Resource
    private ProductService productService;

    /**
     * @return 查询所有上架的商品
     */
    @RequestMapping("/list")
    public ResultVO list() {
        /* 查询所有上架的商品*/
        List<ProductInfo> upAll = productService.findUpAll();
        /*查询类目*/
        ArrayList<Integer> integers = new ArrayList<>();
        for (ProductInfo productInfo : upAll) {
            integers.add(productInfo.getCategoryType());
        }
        List<ProductCategory> categoryIdIn = categoryService.findByCategoryIdIn(integers);

        /*数据拼装 */
        ArrayList<ProductVO> productVOArrayList = new ArrayList<>();
        for (ProductCategory productCategory : categoryIdIn) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVO> infoVOArrayList = new ArrayList<>();
            for (ProductInfo productInfo : upAll) {
                if (productCategory.getCategoryType().equals(productInfo.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    infoVOArrayList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(infoVOArrayList);
            productVOArrayList.add(productVO);
        }
        return ResultVOUtil.success(productVOArrayList);
    }
}
