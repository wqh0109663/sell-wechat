package it.hacker.sell.repository;

import it.hacker.sell.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wqh
 * @date 18-10-19
 */
public interface ProductInfoRepository  extends JpaRepository<ProductInfo, String> {
    /**
     * 根据商品状态来查商品信息
     * @param productStatus 商品状态
     * @return 查询到的ProductInfo集合
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);



}
