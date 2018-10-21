package it.hacker.sell.enums;

import lombok.Getter;

/**
 * @author wqh
 * @date 18-10-21
 */
@Getter
public enum OrderStatusEnum  implements CodeEnum{
    /**
     * 0,表示新订单
     */
    NEW(0, "新订单"),
    /**
     * 1,表示完结
     */
    FINISHED(1, "完结"),
    /**
     * 2,表示已取消
     */
    CANCEL(2, "已取消"),
    ;

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
