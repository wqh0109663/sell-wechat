package it.hacker.sell.repository;

import it.hacker.sell.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wqh
 * @date 18-10-21
 */
public interface OrderDetailRepository  extends JpaRepository<OrderDetail,String> {
    /**
     * 根据订单id来查订单详情
     * @param orderId 买家订单id
     * @return 订单详情集合
     */
    List<OrderDetail>  findByOrderId(String orderId);



}
