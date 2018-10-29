package it.hacker.sell.controller;

import it.hacker.sell.service.OrderService;
import it.hacker.sell.service.PayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author wqh
 * @date 18-10-29
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @Resource
    private OrderService orderService;

    @Resource
    private PayService payService;

//    @GetMapping("/create")
//    public ModelAndView create(@RequestParam("orderId") String orderId,
//                               @RequestParam("returnUrl") String returnUrl,
//                               Map<String, Object> map) {
//        //1. 查询订单
//        OrderDTO orderDTO = orderService.findOne(orderId);
//        if (orderDTO == null) {
//            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
//        }
//
//        //2. 发起支付
//        PayResponse payResponse = payService.create(orderDTO);
//
//        map.put("payResponse", payResponse);
//        map.put("returnUrl", returnUrl);
//
//        return new ModelAndView("pay/create", map);
//    }



}
