package it.hacker.sell.converter;

import it.hacker.sell.dto.OrderDTO;
import it.hacker.sell.entity.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wqh
 * @date 18-10-21
 */
public class OrderMasterToOrderDtoConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(OrderMasterToOrderDtoConverter::convert
        ).collect(Collectors.toList());
    }
}
