package it.hacker.sell.service;

import it.hacker.sell.dto.OrderDTO;

/**
 * 买家
 *
 * @author wqh
 * @date 18-10-22
 */
public interface BuyerService {
    /**
     * 查询一个订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
