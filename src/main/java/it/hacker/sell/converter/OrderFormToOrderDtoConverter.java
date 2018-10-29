package it.hacker.sell.converter;

import com.google.gson.Gson;
import it.hacker.sell.dto.OrderDTO;
import it.hacker.sell.entity.OrderDetail;
import it.hacker.sell.enums.ResultEnum;
import it.hacker.sell.exception.SellException;
import it.hacker.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wqh
 * @date 18-10-22
 */
@Slf4j
public class OrderFormToOrderDtoConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误, string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
