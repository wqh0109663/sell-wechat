package it.hacker.sell.service;

import it.hacker.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author wqh
 * @date 18-10-21
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO 订单传输对象
     * @return 订单传输对象
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询单个订单
     * @param orderId 订单id
     * @return 订单传输对象
     */
    OrderDTO findOne(String orderId);

    /**
     * 查询订单列表
     * @param buyerOpenid 买家微信openID
     * @param pageable 分页
     * @return 分页订单传输对象
     */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /**
     * 取消订单
     * @param orderDTO 订单传输对象
     * @return 订单传输对象
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完结订单
     * @param orderDTO 订单传输对象
     * @return 订单传输对象
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     * @param orderDTO 订单传输对象
     * @return 订单传输对象
     */
    OrderDTO paid(OrderDTO orderDTO);

    /**
     * 查询订单列表
     * @param pageable 分页
     * @return 分页订单传输对象
     */
    Page<OrderDTO> findList(Pageable pageable);



}
