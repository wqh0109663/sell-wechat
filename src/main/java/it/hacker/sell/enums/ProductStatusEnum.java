package it.hacker.sell.enums;

import lombok.Getter;

/**商品状态
 * @author wqh
 * @date 18-10-20
 */
@Getter

public enum ProductStatusEnum {
    /**
     * 0,表示在架
     */
    UP(0,"在架"),
    /**
     * 1表示已经下架
     */
    Down(1,"下架")
    ;


    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
