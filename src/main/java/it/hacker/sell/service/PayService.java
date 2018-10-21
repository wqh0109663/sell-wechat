package it.hacker.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import it.hacker.sell.dto.OrderDTO;

/**
 * @author wqh
 * @date 18-10-21
 */
public interface PayService {
    /**
     *
     * @param orderDTO
     * @return
     */
    PayResponse create(OrderDTO orderDTO);

    /**
     *
     * @param notifyData
     * @return
     */
    PayResponse notify(String notifyData);

    /**
     *
     * @param orderDTO
     * @return
     */
    RefundResponse refund(OrderDTO orderDTO);
}
