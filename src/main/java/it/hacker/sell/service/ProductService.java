package it.hacker.sell.service;

import it.hacker.sell.dto.CartDTO;
import it.hacker.sell.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author wqh
 * @date 18-10-20
 */
public interface ProductService {
    /**
     * 根据商品id查找商品
     * @param productId 商品id
     * @return 商品
     */
    ProductInfo findOne(String productId);

    /**
     * 查找所有上架商品
     * @return 所有上架商品
     */
    List<ProductInfo> findUpAll();

    /**
     * 查找所有商品
     * @param pageable 分页对象
     * @return 分页的商品
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 添加商品
     * @param productInfo 商品
     * @return 被添加的商品
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     * @param cartDTOList
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     * @param cartDTOList cartDTOList集合
     */
    void decreaseStock(List<CartDTO> cartDTOList);

    /**
     * 上架
     * @param productId
     * @return
     */
    ProductInfo onSale(String productId);

    /**
     * 下架
     * @param productId
     * @return
     */
    ProductInfo offSale(String productId);

}
