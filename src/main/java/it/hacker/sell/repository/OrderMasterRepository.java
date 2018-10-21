package it.hacker.sell.repository;

import it.hacker.sell.entity.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wqh
 * @date 18-10-21
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    /**
     * 根据买家微信openid查用户订单
     * @param openId 微信openid
     * @param pageable 分页
     * @return 分页的订单
     */
    Page<OrderMaster> findByBuyerOpenid(String openId, Pageable pageable);


}
